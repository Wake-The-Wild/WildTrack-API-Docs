# LocationService

`dev.wakethewild.wildtrack.api.query.LocationService`

```java
public interface LocationService
```

 

Server queries over known locations, with explicit opt-in source observation.

## Method Details

 

### query

  

```java
LocationQueryResult query(net.minecraft.server.level.ServerLevel level, LocationQuery query)
```

 

Executes a bounded index query. Implementations must not load or generate chunks to satisfy this call.

 

### observeAvailable

  

```java
default LocationCoverageReport observeAvailable(
    net.minecraft.server.level.ServerLevel level,
    LocationCoverageQuery query
)
```

 

On the server thread, refreshes available source data before a query. This may publish observations but must not load, generate or wait for chunks. Coverage applies only to the requested source columns, not to arbitrary unobserved geometry beyond them.

 

### findById

  

```java
Optional<LocationSnapshot> findById(net.minecraft.server.level.ServerLevel level, LocationId id)
```

 

Resolves a canonical location or a retained merge alias.
