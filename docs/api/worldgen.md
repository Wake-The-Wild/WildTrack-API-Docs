# Generation-safe contexts

## Capture owned inputs

`worldgen().capture(WorldgenRequest)` creates a detached `WorldgenContext` from
chunks already supplied by your generation callback. Provide dimension,
`ObservationStage`, chunks, heightmaps and requested capabilities. WildTrack
never obtains an unprovided neighbor to satisfy a generation query.

Requests require at least `NOISE`, terrain and biome capabilities, at least one
heightmap, and 1–25 distinct chunks. `SURFACE` requires at least the `SURFACE`
stage. `SUBTERRANEAN` requires at least `CARVERS` and limits capture to nine
chunks because scanning underground block volumes has explicit cost.
The four-argument constructor derives default capabilities from the phase.

Context services include terrain, environment, surface, classification,
watercourses, subterranean data, placements and surface-candidate sampling.
Queries outside supplied evidence report missing/unknown data. They do not use
player render distance or mutable runtime cache contents to decide generation.

`context.candidates().surface(WorldgenSurfaceCandidateRequest)` samples bounded
surface candidates with radius, spacing, metric radius, Y offset, heightmap and
sample budget. Inspect completeness and missing chunks, then assess candidates
with `context.placements()`. The consumer still owns actual generation placement.

## Prepared feature contexts

Register required capabilities using
`requestAutomaticCapabilities(consumerId, capabilities)`. `automaticCapabilities()`
reports the effective capture set. The implementation prepares contexts after
vanilla terrain/carvers and before feature generation. `prepared(dimension, chunk)`
is optional and applies to a chunk currently running the supported generation
phase; it is not a permanent runtime lookup.

## Deterministic anchors

`planAnchor(WorldgenAnchorRequest)` derives an anchor from world seed, dimension,
rule identity, spacing and separation. `planAnchorsAround` collects bounded nearby
region plans. `planRelativeAnchor` provides deterministic distance relationships
through `WorldgenRelativeAnchorRequest` and its returned plan/status.

Use unique rule IDs and keep all generation inputs stable. Anchor planning chooses
candidates; it does not place a structure, register a feature or inspect unlimited
terrain. The same inputs must not be supplemented by whichever runtime chunks
happen to be loaded.

See [WorldgenCapture.java](../../examples/java/WorldgenCapture.java) and the
[worldgen reference](../reference/java/dev/wakethewild/wildtrack/api/worldgen/package-summary.md)
for every request/plan field and validation bound.
