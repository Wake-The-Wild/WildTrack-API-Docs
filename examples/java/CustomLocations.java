package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.knowledge.*;
import dev.wakethewild.wildtrack.api.location.*;
import dev.wakethewild.wildtrack.api.metadata.MetadataMap;
import dev.wakethewild.wildtrack.api.provider.*;
import dev.wakethewild.wildtrack.api.spatial.BoxGeometry;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.phys.AABB;
import java.util.Optional;
import java.util.Set;

public final class CustomLocations {
    public static LocationPublisher register() {
        return WildTrackApi.get().providers().register(new ProviderDescriptor(
                new ProviderId(Identifier.parse("example:landmarks")), 1,
                Set.of(ProviderCapability.PUBLISH_LOCATIONS)));
    }

    public static void publish(LocationPublisher publisher, ServerLevel level,
                               Identifier stableId, BlockPos center, AABB bounds) {
        publisher.upsert(new LocationObservation(new LocationId(stableId),
                new LocationTypeId(Identifier.parse("example:landmark")), level.dimension(),
                center.immutable(), Optional.of(center.immutable()),
                new BoxGeometry(bounds, Completeness.COMPLETE, Confidence.certain()),
                Set.of(Identifier.parse("example:landmark")), MetadataMap.empty()));
    }
}
