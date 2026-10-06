# WatercourseService

`dev.wakethewild.wildtrack.api.classification.WatercourseService`

```java
public interface WatercourseService
```

 

Non-loading access to retained chunk-local water-corridor analysis.

## Method Details

 

### query

  

```java
WatercourseQueryResult query(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunk
)
```

 

### atBlock

  

```java
default WatercourseQueryResult atBlock(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    int blockX,
    int blockZ
)
```

 

### region

  

```java
WatercourseRegionQueryResult region(WatercourseRegionQuery query)
```

 

### retainedChunks

  

```java
int retainedChunks()
```
