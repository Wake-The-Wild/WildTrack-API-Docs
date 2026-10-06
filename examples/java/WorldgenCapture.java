package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.observation.ObservationStage;
import dev.wakethewild.wildtrack.api.worldgen.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.levelgen.Heightmap;
import java.util.List;
import java.util.Set;

public final class WorldgenCapture {
    public static WorldgenContext capture(ResourceKey<Level> dimension,
                                          List<? extends ChunkAccess> ownedChunks) {
        return WildTrackApi.get().worldgen().capture(new WorldgenRequest(
                dimension, ObservationStage.SURFACE, ownedChunks,
                Set.of(Heightmap.Types.WORLD_SURFACE),
                Set.of(WorldgenCapability.TERRAIN, WorldgenCapability.BIOMES,
                        WorldgenCapability.SURFACE)));
    }
}
