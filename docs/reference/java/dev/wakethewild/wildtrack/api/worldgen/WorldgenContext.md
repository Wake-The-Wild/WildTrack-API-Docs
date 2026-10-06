# WorldgenContext

`dev.wakethewild.wildtrack.api.worldgen.WorldgenContext`

```java
public interface WorldgenContext
```

 

Detached, immutable-facing services for one bounded generation region.

## Method Details

 

### phase

  

```java
ObservationStage phase()
```

 

### capabilities

  

```java
Set<WorldgenCapability> capabilities()
```

 

### availableChunks

  

```java
Set<net.minecraft.world.level.ChunkPos> availableChunks()
```

 

### terrain

  

```java
TerrainService terrain()
```

 

### environment

  

```java
EnvironmentService environment()
```

 

### surface

  

```java
SurfaceService surface()
```

 

### subterranean

  

```java
SubterraneanService subterranean()
```

 

### classifications

  

```java
EnvironmentClassificationService classifications()
```

 

### watercourses

  

```java
WatercourseService watercourses()
```

 

### candidates

  

```java
WorldgenCandidateService candidates()
```

 

### placements

  

```java
PlacementService placements()
```

 

Placement queries read only this context's detached snapshots.
