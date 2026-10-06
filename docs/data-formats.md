# Data and persistence formats

## Consumer-facing formats

Public structured inputs are Java records/interfaces and the bounded
[placement condition JSON codec](api/condition-definitions.md). The latter is
loaded by consumers; WildTrack does not define an automatic placement datapack
directory. WD discovery JSON belongs to WD, not to WildTrack.

Typed metadata uses Mojang codecs. Context extension maps use registered
`ContextCodec` boundaries; versioned durable extension bytes use
`StorageDataPayload` and registered `StorageDataCodec` implementations.
Neither registration automatically stores custom data on disk.

## Implementation-owned stores

WildTrack writes below the world's `data/wildtrack` directory. These binary
formats are internal, not supported editing interfaces.

| Family | Retained information | Validation/recovery |
| --- | --- | --- |
| Subterranean profiles | Shapes, counts, openings, revisions and fingerprints | Versioned bounded records, CRC32 and content validation |
| Environment observations | Cell evidence and semantic-region input | Versioned bounded maps, checksum and revision rebasing |
| Environment/biome aliases | Canonical identity after merges | Append journals preserve retired IDs |
| Structure starts | IDs, starts, pieces and adjusted bounds | Versioned bounded binary records |
| POIs | Latest point observations and deletions | Upserts and deletion tombstones |
| Discoveries | Player/shared revealed records | Checksummed upserts and tombstones |

Write-behind queues are bounded and coalesce by identity. Append stores validate
headers and entry boundaries; a partial final entry can be truncated before a
subsequent append while valid earlier entries remain recoverable. Checksums do
not replace semantic validation. Schema versions are independent between families.

Do not delete these files to solve a client banner issue: WD owns separate
discovery history. Back up the entire world before migration or manual recovery.
Corruption, unsupported schema or fingerprint mismatch can reject a record;
absence of restored data is not evidence that the corresponding location does
not exist. Retained caches and persistent IDs have different lifetimes.
