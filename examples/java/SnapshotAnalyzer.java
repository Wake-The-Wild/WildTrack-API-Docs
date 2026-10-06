package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.knowledge.*;
import dev.wakethewild.wildtrack.api.location.*;
import dev.wakethewild.wildtrack.api.metadata.MetadataMap;
import dev.wakethewild.wildtrack.api.observation.*;
import dev.wakethewild.wildtrack.api.provider.*;
import dev.wakethewild.wildtrack.api.spatial.BoxGeometry;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;
import java.util.Optional;
import java.util.Set;

public final class SnapshotAnalyzer implements ChunkAnalysisProvider {
    private static final ProviderId PROVIDER = new ProviderId(Identifier.parse("example:high_columns"));

    @Override public ProviderId id() { return PROVIDER; }
    @Override public AnalysisProfile profile() {
        return new AnalysisProfile(ObservationStage.COMPLETE, AnalysisComplexity.LIGHT, false, false, true);
    }
    @Override public void analyze(ChunkObservationSnapshot snapshot, ObservationOutput output) {
        if (Thread.currentThread().isInterrupted()) return;
        int y = snapshot.height(Heightmap.Types.WORLD_SURFACE, 8, 8);
        if (y < 100) return;
        int x = snapshot.chunkPosition().getMinBlockX() + 8;
        int z = snapshot.chunkPosition().getMinBlockZ() + 8;
        BlockPos center = new BlockPos(x, y, z);
        String dimension = snapshot.dimension().identifier().getNamespace() + "/"
                + snapshot.dimension().identifier().getPath();
        LocationId id = new LocationId(Identifier.parse("example:high_column/" + dimension + "/" + x + "/" + z));
        output.publish(new LocationObservation(id, new LocationTypeId(Identifier.parse("example:high_column")),
                snapshot.dimension(), center, Optional.of(center),
                new BoxGeometry(new AABB(x, y, z, x + 1, y + 1, z + 1),
                        Completeness.COMPLETE, Confidence.certain()), Set.of(), MetadataMap.empty()));
    }
    public static void register() {
        WildTrackApi.get().analyzers().register(new ProviderDescriptor(PROVIDER, 1,
                Set.of(ProviderCapability.PUBLISH_LOCATIONS, ProviderCapability.LOADED_CHUNK_ANALYSIS)),
                new SnapshotAnalyzer());
    }
}
