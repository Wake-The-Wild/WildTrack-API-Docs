# Placement conditions and ranking

WildTrack evaluates placement; the consumer performs any actual block or feature
placement. `placement().query(PlacementQuery)` collects detached terrain,
environment, surface, watercourse, subterranean and extension context for one
candidate. `evaluate` applies a `Condition<PlacementContext>` and returns an
explanation tree with `PASS`, `FAIL` or `UNKNOWN`.

Compose conditions with `Conditions` and use the supplied `TerrainConditions`,
`EnvironmentConditions`, `SurfaceConditions`, `WatercourseConditions`,
`SubterraneanConditions`, `ClassificationConditions` and `ContextConditions` helpers.
Their exact overloads and measurements are in the Java reference.

`decide(query, condition, UnknownPlacementPolicy)` makes missing-evidence policy
explicit. Choose the enum value appropriate for your consumer; do not silently
reinterpret unknown evidence as an ordinary failed condition.

Preferences provide explainable soft suitability rather than hard acceptance.
`PlacementProfilePreferences` and `PlacementPreferences` expose the built-in
scoring helpers. Optional scores can
remain unknown. In particular, `weightedAverage` propagates a missing child
score rather than inventing a score for that child.

`evaluateBatch` processes candidates in input order up to the evaluation budget.
`assessBatch` evaluates requirements and preferences once per candidate and returns
bounded assessments. `acceptedByScore()` supplies ranked accepted candidates.
Inspect how many input candidates were evaluated before using an incomplete batch
as a global best-match search. Preserve stable input order for deterministic ties.

A `PlacementRule` groups an ID, hard condition, preference and unknown policy.
Register/retrieve reusable rules through `placementRules()`. Registration does
not schedule placement or automatically create a worldgen feature.

See [PlacementRules.java](../../examples/java/PlacementRules.java) and
[data-facing definitions](condition-definitions.md). Worldgen contexts expose
their own `placements()` bound to generation inputs; runtime caches must not
decide deterministic generation.
