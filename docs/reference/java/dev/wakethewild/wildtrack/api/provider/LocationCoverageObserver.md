# LocationCoverageObserver

`dev.wakethewild.wildtrack.api.provider.LocationCoverageObserver`

**Functional Interface:**

 

This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

   

```java
@FunctionalInterface public interface LocationCoverageObserver
```

 

Refreshes provider observations from available data without loading, generating or waiting for chunks.

## Method Details

 

### observeAvailable

  

```java
LocationCoverageReport observeAvailable(
    net.minecraft.server.level.ServerLevel level,
    LocationCoverageQuery query
)
```
