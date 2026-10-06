# LocationQuery

`dev.wakethewild.wildtrack.api.query.LocationQuery`

```java
public record LocationQuery(
    LocationSelector selector,
    Optional<net.minecraft.world.phys.Vec3> origin,
    OptionalDouble maximumDistance,
    DistanceMetric distanceMetric,
    Optional<net.minecraft.world.phys.AABB> intersection,
    Set<Completeness> acceptedCompleteness,
    double minimumConfidence,
    int limit,
    int candidateBudget,
    QueryGeometryMode geometryMode
)
```

 

Immutable bounded query against WildTrack's already-known spatial index. Distance constraints measure the shortest distance to the selected geometry view.

## Field Details

 

### DEFAULT_LIMIT

  

```java
public static final int DEFAULT_LIMIT
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

 

### MAX_LIMIT

  

```java
public static final int MAX_LIMIT
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

 

### DEFAULT_CANDIDATE_BUDGET

  

```java
public static final int DEFAULT_CANDIDATE_BUDGET
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

 

### MAX_CANDIDATE_BUDGET

  

```java
public static final int MAX_CANDIDATE_BUDGET
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

  

## Constructor Details

 

### LocationQuery

  

```java
public LocationQuery(
    LocationSelector selector,
    Optional<net.minecraft.world.phys.Vec3> origin,
    OptionalDouble maximumDistance,
    DistanceMetric distanceMetric,
    Optional<net.minecraft.world.phys.AABB> intersection,
    Set<Completeness> acceptedCompleteness,
    double minimumConfidence,
    int limit,
    int candidateBudget
)
```

 

Compatibility constructor retaining the original exact-geometry semantics.

 

### LocationQuery

  

```java
public LocationQuery(
    LocationSelector selector,
    Optional<net.minecraft.world.phys.Vec3> origin,
    OptionalDouble maximumDistance,
    DistanceMetric distanceMetric,
    Optional<net.minecraft.world.phys.AABB> intersection,
    Set<Completeness> acceptedCompleteness,
    double minimumConfidence,
    int limit,
    int candidateBudget,
    QueryGeometryMode geometryMode
)
```

 

Creates an instance of a `LocationQuery` record class.

 

**Parameters:**

 

`selector` - the value for the `selector` record component

 

`origin` - the value for the `origin` record component

 

`maximumDistance` - the value for the `maximumDistance` record component

 

`distanceMetric` - the value for the `distanceMetric` record component

 

`intersection` - the value for the `intersection` record component

 

`acceptedCompleteness` - the value for the `acceptedCompleteness` record component

 

`minimumConfidence` - the value for the `minimumConfidence` record component

 

`limit` - the value for the `limit` record component

 

`candidateBudget` - the value for the `candidateBudget` record component

 

`geometryMode` - the value for the `geometryMode` record component

  

## Method Details

 

### builder

  

```java
public static LocationQuery.Builder builder()
```

 

### toString

  

```java
public final String toString()
```

 

Returns a string representation of this record class. The representation contains the name of the class, followed by the name and value of each of the record components.

 

**Specified by:**

 

`toString` in class `Record`

 

**Returns:**

 

a string representation of this object

 

### hashCode

  

```java
public final int hashCode()
```

 

Returns a hash code value for this object. The value is derived from the hash code of each of the record components.

 

**Specified by:**

 

`hashCode` in class `Record`

 

**Returns:**

 

a hash code value for this object

 

### equals

  

```java
public final boolean equals(Object o)
```

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. Reference components are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)); primitive components are compared with the `compare` method from their corresponding wrapper classes.

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### selector

  

```java
public LocationSelector selector()
```

 

Returns the value of the `selector` record component.

 

**Returns:**

 

the value of the `selector` record component

 

### origin

  

```java
public Optional<net.minecraft.world.phys.Vec3> origin()
```

 

Returns the value of the `origin` record component.

 

**Returns:**

 

the value of the `origin` record component

 

### maximumDistance

  

```java
public OptionalDouble maximumDistance()
```

 

Returns the value of the `maximumDistance` record component.

 

**Returns:**

 

the value of the `maximumDistance` record component

 

### distanceMetric

  

```java
public DistanceMetric distanceMetric()
```

 

Returns the value of the `distanceMetric` record component.

 

**Returns:**

 

the value of the `distanceMetric` record component

 

### intersection

  

```java
public Optional<net.minecraft.world.phys.AABB> intersection()
```

 

Returns the value of the `intersection` record component.

 

**Returns:**

 

the value of the `intersection` record component

 

### acceptedCompleteness

  

```java
public Set<Completeness> acceptedCompleteness()
```

 

Returns the value of the `acceptedCompleteness` record component.

 

**Returns:**

 

the value of the `acceptedCompleteness` record component

 

### minimumConfidence

  

```java
public double minimumConfidence()
```

 

Returns the value of the `minimumConfidence` record component.

 

**Returns:**

 

the value of the `minimumConfidence` record component

 

### limit

  

```java
public int limit()
```

 

Returns the value of the `limit` record component.

 

**Returns:**

 

the value of the `limit` record component

 

### candidateBudget

  

```java
public int candidateBudget()
```

 

Returns the value of the `candidateBudget` record component.

 

**Returns:**

 

the value of the `candidateBudget` record component

 

### geometryMode

  

```java
public QueryGeometryMode geometryMode()
```

 

Returns the value of the `geometryMode` record component.

 

**Returns:**

 

the value of the `geometryMode` record component
