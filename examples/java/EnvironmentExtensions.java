package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.classification.*;
import net.minecraft.resources.Identifier;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public final class EnvironmentExtensions implements EnvironmentClassifier {
    private static final Identifier ID = Identifier.parse("example:rocky_shelf");

    @Override public Identifier id() { return ID; }

    @Override public List<EnvironmentClassification> classify(EnvironmentClassificationContext context) {
        if (context.terrain().profile().isEmpty() || context.surface().profile().isEmpty()) {
            return List.of(EnvironmentClassification.unknown(ID, ID, "required evidence missing"));
        }
        double roughness = context.terrain().profile().orElseThrow().roughness();
        double plantCoverage = context.surface().profile().orElseThrow().plantCoverage();
        double confidence = Math.max(0.0, Math.min(1.0, roughness / 5.0)) * (1.0 - plantCoverage);
        return List.of(new EnvironmentClassification(ID, ID, OptionalDouble.of(confidence),
                "rough exposed surface", Map.of("roughness", roughness, "plant_coverage", plantCoverage)));
    }

    public static void register() {
        WildTrackApi.get().environmentClassifiers().register(new EnvironmentExtensions());
    }
}
