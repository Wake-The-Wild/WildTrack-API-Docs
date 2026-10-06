# FragmentedGeometry

`dev.wakethewild.wildtrack.api.spatial.FragmentedGeometry`

**All Implemented Interfaces:**

 

`SpatialGeometry`

   

```java
public final class FragmentedGeometry extends Object implements SpatialGeometry
```

 

Geometry represented by known pieces or sampled region fragments.

## Constructor Details

 

### FragmentedGeometry

  

```java
public FragmentedGeometry(
    GeometryKind kind,
    List<net.minecraft.world.phys.AABB> fragments,
    Completeness completeness,
    Confidence confidence
)
```

 

### FragmentedGeometry

  

```java
public FragmentedGeometry(
    GeometryKind kind,
    List<net.minecraft.world.phys.AABB> fragments,
    Completeness completeness,
    Confidence confidence,
    net.minecraft.world.phys.AABB enclosingBounds
)
```

 

Adds a provider's enclosing bounds while keeping exact fragment predicates unchanged.

  

## Method Details

 

### kind

  

```java
public GeometryKind kind()
```

 

**Specified by:**

 

`kind` in interface `SpatialGeometry`

 

### completeness

  

```java
public Completeness completeness()
```

 

**Specified by:**

 

`completeness` in interface `SpatialGeometry`

 

### confidence

  

```java
public Confidence confidence()
```

 

**Specified by:**

 

`confidence` in interface `SpatialGeometry`

 

### envelope

  

```java
public net.minecraft.world.phys.AABB envelope()
```

 

**Specified by:**

 

`envelope` in interface `SpatialGeometry`

 

### knownFragments

  

```java
public List<net.minecraft.world.phys.AABB> knownFragments()
```

 

**Specified by:**

 

`knownFragments` in interface `SpatialGeometry`

 

### contains

  

```java
public boolean contains(net.minecraft.core.BlockPos position)
```

 

**Specified by:**

 

`contains` in interface `SpatialGeometry`

 

### intersects

  

```java
public boolean intersects(net.minecraft.world.phys.AABB bounds)
```

 

**Specified by:**

 

`intersects` in interface `SpatialGeometry`
