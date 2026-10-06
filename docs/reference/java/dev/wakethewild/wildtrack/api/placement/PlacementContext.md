# PlacementContext

`dev.wakethewild.wildtrack.api.placement.PlacementContext`

```java
public record PlacementContext(
    PlacementQuery query,
    TerrainQueryResult terrain,
    EnvironmentQueryResult environment,
    SurfaceQueryResult surface,
    SubterraneanQueryResult subterranean,
    EntranceProximityResult entranceProximity,
    EnvironmentClassificationResult classifications,
    WatercourseQueryResult watercourse,
    ContextValueMap extensions
)
```

 

Detached results collected for one placement query without loading chunks.

## Constructor Details

 

### PlacementContext

  

```java
public PlacementContext(
    PlacementQuery query,
    TerrainQueryResult terrain,
    EnvironmentQueryResult environment,
    SurfaceQueryResult surface,
    SubterraneanQueryResult subterranean,
    EntranceProximityResult entranceProximity,
    EnvironmentClassificationResult classifications,
    WatercourseQueryResult watercourse,
    ContextValueMap extensions
)
```

 

Creates an instance of a `PlacementContext` record class.

 

**Parameters:**

 

`query` - the value for the `query` record component

 

`terrain` - the value for the `terrain` record component

 

`environment` - the value for the `environment` record component

 

`surface` - the value for the `surface` record component

 

`subterranean` - the value for the `subterranean` record component

 

`entranceProximity` - the value for the `entranceProximity` record component

 

`classifications` - the value for the `classifications` record component

 

`watercourse` - the value for the `watercourse` record component

 

`extensions` - the value for the `extensions` record component

 

### PlacementContext

  

```java
public PlacementContext(
    PlacementQuery query,
    TerrainQueryResult terrain,
    EnvironmentQueryResult environment,
    SurfaceQueryResult surface,
    SubterraneanQueryResult subterranean,
    EntranceProximityResult entranceProximity,
    EnvironmentClassificationResult classifications
)
```

 

### PlacementContext

  

```java
public PlacementContext(
    PlacementQuery query,
    TerrainQueryResult terrain,
    EnvironmentQueryResult environment,
    SurfaceQueryResult surface,
    SubterraneanQueryResult subterranean,
    EntranceProximityResult entranceProximity,
    EnvironmentClassificationResult classifications,
    ContextValueMap extensions
)
```

 

### PlacementContext

  

```java
public PlacementContext(
    PlacementQuery query,
    TerrainQueryResult terrain,
    EnvironmentQueryResult environment,
    SurfaceQueryResult surface,
    SubterraneanQueryResult subterranean,
    EntranceProximityResult entranceProximity
)
```

 

Compatibility constructor for callers that have not collected cross-chunk entrance coverage.

 

### PlacementContext

  

```java
public PlacementContext(
    PlacementQuery query,
    TerrainQueryResult terrain,
    EnvironmentQueryResult environment,
    SurfaceQueryResult surface,
    SubterraneanQueryResult subterranean
)
```

  

## Method Details

 

### withExtensions

  

```java
public PlacementContext withExtensions(ContextValueMap values)
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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)).

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### query

  

```java
public PlacementQuery query()
```

 

Returns the value of the `query` record component.

 

**Returns:**

 

the value of the `query` record component

 

### terrain

  

```java
public TerrainQueryResult terrain()
```

 

Returns the value of the `terrain` record component.

 

**Returns:**

 

the value of the `terrain` record component

 

### environment

  

```java
public EnvironmentQueryResult environment()
```

 

Returns the value of the `environment` record component.

 

**Returns:**

 

the value of the `environment` record component

 

### surface

  

```java
public SurfaceQueryResult surface()
```

 

Returns the value of the `surface` record component.

 

**Returns:**

 

the value of the `surface` record component

 

### subterranean

  

```java
public SubterraneanQueryResult subterranean()
```

 

Returns the value of the `subterranean` record component.

 

**Returns:**

 

the value of the `subterranean` record component

 

### entranceProximity

  

```java
public EntranceProximityResult entranceProximity()
```

 

Returns the value of the `entranceProximity` record component.

 

**Returns:**

 

the value of the `entranceProximity` record component

 

### classifications

  

```java
public EnvironmentClassificationResult classifications()
```

 

Returns the value of the `classifications` record component.

 

**Returns:**

 

the value of the `classifications` record component

 

### watercourse

  

```java
public WatercourseQueryResult watercourse()
```

 

Returns the value of the `watercourse` record component.

 

**Returns:**

 

the value of the `watercourse` record component

 

### extensions

  

```java
public ContextValueMap extensions()
```

 

Returns the value of the `extensions` record component.

 

**Returns:**

 

the value of the `extensions` record component
