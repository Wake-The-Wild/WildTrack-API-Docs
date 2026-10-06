package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.query.*;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;

public final class BlockPatterns {
    public static BlockSearchResult findWaterOverSand(ServerLevel level, BlockPos center) {
        return WildTrackApi.get().blockSearch().findFirst(level, new BlockSearchQuery(
                center.offset(-4, -2, -4), center.offset(4, 2, 4), 405, 1024,
                (view, origin) -> view.is(origin, Blocks.WATER)
                        && view.is(origin.below(), Blocks.SAND)));
    }
}
