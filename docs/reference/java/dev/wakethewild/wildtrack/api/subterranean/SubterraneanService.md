# SubterraneanService

`dev.wakethewild.wildtrack.api.subterranean.SubterraneanService`

```java
public interface SubterraneanService
```

 

Queries retained observations of below-surface space.

## Method Details

 

### query

  

```java
SubterraneanQueryResult query(SubterraneanQuery query)
```

 

### scanProgress

  

```java
default SubterraneanScanProgress scanProgress(SubterraneanQuery query)
```

 

Reports observation lifecycle without loading or generating a chunk. Consumers can distinguish missing data from work that is already underway.

 

### connectivity

  

```java
Optional<SubterraneanConnectivity> connectivity(SubterraneanQuery query)
```

 

Requires a center profile; missing neighbors are reported in the returned partial topology.

 

### region

  

```java
default Optional<SubterraneanRegion> region(SubterraneanRegionQuery query)
```

 

Assembles retained profiles only; this method never loads or generates chunks.

 

### nearestEntrance

  

```java
default EntranceProximityResult nearestEntrance(EntranceProximityQuery proximity)
```

 

Searches retained profiles only; this method never loads or generates chunks.
