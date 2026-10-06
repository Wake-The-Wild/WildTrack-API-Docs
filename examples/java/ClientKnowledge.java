package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackClientApi;
import dev.wakethewild.wildtrack.api.location.LocationSnapshot;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import java.util.List;

@Environment(EnvType.CLIENT)
public final class ClientKnowledge {
    public static List<LocationSnapshot> revealed() {
        return WildTrackClientApi.get().discoveries().snapshots();
    }
}
