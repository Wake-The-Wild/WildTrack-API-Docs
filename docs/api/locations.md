# Locations and structure recognition

## Query workflow

Build a `LocationQuery` with a dimension supplied by `ServerLevel`, selector,
origin/distance or intersection, geometry mode, accepted completeness, confidence,
result limit and candidate budget. Use `locations().query(level, query)` and inspect
both the returned list and `QueryStatus`. `findById` resolves retained merge aliases.

For current structure coverage, first call `observeAvailable` with
`VanillaStructureLocations.PROVIDER` and an inclusive chunk rectangle. Separate
source coverage from the subsequent read-only index query. Limit both source
chunks and reference visits. See the [complete example](../../examples/java/StructureQueries.java).

## Built-in sources

| Source | Public contract | Information |
| --- | --- | --- |
| Minecraft structures | `VanillaStructureLocations` | Starts, pieces, actual bounds, structure ID, start chunk, piece type/index/count |
| Minecraft POIs | `VanillaPoiLocations` | Known point-of-interest observations |
| Biome regions | `VanillaBiomeRegions` | Connected observed biome-region geometry and merge aliases |
| Semantic environment regions | `EnvironmentRegions` | Classified connected cells and boundary evidence |

Despite the name “vanilla”, the structure adapter reads Minecraft's structure
registry and starts: normally registered modded structures use the same path.
It does not recognize a schematic placed as unrelated blocks, a placed feature,
or a private third-party structure system solely by appearance.

`VanillaStructureLocations.STRUCTURE` selects whole starts; `PIECE` selects
individual pieces. `START_BOUNDS` differs from an acceleration envelope.
`STRUCTURE_ID` contains the registered namespaced ID. Provider constants and all
typed metadata keys are listed in the Java reference. Structures referenced by an
available chunk may still need their start chunk to become available.

## Bounded block patterns

Use `blockSearch().findFirst(level, new BlockSearchQuery(minimum, maximum,
candidateBudget, readBudget, pattern))` for a consumer-defined feature pattern.
Both bounds are inclusive. Candidates are visited in ascending Y, then X, then Z.
The `BlockSearchView` exposes optional block states and biomes from available
chunks. It is scoped to the query and must not be retained.

An unavailable read stops the search as `INCOMPLETE`, preserving the first-match
ordering instead of skipping to a later candidate. Work exhaustion returns
`BUDGET_EXHAUSTED`. A `COMPLETE` result without a match establishes only that the
bounded requested pattern was not found, not absence elsewhere.

WildTrack executes the bounded search; the consuming mod owns the pattern and
the meaning of a match. WD's desert-well pattern belongs to WD, not the API.
See [BlockPatterns.java](../../examples/java/BlockPatterns.java).
