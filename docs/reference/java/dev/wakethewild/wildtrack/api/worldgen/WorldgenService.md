# WorldgenService

`dev.wakethewild.wildtrack.api.worldgen.WorldgenService`

```java
public interface WorldgenService
```

 

Creates bounded phase-safe contexts from chunks already owned by a generation caller.

## Method Details

 

### capture

  

```java
WorldgenContext capture(WorldgenRequest request)
```

 

### planAnchor

  

```java
WorldgenAnchorPlan planAnchor(WorldgenAnchorRequest request)
```

 

### planAnchorsAround

  

```java
List<WorldgenAnchorPlan> planAnchorsAround(WorldgenAnchorRequest request, int regionRadius)
```

 

### planRelativeAnchor

  

```java
WorldgenRelativeAnchorPlan planRelativeAnchor(WorldgenRelativeAnchorRequest request)
```

 

### requestAutomaticCapabilities

  

```java
void requestAutomaticCapabilities(
    net.minecraft.resources.Identifier consumerId,
    Set<WorldgenCapability> capabilities
)
```

 

Declares data a consumer needs in automatically prepared generation contexts.

 

### automaticCapabilities

  

```java
Set<WorldgenCapability> automaticCapabilities()
```

 

Effective capability set captured after vanilla terrain and before features.

 

### prepared

  

```java
Optional<WorldgenContext> prepared(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunk
)
```

 

Context prepared for a chunk currently running feature generation.
