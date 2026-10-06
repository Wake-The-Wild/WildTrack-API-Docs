# Performance budgets

Public query/request limits are validated. Choose lower budgets for frequent
queries and keep incomplete work explicit. Querying known observations avoids
hidden loading, but it is not free: large sample radii, many candidates or many
providers still consume time.

| Operation | Documented bound |
| --- | --- |
| Location query | Result limit 1–4096; default 256 |
| Location candidates | Budget 1–65536; default 8192 |
| Available coverage | Chunk budget 1–4096; reference budget 1–65536 |
| Block pattern search | Candidate budget 1–65536; read budget 1–262144 |
| Worldgen capture | 1–25 distinct supplied chunks |
| Worldgen subterranean capture | At most 9 supplied chunks, CARVERS or later |
| Runtime demand | 128 leases, 16/owner, radius ≤4, duration ≤1200 ticks, 256 active chunks |
| Condition JSON | 262144 characters; depth 16; 256 nodes |
| Condition arguments | 32/node; key/value length ≤256 |
| Storage extension payload | ≤262144 bytes and its registered per-key bound |

Implementation defaults include 4096 retained terrain/environment/surface chunk
snapshots per service, at most 64 analysis publications per tick, subterranean
capture of 16 layers per tick, at most four subterranean publications and eight
new scans per tick. Cave coverage targets 512 active chunks with a player radius
between 2 and 6. These are current internal defaults, not compatibility guarantees
or exposed configuration settings.

Registry capacities currently include 4096 placement rules, 512 condition types,
512 context keys, 256 contributors/classifiers/storage keys, 128 discovery
policies and 256 discovery listeners. Discovery subjects are bounded at 4096,
with at most 16384 records per subject.

Do not poll expansive searches every render frame. Query on the server at a
cadence appropriate for the feature, reuse results, close subscriptions and
cancel/renew leases. For APIs with a public `limits`, `capacity` or stats method,
read that method rather than assuming a value from this table forever.
