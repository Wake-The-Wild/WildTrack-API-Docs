# Terrain, biomes and surfaces

These three services read retained detached chunk snapshots. Queries use world
X/Z, a sample radius and the relevant heightmap where requested. Missing coverage
is returned explicitly; increasing a radius cannot manufacture observations.
Use small radii for frequent checks and share a query's result with your own
consumers instead of querying each measurement separately.

## Terrain

`terrain().query(TerrainQuery)` returns a status and an optional `TerrainProfile`.
The profile contains surface Y, sample radius, slope in degrees `[0,90]`, optional
aspect in degrees `[0,360)`, roughness, curvature and relative elevation.
Flat or insufficient directional evidence can leave aspect absent.

The runtime captures `WORLD_SURFACE`, `OCEAN_FLOOR`, `MOTION_BLOCKING` and
`MOTION_BLOCKING_NO_LEAVES` heightmaps. `HeightField` and samplers expose the
detached column view; do not confuse surface height with the block Y of a proposed
placement. Radius is measured in blocks and must be positive.

## Environment

`environment().query(EnvironmentQuery)` returns biome observations around a
surface column: center biome ID and tags, observed biome IDs, biome-boundary
strength `[0,1]` and sampled elevation range. `isBiomeBoundary()` checks whether
boundary strength is positive; it is evidence, not a worldgen biome replacement.
Modded biome IDs and tags are retained as namespaced identifiers.

## Surface

`surface().query(SurfaceQuery)` returns a center `SurfaceCell` plus canopy coverage,
canopy gap fraction, plant/wood/fluid/water coverage, average canopy depth, top
material fractions and observed block tags. Fractions describe the sampled area;
water coverage cannot exceed fluid coverage. Surface snapshots retain the
materials and tags observed when captured, not mutable live block states.

Select ground block/tag conditions when exact material matters; use fractions
for suitability. A low canopy fraction is different from missing surface data.
The [measurement example](../../examples/java/WorldMeasurements.java) queries all
three services and leaves interpretation to the consumer.
