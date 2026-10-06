package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.location.VanillaStructureLocations;
import dev.wakethewild.wildtrack.api.provider.ProviderId;
import dev.wakethewild.wildtrack.api.query.*;
import dev.wakethewild.wildtrack.api.spatial.DistanceMetric;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.phys.Vec3;
import java.util.Set;

public final class StructureQueries {
    public record ObservedQuery(LocationCoverageReport coverage, LocationQueryResult result) { }

    public static ObservedQuery nearby(ServerLevel level, Vec3 position) {
        WildTrackApi api = WildTrackApi.get();
        net.minecraft.core.BlockPos block = net.minecraft.core.BlockPos.containing(position);
        ChunkPos chunk = new ChunkPos(Math.floorDiv(block.getX(), 16), Math.floorDiv(block.getZ(), 16));
        ProviderId provider = VanillaStructureLocations.PROVIDER;
        LocationCoverageReport coverage = api.locations().observeAvailable(level,
                new LocationCoverageQuery(provider, chunk.x() - 1, chunk.z() - 1,
                        chunk.x() + 1, chunk.z() + 1, 9, 1024));
        LocationSelector selector = new LocationSelector(
                Set.of(VanillaStructureLocations.STRUCTURE), Set.of(provider), Set.of());
        LocationQuery query = LocationQuery.builder().selector(selector).origin(position)
                .within(32.0, DistanceMetric.EUCLIDEAN_3D)
                .limit(32).candidateBudget(1024).build();
        return new ObservedQuery(coverage, api.locations().query(level, query));
    }
}
