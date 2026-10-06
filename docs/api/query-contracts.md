# Knowledge and query contracts

## Three boundaries

World knowledge is the server's retained observations. Known geometry is the
observed portion of a location. Player-visible knowledge is the smaller projection
revealed by discovery policies. Neither a nearby indexed location nor a client
snapshot establishes that every surrounding chunk has been observed.

Runtime queries use retained observations. They do not generate terrain or
request missing chunks. `observeAvailable` is an explicit server-thread refresh
from available sources; it can publish data but does not load, generate or wait
for chunks. World generation uses a separate caller-owned input boundary.

## Status and completeness are different

| Signal | Meaning |
| --- | --- |
| `QueryStatus.COMPLETE` | Indexed query finished within its limits |
| `RESULT_LIMIT_REACHED` | Output reached the requested result limit |
| `BUDGET_EXHAUSTED` | Candidate or operation budget stopped work |
| `LocationCoverageStatus.AVAILABLE` | Requested source columns and references were available |
| `PENDING` | A source/reference is unavailable; absence cannot be established |
| `UNSUPPORTED` | Provider has no registered coverage observer |
| `BlockSearchStatus.INCOMPLETE` | A required available-world read could not be made |

Location geometry additionally reports `Completeness.PREDICTED`, `PARTIAL`,
`COMPLETE` or `INVALIDATED`, plus normalized `Confidence` in `[0,1]`.
`COMPLETE` is defined by the producing provider. A complete index query does not
mean complete world coverage. Check service-specific statuses, optional profiles
and missing frontiers as well; their exact enums are in the Java reference.

When evidence is unavailable, retry later or keep the last valid state. Do not
translate missing data into “no structure”, “no cave” or a failed placement.
Filter authoritative decisions to the completeness/confidence you require.

## Geometry and distance

Location selectors combine nonempty type/provider filters with AND; a nonempty
tag set matches any shared tag. Empty sets are unrestricted. Query geometry
defaults to `KNOWN_GEOMETRY`, using known fragments. `ENVELOPE` uses enclosing
acceleration bounds, including gaps and provider margins. It is useful for
candidate collection but must not be mistaken for exact containment.

Distance is the shortest distance to the selected geometry view. Choose the
public `DistanceMetric` explicitly; block/chunk positions are world coordinates,
not chunk-local coordinates unless a snapshot method says otherwise. Structure
`START_BOUNDS` is Minecraft's actual adjusted start AABB, with exclusive maxima.

Retain `LocationId`, not an old envelope, when a region may grow. Merged IDs are
resolved through aliases. A removed location and an invalidated location are
different states; custom providers own their lifecycle.

## Threads and ownership

Queries and provider publication involving live server levels belong on the
server thread. Analyzer callbacks may run on workers and may use only their
detached snapshot and output collector; honor interruption. Do not capture a
live level or chunk in an analyzer, classifier or context contributor.

API containers copy their collections, but consumer values submitted through
metadata/context interfaces must themselves be safe to retain. A record wrapper
does not make a mutable object deeply immutable. Worldgen capture reads only
chunks supplied by the caller on the generation thread that owns them.
