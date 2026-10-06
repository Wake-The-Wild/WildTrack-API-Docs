# Discovery policies and client visibility

Discovery is separate from world observation. A `DiscoveryPolicy` selects
locations, `DiscoveryScope`, enter/leave distances, distance metric and minimum
confidence. Register it through `discoveryPolicies()` before players use it.
Leave distance must be at least enter distance, providing boundary hysteresis.

The API includes `wildtrack:nearby_locations`: player scope, any indexed
location, enter distance 4, leave distance 7, Euclidean 3D distance and minimum
confidence 0. Policies are updated periodically on the server, currently every
10 server ticks. A consumer can register additional policies with unique IDs.

`discoveries().isDiscovered(subject, dimension, location)` checks recorded
knowledge. `snapshots(subject)` returns retained discovered snapshots;
`queryDiscovered(subject, level, query)` applies a bounded spatial query to
revealed records. `DiscoverySubject` distinguishes player and shared-world
ownership; scopes and subjects are not interchangeable with client settings.

`listen(DiscoveryListener)` returns a closeable `DiscoverySubscription`.
Events include `FIRST_DISCOVERED`, `ENTER`, `LEAVE` and `DATA_CHANGED`.
Keep and close the subscription when your integration lifecycle ends.
Do gameplay work on the server and avoid treating repeated boundary entries as
new discoveries. Aliases are remapped when regions merge.

Client-only `WildTrackClientApi.get().discoveries()` provides `find`, per-dimension
snapshots and all snapshots for the current connection. It combines revealed
player and shared-world records, resets on join, and clears on disconnect.
Synchronized snapshots include identity, geometry, tags, completeness and
confidence, but intentionally omit metadata. There is no client method to query
undiscovered server locations.

WildTrack does not render discovery banners or grant WD advancements. WD uses
its own presentation and persistence layer over API observations; enabling a
WildTrack policy alone does not register a WD discovery.
See [DiscoveryIntegration.java](../../examples/java/DiscoveryIntegration.java)
and [ClientKnowledge.java](../../examples/java/ClientKnowledge.java).
