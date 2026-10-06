package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.environment.*;
import dev.wakethewild.wildtrack.api.surface.*;
import dev.wakethewild.wildtrack.api.terrain.*;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.levelgen.Heightmap;

public final class WorldMeasurements {
    public record Measurements(TerrainQueryResult terrain, EnvironmentQueryResult environment,
                               SurfaceQueryResult surface) { }

    public static Measurements query(ServerLevel level, int x, int z) {
        WildTrackApi api = WildTrackApi.get();
        return new Measurements(
                api.terrain().query(new TerrainQuery(level.dimension(), x, z, 4,
                        Heightmap.Types.WORLD_SURFACE)),
                api.environment().query(new EnvironmentQuery(level.dimension(), x, z, 4)),
                api.surface().query(new SurfaceQuery(level.dimension(), x, z, 4)));
    }
}
