# WildTrack API documentation

Official integration guides and public API reference for WildTrack API, a Fabric
library for server-authoritative world observations. It provides locations,
terrain and environment measurements, cave and river context, placement
evaluation, generation-safe contexts and player discovery services.

## Guides

- [Installation](docs/installation.md) and [first integration](docs/api/getting-started.md)
- [Service overview](docs/services.md) and [query contracts](docs/api/query-contracts.md)
- [Locations and structures](docs/api/locations.md) and [custom providers](docs/api/providers.md)
- [Terrain and surfaces](docs/api/environment.md), [classification](docs/api/classification.md) and [caves](docs/api/subterranean.md)
- [Placement](docs/api/placement.md), [context extensions](docs/api/context.md) and [world generation](docs/api/worldgen.md)
- [Discovery](docs/api/discovery.md), [persistence](docs/data-formats.md) and [storage extensions](docs/api/storage-data.md)
- [Public API reference](docs/reference/README.md) and [complete Java examples](examples/README.md)
- [Wanderer's Discovery integration](docs/integrations/wanderers-discovery.md)

The [documentation index](docs/README.md) lists all guides, including operational
limits and troubleshooting. API reference pages use Markdown and render directly
on GitHub.

## Compatibility

These guides describe the supported WildTrack API services and contracts.
Build integrations against the API version you distribute and match its Minecraft,
Fabric and Java requirements. See the [compatibility reference](docs/compatibility.md)
for the build used by the included examples. The API evolves during 0.x.
Documentation follows the current supported release. Historical revisions remain
available through Git; incompatible concurrently supported versions may have
separate branches when needed.

## Licensing

Original documentation prose and examples use the [MIT License](LICENSE).
WildTrack API code and the generated declarations in the API reference use
[Apache License 2.0](API-LICENSE). This is the separate public-API license declared
by WTW; the proprietary mod license does not replace it. See
[licensing](docs/licensing.md) and [NOTICE](NOTICE).

Created and maintained by [Wake The Wild](https://github.com/Wake-The-Wild).
Contact: `wakethewild.contact@gmail.com`.
