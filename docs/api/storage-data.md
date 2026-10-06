# Versioned storage extension codecs

Register a `StorageDataKey<T>` with its namespaced ID, value class, current schema
version, `StorageDataCodec<T>` and maximum encoded bytes through `storageData()`.
Registration is global and performs no disk I/O. Duplicate keys are rejected.

`encode(key, value)` returns `StorageDataPayload` containing identifier, stored
version and bytes. `decode(key, payload)` verifies the registered contract and
passes the stored version to the codec. The codec owns supported old-version
migrations; a payload newer than its current version is rejected. Byte arrays
are copied on input/output.

The owning record/service decides where to store the payload. This registry does
not automatically save arbitrary consumer data, attach it to every location or
transmit it to clients. It is a bounded codec boundary, not a replacement for the
consumer's persistence lifecycle.

Per-key limits cannot exceed the global **262144-byte** ceiling. Bound collection
counts before allocating during decoding, reject unknown versions, and never
change the meaning of an existing schema version. Keep old decode branches while
supporting old worlds.

See [VersionedStorage.java](../../examples/java/VersionedStorage.java) for a complete
two-version codec. WildTrack's own stores are described separately in
[persistent data formats](../data-formats.md).
