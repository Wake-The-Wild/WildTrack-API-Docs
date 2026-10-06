# EnvironmentClassificationContext

`dev.wakethewild.wildtrack.api.classification.EnvironmentClassificationContext`

```java
public record EnvironmentClassificationContext(
    EnvironmentClassificationQuery query,
    TerrainQueryResult terrain,
    EnvironmentQueryResult environment,
    SurfaceQueryResult surface
)
```

## Constructor Details

 

### EnvironmentClassificationContext

  

```java
public EnvironmentClassificationContext(
    EnvironmentClassificationQuery query,
    TerrainQueryResult terrain,
    EnvironmentQueryResult environment,
    SurfaceQueryResult surface
)
```

 

Creates an instance of a `EnvironmentClassificationContext` record class.

 

**Parameters:**

 

`query` - the value for the `query` record component

 

`terrain` - the value for the `terrain` record component

 

`environment` - the value for the `environment` record component

 

`surface` - the value for the `surface` record component

  

## Method Details

 

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
public EnvironmentClassificationQuery query()
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
