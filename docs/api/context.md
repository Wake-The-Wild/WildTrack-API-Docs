# Typed placement context extensions

Create a namespaced `ContextKey<T>` with its value class. Register it through
`contextKeys()` with a `ContextCodec<T>` and a maximum encoded byte count.
The registry guards IDs, types and encoded sizes; a consumer must not register
the same ID twice or assume another mod uses its private value class.

Register a `PlacementContextContributor` with its own namespaced ID through
`placementContextContributors()`. It receives the detached placement context and
`ContextValueMap.Builder`. Contribute measurements computed from that context;
do not fetch live chunks to fill a missing input. The completed map is immutable.

Use `ContextConditions.equalTo` or `matches` to consume a contributed value in
an ordinary explainable condition. Missing values return `UNKNOWN`. Keys, value
maps and `ContextValueMapBinaryCodec` provide an explicit bounded serialization
boundary; they are not a disk database or a general object serialization system.

Worldgen capture snapshots the ordered contributor list, preventing later
registrations from changing a context already being used for generation.
Contributors/codecs should have no mutable world-global state and should produce
the same values for the same detached evidence.

See the complete [typed context example](../../examples/java/TypedContext.java)
and the [context package reference](../reference/java/dev/wakethewild/wildtrack/api/context/package-summary.md).
