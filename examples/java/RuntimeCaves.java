package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.runtime.*;
import dev.wakethewild.wildtrack.api.subterranean.*;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.ChunkPos;

public final class RuntimeCaves {
    public record CaveState(SubterraneanQueryResult result, SubterraneanScanProgress progress) { }

    public static RuntimeObservationLease request(ServerLevel level, ChunkPos center) {
        return WildTrackApi.get().runtimeObservations().request(
                RuntimeObservationDemand.subterranean(Identifier.parse("example:cave_observer"),
                        level.dimension(), center, 1, 200));
    }

    public static CaveState query(ServerLevel level, ChunkPos chunk) {
        SubterraneanService caves = WildTrackApi.get().subterranean();
        SubterraneanQuery query = new SubterraneanQuery(level.dimension(), chunk);
        return new CaveState(caves.query(query), caves.scanProgress(query));
    }
}
