# EnvironmentRegionService

`dev.wakethewild.wildtrack.api.classification.EnvironmentRegionService`

```java
public interface EnvironmentRegionService
```

 

Read-only access to progressively assembled forest, water, terrain, and river regions.

## Method Details

 

### cell

  

```java
EnvironmentRegionCell cell(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunk
)
```

 

### atBlock

  

```java
default EnvironmentRegionCell atBlock(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    int blockX,
    int blockZ
)
```

 

### stats

  

```java
EnvironmentRegionStats stats()
```
