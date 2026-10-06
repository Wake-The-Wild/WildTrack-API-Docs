# Subterranean observations

## Profiles and lifecycle

`subterranean().query(new SubterraneanQuery(dimension, chunk))` returns an
optional profile and status. `scanProgress` distinguishes unknown data from work
that is queued, being captured/analyzed or available. Capture is spread over
bounded server ticks; analysis consumes detached volume data. A requested profile
does not synchronously scan or load a missing chunk.

`SubterraneanProfile` records analyzed underground blocks, air/deep-air/fluid
counts, boundary air, connected void counts, largest-void size and optional
shape, surface-connected components, entrance-column candidates, opening masks,
air-height bounds, fractions, revision and content fingerprint.

`hasCaveCandidate()` currently requires at least 64 deep-air blocks, a largest
void of at least 64 blocks and underground air fraction at least 0.01.
`hasEntranceCandidate()` requires surface-connected voids and entrance columns.
These are observations/candidates, not a promise that a player can navigate a
complete cave system from the returned column.

## Connectivity and regions

`connectivity(query)` requires a center profile and reports neighbor connections
with unresolved topology. `region(SubterraneanRegionQuery)` joins retained
profiles within a bounded query. Shapes describe local void bounds and morphology;
boundary components/openings determine cross-chunk connectivity. Water context,
entrance regions and missing frontiers remain explicit.

`nearestEntrance(EntranceProximityQuery)` searches retained entrance candidates
within a horizontal distance. Inspect both the optional match and completeness:
a nearest known entrance is not necessarily the nearest entrance in missing chunks.
None of these operations load or generate chunks.

## Temporary observation demand

`runtimeObservations().request(RuntimeObservationDemand.subterranean(owner,
dimension, center, radius, durationTicks))` returns a `RuntimeObservationLease`.
Keep its UUID, renew it while needed, and cancel it when the consumer closes.
The lease asks for analysis of already-loaded chunks; it is not a chunk ticket.
Expiry uses WildTrack's monotonic server tick clock. Capacity or invalid bounds
can throw; do not issue a new lease every frame or tick.

Read `limits()` instead of hard-coding capacities. The documented build permits 128
leases globally, 16 per owner, radius at most 4 chunks, duration at most 1200 ticks,
and 256 active demanded chunks. A live lease does not mean every target already
has a complete profile. Retry queries as scanning progresses.

Player-centered runtime coverage also operates automatically over already-loaded
chunks. This means subterranean analysis is not exclusively demand-triggered.
Generation-time capture is separate and explicitly requested; see [worldgen](worldgen.md).
