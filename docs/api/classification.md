# Classification, environment regions and watercourses

## Explainable classification

`classifications().classify(EnvironmentClassificationQuery)` combines detached
terrain, environment and surface evidence through registered classifiers.
Each `EnvironmentClassification` identifies its classifier and environment type,
optional confidence, explanation and numeric evidence. An absent confidence
represents unknown evidence, not a zero-confidence negative classification.

Built-in semantic type IDs are `wildtrack:forest`, `meadow`, `open_area`, `ridge`,
`valley`, `wetland`, `coastline` and `river`. These are heuristic semantic
measurements; they do not replace Minecraft biome IDs or promise a geometrically
exact forest/coast border.

Register an `EnvironmentClassifier` through `environmentClassifiers()` with
unique namespaced classifier/type IDs. Read only `EnvironmentClassificationContext`;
return explicit unknown evidence when required profiles are absent. See the
[classifier example](../../examples/java/EnvironmentExtensions.java).

## Connected regions

`environmentRegions()` tracks classified chunk cells and joins compatible
observations using boundary evidence. `EnvironmentRegions` defines public
provider/type/metadata identities. The region service exposes statistics; its
published locations are queried through the ordinary location service.
`cell(dimension, chunk)` and `atBlock(dimension, x, z)` expose membership signals;
`stats()` reports retained/assembled observations.
Regions may grow or merge as observations arrive. Use their stable IDs and
resolve aliases rather than persisting an old set of bounds as authoritative.
The current membership threshold is `0.55`; it is an implementation budget/value,
not a configurable datapack setting.

## Watercourses

`watercourses().query(dimension, chunk)` provides a `WatercourseFragment` with
confidence, water geometry and boundary evidence. `region(WatercourseRegionQuery)`
assembles observed neighboring fragments into a bounded connected corridor.
Inspect query status, frontiers and missing chunks. A partial corridor must not
be treated as the full extent of a river.

Recognition combines surface-water evidence with biome context. Width and
confidence can be used by `WatercourseConditions` and `PlacementProfilePreferences`.
Worldgen contexts expose equivalent observations from their caller-owned region.
Neither runtime nor generation queries fetch an unprovided neighbor to complete
a river. See the exact [classification package](../reference/java/dev/wakethewild/wildtrack/api/classification/package-summary.md)
for fragment, frontier and region fields.
