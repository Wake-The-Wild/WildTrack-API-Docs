package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.worldgen.*;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ChunkPos;

public final class DeterministicAnchors {
    public static WorldgenAnchorPlan plan(long seed, ResourceKey<Level> dimension, ChunkPos candidate) {
        WorldgenAnchorRule rule = new WorldgenAnchorRule(
                Identifier.parse("example:landmark_spacing"), 137L, 32, 8);
        return WildTrackApi.get().worldgen().planAnchor(
                new WorldgenAnchorRequest(seed, dimension, candidate, rule));
    }
}
