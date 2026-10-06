package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.condition.Condition;
import dev.wakethewild.wildtrack.api.placement.*;
import java.util.List;

public final class PlacementRules {
    public static PlacementBatchResult gentleSlopes(List<PlacementQuery> candidates) {
        return WildTrackApi.get().placement().evaluateBatch(
                candidates, TerrainConditions.slopeBetween(0.0, 12.0), 128);
    }

    public static Condition<PlacementContext> compile(String json) {
        return WildTrackApi.get().placementConditionDefinitions().compile(
                PlacementConditionDefinitionJsonCodec.decode(json));
    }
}
