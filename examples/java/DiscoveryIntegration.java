package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.discovery.*;
import dev.wakethewild.wildtrack.api.location.LocationTypeId;
import dev.wakethewild.wildtrack.api.query.LocationSelector;
import dev.wakethewild.wildtrack.api.spatial.DistanceMetric;
import net.minecraft.resources.Identifier;

public final class DiscoveryIntegration {
    public static DiscoverySubscription register(DiscoveryListener listener) {
        WildTrackApi api = WildTrackApi.get();
        api.discoveryPolicies().register(new DiscoveryPolicy(
                Identifier.parse("example:landmark_discovery"), DiscoveryScope.PLAYER,
                LocationSelector.type(new LocationTypeId(Identifier.parse("example:landmark"))),
                4.0, 7.0, DistanceMetric.EUCLIDEAN_3D, 0.8));
        return api.discoveries().listen(listener);
    }
}
