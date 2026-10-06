# WildTrack integration examples

These original examples use only public WildTrack API and Minecraft/Fabric types.
They are MIT-licensed helpers, not installable mods. Copy/adapt them in a Fabric
consumer with the Java version required by your target release and a compatible API dependency. Call registration once after the
API is initialized and before work needing that extension; call live-level
query/publication helpers on the server thread. ClientKnowledge is client-only.

Preserve status reports: the examples return results without pretending missing
evidence is a negative match. CustomLocations needs consumer-owned persistence.
DiscoveryIntegration returns a subscription that the consumer must close.
WorldgenCapture accepts only chunks already owned by the caller.

| Example | Purpose |
| --- | --- |
| [StructureQueries.java](java/StructureQueries.java) | Structure coverage and nearby index query |
| [CustomLocations.java](java/CustomLocations.java) | Register/publish a generic landmark |
| [BlockPatterns.java](java/BlockPatterns.java) | Bounded water-over-sand pattern |
| [WorldMeasurements.java](java/WorldMeasurements.java) | Terrain, biome and surface observations |
| [EnvironmentExtensions.java](java/EnvironmentExtensions.java) | Independent semantic classifier |
| [PlacementRules.java](java/PlacementRules.java) | Conditions and JSON compilation |
| [WorldgenCapture.java](java/WorldgenCapture.java) | Detached generation context |
| [DiscoveryIntegration.java](java/DiscoveryIntegration.java) | Discovery policy and subscription |
| [ClientKnowledge.java](java/ClientKnowledge.java) | Revealed client snapshots |
| [TypedContext.java](java/TypedContext.java) | Typed context key/codec/contributor |
| [VersionedStorage.java](java/VersionedStorage.java) | Bounded schema-versioned storage codec |

[Condition JSON](conditions/meadow.json) is loaded by the consumer, not an automatic WildTrack datapack loader.

Additional complete helpers:

- [RuntimeCaves.java](java/RuntimeCaves.java)
- [DeterministicAnchors.java](java/DeterministicAnchors.java)
- [CandidateRanking.java](java/CandidateRanking.java)
- [TypedMetadata.java](java/TypedMetadata.java)
- [SnapshotAnalyzer.java](java/SnapshotAnalyzer.java)

SnapshotAnalyzer publishes a high-column observation from heightmaps. If you adapt
it to changing evidence, emit invalidation/removal or reconcile prior records when
a formerly matching column no longer qualifies. RuntimeCaves leases must be renewed
or cancelled by their owner; the helper does not create a chunk ticket.
