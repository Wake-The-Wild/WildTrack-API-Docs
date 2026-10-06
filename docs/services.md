# Service overview

`WildTrackApi.get()` exposes the following service accessors. Each accessor is
covered by the linked guide and by the exact [Java reference](reference/README.md).

| Accessor | Responsibility | Guide |
| --- | --- | --- |
| `locations()` | Query indexed locations, resolve aliases, explicitly observe available sources | [Locations](api/locations.md) |
| `blockSearch()` | Bounded consumer-defined block-pattern matching | [Locations](api/locations.md) |
| `providers()` | Register provider-owned location publishers and coverage observers | [Providers](api/providers.md) |
| `analyzers()` | Register detached chunk analyzers; scheduler statistics | [Providers](api/providers.md) |
| `terrain()` | Heights and local terrain measurements | [Environment](api/environment.md) |
| `environment()` | Biomes, tags and boundary evidence | [Environment](api/environment.md) |
| `surface()` | Materials, vegetation, canopy and water coverage | [Environment](api/environment.md) |
| `classifications()` | Explainable semantic environment classification | [Classification](api/classification.md) |
| `environmentClassifiers()` | Register independent classifiers | [Classification](api/classification.md) |
| `environmentRegions()` | Joined semantic region observations and statistics | [Classification](api/classification.md) |
| `watercourses()` | Chunk fragments and cross-chunk river corridors | [Classification](api/classification.md) |
| `subterranean()` | Cave profiles, progress, entrances and connectivity | [Subterranean](api/subterranean.md) |
| `runtimeObservations()` | Temporary demand for analysis of already-loaded chunks | [Subterranean](api/subterranean.md) |
| `placement()` | Context, conditions, decisions and bounded candidate ranking | [Placement](api/placement.md) |
| `placementRules()` | Namespaced reusable rule registry | [Placement](api/placement.md) |
| `placementConditionDefinitions()` | Compile registered data-facing condition trees | [Definitions](api/condition-definitions.md) |
| `contextKeys()` | Typed keys and bounded codecs | [Context](api/context.md) |
| `placementContextContributors()` | Add consumer-owned values to detached contexts | [Context](api/context.md) |
| `worldgen()` | Phase-safe contexts, prepared feature contexts and deterministic anchors | [Worldgen](api/worldgen.md) |
| `discoveries()` | Server discovery state, queries and subscriptions | [Discovery](api/discovery.md) |
| `discoveryPolicies()` | Automatic discovery policy registry | [Discovery](api/discovery.md) |
| `storageData()` | Versioned bounded extension payload codecs | [Storage](api/storage-data.md) |

`WildTrackClientApi.get().discoveries()` exposes only the discovery snapshots
revealed to the current connection. It does not provide the server query services.
