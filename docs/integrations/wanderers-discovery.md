# Custom structures and Wanderer's Discovery

WildTrack handles generic observation/query execution. WD chooses discovery
types, presentation, names, sound, advancements and persistent WD history.
WildTrack contains no WD-specific camp or well recognition rule.

## Registered Minecraft structures

Register/generate a structure through Minecraft's normal structure registry and
start/piece system. WildTrack's built-in structure source reads that registry,
including modded IDs. You normally do not need to add a new WildTrack provider
merely because a structure belongs to another mod.

Then add WD content in a server datapack or your mod's resources:

```text
data/examplemod/wanderers_discovery/poi_types/moon_temple.json
```

```json
{
  "structures": ["examplemod:moon_temple"],
  "name": {"fallback": "Moon Temple"}
}
```

WD reads whole-start observations from `VanillaStructureLocations.PROVIDER`,
uses `STRUCTURE_ID` to resolve the registered structure, and requires start-chunk
metadata and center for stable records. Piece detection uses known geometry;
`bounding_box` uses actual `START_BOUNDS`. Source coverage must be available and
the queried observation must meet WD's completeness/confidence requirements.
Never fake those fields on a private provider to bypass the bridge.

## Other location systems

An arbitrary `LocationPublisher` observation is available to API consumers but
is **not automatically a WD discovery**. WD currently queries the built-in
structure provider. Nonstandard placement systems and custom block features
need a deliberate consumer integration; WD JSON does not teach the API a new
recognition algorithm. Vanilla desert wells are a WD-owned block pattern executed
through the generic WildTrack block-search service.

## Assets and responsibility

A datapack supplies server discovery definitions/tags/advancements. Client
textures, translations and sound definitions need a resource pack or mod assets.
WD's fixed banner format is 256Ă—44 with a centered 160Ă—16 text panel.
Its JSON schema and asset format are documented by WD, not duplicated as a new
WildTrack datapack format.

See the [WD documentation](https://github.com/Wake-The-Wild/Wanderers-Discovery-Docs)
for the discovery schema.
