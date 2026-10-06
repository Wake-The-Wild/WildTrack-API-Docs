# First integration

Use Fabric Loom and the Java version required by your target Minecraft release.
Choose a compatible API release; see the [compatibility reference](../compatibility.md).
For a local dependency, copy its official JAR into your consumer project’s `libs`
directory. The example below assumes you named that local copy `wildtrack-api.jar`:

```groovy
dependencies {
    modImplementation files('libs/wildtrack-api.jar')
}
```

Declare runtime dependencies in your consumer’s `fabric.mod.json`. Replace the
placeholder strings below with version ranges compatible with the release you
build against; this template must be completed before building:

```json
{
  "depends": {
    "wildtrack": "<compatible API version range>",
    "minecraft": "<target Minecraft version range>",
    "java": "<required Java version range>"
  }
}
```

The repository's Maven publishing configuration uses group
`dev.wakethewild`, artifact `wildtrack-api`, and the project’s release version.
A configured public
Maven repository is not supplied, so those coordinates alone are not an
installation instruction.

Obtain `dev.wakethewild.wildtrack.api.WildTrackApi.get()` after WildTrack's
common initializer has run. A required dependency is necessary but initialization
ordering should not be assumed from a reference alone: obtain the API in a late
initialization/lifecycle callback, or explicitly order initialization in your
integration. `get()` throws `IllegalStateException` if it is too early.

Register namespaced providers, analyzers, codecs, classifiers and rules once,
before the work using them begins. Execute queries involving `ServerLevel` on
the logical server thread. Restrict client classes to your client entrypoint.
`WildTrackClientApi.get()` is available after client initialization.

The [Java examples](../../examples/README.md) include a bounded structure query,
a custom provider, block-pattern search, placement conditions, worldgen capture,
context/storage codecs and client discovery access. Their classes are integration
helpers, not separately installable mods.

Read the [query contracts](query-contracts.md) before treating an empty result as
evidence that a location does not exist.
