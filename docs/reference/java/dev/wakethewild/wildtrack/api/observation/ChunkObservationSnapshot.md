# ChunkObservationSnapshot

`dev.wakethewild.wildtrack.api.observation.ChunkObservationSnapshot`

```java
public interface ChunkObservationSnapshot
```

 

Immutable, thread-safe view captured from one chunk.

## Method Details

 

### dimension

  

```java
net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension()
```

 

### chunkPosition

  

```java
net.minecraft.world.level.ChunkPos chunkPosition()
```

 

### stage

  

```java
ObservationStage stage()
```

 

### capabilities

  

```java
Set<SnapshotCapability> capabilities()
```

 

### revision

  

```java
long revision()
```

 

Monotonic chunk-local revision used to reject stale analysis output.

 

### minimumY

  

```java
int minimumY()
```

 

### maximumYExclusive

  

```java
int maximumYExclusive()
```

 

Exclusive upper build bound.

 

### blockState

  

```java
net.minecraft.world.level.block.state.BlockState blockState(int localX, int y, int localZ)
```

 

### biome

  

```java
net.minecraft.core.Holder<net.minecraft.world.level.biome.Biome> biome(int localX, int y, int localZ)
```

 

### height

  

```java
int height(net.minecraft.world.level.levelgen.Heightmap.Types type, int localX, int localZ)
```

 

### isUniformSection

  

```java
boolean isUniformSection(int sectionY)
```

 

### supports

  

```java
default boolean supports(AnalysisProfile profile)
```

 

### validateLocalCoordinates

  

```java
default void validateLocalCoordinates(int localX, int y, int localZ)
```
