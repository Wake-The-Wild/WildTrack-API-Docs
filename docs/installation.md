# Installation

Download a WildTrack API release for your Minecraft version and Fabric
environment. Install the Fabric Loader, Fabric API and Java versions required
by that release, then put the API and Fabric API JARs in `mods/`. Check the
release’s dependency requirements; the [compatibility reference](compatibility.md)
records the build used for the examples in these guides.

WildTrack's Fabric mod ID is **`wildtrack`**. The display name is **WildTrack API**;
the JAR name and the dependency ID intentionally differ.

The mod includes common server services and a client discovery projection.
Install it on both sides when using Wanderer's Discovery. Other consumers must
state their own client/server requirements; a logical-server query requires a
running integrated or dedicated server.

WildTrack is a library. Consumers provide gameplay presentation and content
placement. Initialization and operational failures are reported through logs.
There is no shipped user configuration screen or general JSON configuration
file for changing internal budgets. Consumers configure queries and registrations
through the public API.

Back up worlds before changing mod versions. The API owns observations below
the world's `data/wildtrack` directory. Do not edit its binary stores by hand.
See [storage](data-formats.md) and [troubleshooting](troubleshooting.md).
