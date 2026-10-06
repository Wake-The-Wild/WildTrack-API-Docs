# DiscoveryService

`dev.wakethewild.wildtrack.api.discovery.DiscoveryService`

```java
public interface DiscoveryService
```

## Method Details

 

### isDiscovered

  

```java
boolean isDiscovered(
    DiscoverySubject subject,
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    LocationId location
)
```

 

### snapshots

  

```java
List<LocationSnapshot> snapshots(DiscoverySubject subject)
```

 

### queryDiscovered

  

```java
LocationQueryResult queryDiscovered(
    DiscoverySubject subject,
    net.minecraft.server.level.ServerLevel level,
    LocationQuery query
)
```

 

### listen

  

```java
DiscoverySubscription listen(DiscoveryListener listener)
```
