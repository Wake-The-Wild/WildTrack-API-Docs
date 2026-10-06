# ClientDiscoveryService

`dev.wakethewild.wildtrack.api.discovery.ClientDiscoveryService`

```java
@Environment(CLIENT) public interface ClientDiscoveryService
```

 

Read-only client view containing only locations revealed by the server.

## Method Details

 

### find

  

```java
Optional<LocationSnapshot> find(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    LocationId locationId
)
```

 

### snapshots

  

```java
List<LocationSnapshot> snapshots(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension
)
```

 

### snapshots

  

```java
List<LocationSnapshot> snapshots()
```
