# Troubleshooting

| Symptom | Check |
| --- | --- |
| Fabric reports missing WildTrack | Install the matching JAR; dependency ID is `wildtrack` |
| `WildTrackApi.get()` fails | API accessed before common initialization, or mod missing |
| Client accessor fails | Client initialization not complete, or client-only code loaded on a server |
| Empty structure query | Selector/dimension, coverage report, start references and loaded chunks |
| Result stops early | Result limit, candidate budget or source-reference budget |
| Region bounds change | Progressive observations/merges; retain ID and resolve aliases |
| Missing cave profile | Scan progress, active loaded coverage and temporary demand limits |
| Unknown placement | Explanation tree and missing evidence; explicit unknown policy |
| Missing client metadata | Metadata is intentionally omitted from synchronized discovery snapshots |
| Custom records vanish after restart | A generic provider needs consumer-owned reconstruction/persistence |
| JSON file has no effect | WildTrack has no automatic placement-definition datapack loader |
| A custom structure is not a WD discovery | WD definition/tag and the supported structure bridge are required |

Use logs and public result/status/statistics methods. Report exact versions, logical side,
query/request bounds, status and the relevant log exception. Preserve a world
backup before repairing persistent files.

Internal classes, binary stores and mixin entrypoints are not public integration
contracts. Do not patch them as a substitute for checking API initialization,
knowledge boundaries or supported source registration.
