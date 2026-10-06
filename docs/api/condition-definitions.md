# Data-facing condition definitions

`PlacementConditionDefinitionJsonCodec.decode(json)` reads a neutral definition
tree. `placementConditionDefinitions().compile(definition)` compiles it using
registered factories. This is a codec/compiler API: **WildTrack API does not
ship an automatic datapack directory/reload listener for placement definitions**.
The consumer owns file loading, reload and rule installation.

Nodes accept only `type`, `arguments` and `children`. Argument values are strings,
including numeric values. Unknown fields are rejected. Built-in composites are
`wildtrack:all`, `wildtrack:any` and `wildtrack:not`; `not` wraps one child.
The [JSON example](../../examples/conditions/meadow.json) uses registered leaves.

```json
{
  "type": "wildtrack:all",
  "children": [
    {"type": "wildtrack:terrain/slope_between", "arguments": {"minimum": "0", "maximum": "12"}},
    {"type": "wildtrack:surface/ground_block", "arguments": {"id": "minecraft:grass_block"}}
  ]
}
```

Built-in leaves are listed below. Their argument sets are exact: missing or extra
arguments are rejected. Identifier arguments are namespaced registry/tag IDs.

| Type under `wildtrack:` | Arguments |
| --- | --- |
| `terrain/position_y_between` | `minimum`, `maximum` (integers) |
| `terrain/surface_height_between` | `minimum`, `maximum` (integers) |
| `terrain/slope_between` | `minimum`, `maximum` (numbers, degrees) |
| `terrain/roughness_between` | `minimum`, `maximum` (numbers) |
| `surface/ground_block`, `surface/ground_tag` | `id` |
| `surface/canopy_coverage_between`, `surface/water_coverage_between` | `minimum`, `maximum` (fractions) |
| `environment/biome`, `environment/biome_tag` | `id` |
| `watercourse/detected` | none |
| `watercourse/minimum_confidence`, `watercourse/minimum_width` | `minimum` |
| `subterranean/cave_candidate`, `subterranean/entrance_candidate` | none |
| `subterranean/largest_void_at_least` | `minimum_blocks` |
| `subterranean/largest_void_dimensions_at_least` | `minimum_width`, `minimum_height`, `minimum_depth` |

Register consumer-owned leaf types with `PlacementConditionFactory`; keep the
factory deterministic and validate its arguments. Limits are 262144 JSON
characters, tree depth 16, 256 nodes, 32 arguments per node, and 256 characters
per argument key/value. Definitions are not an unrestricted scripting language.
