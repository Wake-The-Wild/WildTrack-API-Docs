# LocationQuery.Builder

`dev.wakethewild.wildtrack.api.query.LocationQuery.Builder`

**Enclosing class:**

 

`LocationQuery`

   

```java
public static final class LocationQuery.Builder extends Object
```

## Constructor Details

 

### Builder

  

```java
public Builder()
```

  

## Method Details

 

### geometryMode

  

```java
public LocationQuery.Builder geometryMode(QueryGeometryMode geometryMode)
```

 

### selector

  

```java
public LocationQuery.Builder selector(LocationSelector selector)
```

 

### origin

  

```java
public LocationQuery.Builder origin(net.minecraft.world.phys.Vec3 origin)
```

 

### within

  

```java
public LocationQuery.Builder within(double maximumDistance, DistanceMetric metric)
```

 

### intersecting

  

```java
public LocationQuery.Builder intersecting(net.minecraft.world.phys.AABB bounds)
```

 

### acceptedCompleteness

  

```java
public LocationQuery.Builder acceptedCompleteness(Set<Completeness> states)
```

 

### minimumConfidence

  

```java
public LocationQuery.Builder minimumConfidence(double minimumConfidence)
```

 

### limit

  

```java
public LocationQuery.Builder limit(int limit)
```

 

### candidateBudget

  

```java
public LocationQuery.Builder candidateBudget(int candidateBudget)
```

 

### build

  

```java
public LocationQuery build()
```
