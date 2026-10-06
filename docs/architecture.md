# Architecture and lifecycle

Fabric common initialization publishes `WildTrackApi` under object-share key
`wildtrack:api`, installs chunk/worldgen observation hooks and registers discovery
networking. Client initialization publishes `wildtrack:client_api` and installs
the visibility-filtered cache. Both accessors fail explicitly before initialization.

Server chunk load/change hooks capture detached height/environment/surface data,
update structures and POIs, and schedule bounded analysis. Chunk revisions reject
stale worker publication. End-of-tick work refreshes references, advances
observation leases, updates discoveries, captures/publishes cave work, joins
regions and flushes bounded persistence queues.

Unloading chunks drops transient snapshots and pauses scan sources. Persistent
records and canonical aliases have separate retention policies. Server stop
flushes/stops work and reports pending writes or failures through ordinary logs.
The implementation shares bounded observations across consumers.

Runtime subterranean coverage is player-centered, with additional temporary
consumer demands. Built-in source observation and classifications are installed
by the API initializer; not every subsystem is dynamically disabled merely
because a consumer does not query it. Generation volume capture is explicitly
capability-gated.

Worldgen uses detached contexts from caller-owned chunks or the supported prepared
feature phase. It does not borrow runtime observations to decide deterministic
anchors or placements. Consumers depend on public API packages; classes under
`internal`, mixins and network payload implementation are not supported extension
points.

Public status and statistics methods expose operational state.
See [budgets](performance.md) for resource limits.
