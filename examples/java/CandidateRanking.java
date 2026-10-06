package example.wildtrack;

import dev.wakethewild.wildtrack.api.WildTrackApi;
import dev.wakethewild.wildtrack.api.placement.*;
import net.minecraft.resources.Identifier;
import java.util.List;

public final class CandidateRanking {
    public static PlacementAssessmentBatch assess(List<PlacementQuery> candidates) {
        PlacementRule rule = new PlacementRule(Identifier.parse("example:gentle_patch"),
                TerrainConditions.slopeBetween(0.0, 15.0),
                PlacementProfilePreferences.targetSlope(3.0, 12.0), UnknownPlacementPolicy.DEFER);
        return WildTrackApi.get().placement().assessBatch(candidates, rule, 128);
    }
}
