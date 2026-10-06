package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.context.*;
import dev.wakethewild.wildtrack.api.placement.PlacementContext;
import net.minecraft.resources.Identifier;
import java.nio.charset.StandardCharsets;

public final class TypedContext {
    public static final ContextKey<String> SOIL = ContextKey.of(
            Identifier.parse("example:soil_family"), String.class);

    public static void register() {
        WildTrackApi api = WildTrackApi.get();
        api.contextKeys().register(SOIL, new ContextCodec<String>() {
            @Override public byte[] encode(String value) { return value.getBytes(StandardCharsets.UTF_8); }
            @Override public String decode(byte[] encoded) { return new String(encoded, StandardCharsets.UTF_8); }
        }, 64);
        api.placementContextContributors().register(new PlacementContextContributor() {
            @Override public Identifier id() { return Identifier.parse("example:soil_family"); }
            @Override public void contribute(PlacementContext context, ContextValueMap.Builder values) {
                context.surface().profile().ifPresent(surface -> values.put(SOIL,
                        surface.waterCoverage() > 0.25 ? "wet" : "dry"));
            }
        });
    }
}
