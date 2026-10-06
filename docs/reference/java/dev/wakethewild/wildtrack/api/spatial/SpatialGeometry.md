# SpatialGeometry

`dev.wakethewild.wildtrack.api.spatial.SpatialGeometry`

**All Known Implementing Classes:**

 

`BoxGeometry, FragmentedGeometry, RadiusGeometry`

   

```java
public interface SpatialGeometry
```

 

Immutable spatial view. The envelope is an acceleration bound and does not imply that every enclosed position belongs to an irregular region.

## Method Details

 

### kind

  

```java
GeometryKind kind()
```

 

### completeness

  

```java
Completeness completeness()
```

 

### confidence

  

```java
Confidence confidence()
```

 

### envelope

  

```java
net.minecraft.world.phys.AABB envelope()
```

 

### knownFragments

  

```java
List<net.minecraft.world.phys.AABB> knownFragments()
```

 

### contains

  

```java
boolean contains(net.minecraft.core.BlockPos position)
```

 

### intersects

  

```java
boolean intersects(net.minecraft.world.phys.AABB bounds)
```
