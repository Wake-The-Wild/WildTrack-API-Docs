# Providers, metadata and analyzers

## Publishing custom locations

Register a unique `ProviderDescriptor` using `providers().register(...)` and keep
the returned `LocationPublisher`. Descriptors declare a `ProviderId`, nonnegative
data version and capabilities. Duplicate provider ownership is rejected.
Publish `LocationObservation` values on the server thread, using stable namespaced
IDs, a location type, dimension, anchor, optional center, geometry, tags and metadata.

`upsert` inserts or replaces that provider's observation. `merge` atomically
publishes a canonical location and retires replaced IDs as aliases. `invalidate`
marks knowledge stale; `remove` removes the location. A publisher is a scoped
capability, not permission to overwrite another provider's records.

For source refresh, register one `LocationCoverageObserver` for your provider.
Its report must accurately distinguish available coverage, pending data and
budget exhaustion. Without an observer, coverage refresh is `UNSUPPORTED`.
Publishing alone does not register a Minecraft worldgen structure and does not
automatically make a location a WD discovery.

The [custom provider example](../../examples/java/CustomLocations.java) shows a
generic landmark. Choose stable IDs from persistent world identity; do not
generate a new random UUID every time a chunk is observed. Generic publisher
registration alone does not provide automatic disk persistence for your custom
records: the consumer must arrange reconstruction or durable storage.

## Typed metadata

Use `MetadataKey<T>` with a namespaced identifier and Mojang `Codec<T>`, then
`MetadataMap.builder().put(key, value).build()`. Read through `MetadataView.get`.
Keep value objects immutable. Provider-owned metadata is not automatically
sent to discovery clients; synchronized snapshots intentionally contain an
empty metadata view.

## Detached chunk analysis

`analyzers().register(descriptor, analyzer)` atomically registers provider
ownership and a `ChunkAnalysisProvider`. The analyzer's ID must identify its
provider. `AnalysisProfile` declares required observation stage, complexity and
retained snapshot needs. The callback receives `ChunkObservationSnapshot` and
`ObservationOutput` and may run on a worker.

Analyze only detached inputs, emit bounded observations, honor interruption and
avoid live world access. Publication happens back through the scheduler; stale
revisions cannot be treated as current output. `analyzers().stats()` reports
scheduler state. Chunk unload and changes are lifecycle boundaries, not permission
for an analyzer to force chunk loading. Current runtime analyzer snapshots contain
heightmaps and biomes, not full block-state volumes. A profile requiring
`BLOCK_STATES` will not be scheduled from that runtime snapshot. Block-state
methods are capability-gated contracts, not a promise that this path supplies them.

For all snapshot fields and analysis-profile options, use the
[observation package reference](../reference/java/dev/wakethewild/wildtrack/api/observation/package-summary.md).
