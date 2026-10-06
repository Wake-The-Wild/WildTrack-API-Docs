# RadiusGeometry

`dev.wakethewild.wildtrack.api.spatial.RadiusGeometry`

**All Implemented Interfaces:**

 

`SpatialGeometry`

   

```java
public final class RadiusGeometry extends Object implements SpatialGeometry
```

 

Spherical or height-bounded cylindrical radius geometry.

## Method Details

 

### sphere

  

```java
public static RadiusGeometry sphere(
    net.minecraft.world.phys.Vec3 center,
    double radius,
    Completeness completeness,
    Confidence confidence
)
```

 

### horizontal

  

```java
public static RadiusGeometry horizontal(
    net.minecraft.world.phys.Vec3 center,
    double radius,
    double minY,
    double maxY,
    Completeness completeness,
    Confidence confidence
)
```

 

### center

  

```java
public net.minecraft.world.phys.Vec3 center()
```

 

### radius

  

```java
public double radius()
```

 

### metric

  

```java
public DistanceMetric metric()
```

 

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
