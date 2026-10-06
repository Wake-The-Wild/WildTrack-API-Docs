# TerrainProfile

`dev.wakethewild.wildtrack.api.terrain.TerrainProfile`

```java
public record TerrainProfile(
    int blockX,
    int blockZ,
    int surfaceY,
    int sampleRadius,
    double slopeDegrees,
    OptionalDouble aspectDegrees,
    double roughness,
    double curvature,
    double relativeElevation
)
```

 

Multi-scale terrain measurements centered on one surface column.

## Constructor Details

 

### TerrainProfile

  

```java
public TerrainProfile(
    int blockX,
    int blockZ,
    int surfaceY,
    int sampleRadius,
    double slopeDegrees,
    OptionalDouble aspectDegrees,
    double roughness,
    double curvature,
    double relativeElevation
)
```

 

Creates an instance of a `TerrainProfile` record class.

 

**Parameters:**

 

`blockX` - the value for the `blockX` record component

 

`blockZ` - the value for the `blockZ` record component

 

`surfaceY` - the value for the `surfaceY` record component

 

`sampleRadius` - the value for the `sampleRadius` record component

 

`slopeDegrees` - the value for the `slopeDegrees` record component

 

`aspectDegrees` - the value for the `aspectDegrees` record component

 

`roughness` - the value for the `roughness` record component

 

`curvature` - the value for the `curvature` record component

 

`relativeElevation` - the value for the `relativeElevation` record component

  

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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. Reference components are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)); primitive components are compared with the `compare` method from their corresponding wrapper classes.

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### blockX

  

```java
public int blockX()
```

 

Returns the value of the `blockX` record component.

 

**Returns:**

 

the value of the `blockX` record component

 

### blockZ

  

```java
public int blockZ()
```

 

Returns the value of the `blockZ` record component.

 

**Returns:**

 

the value of the `blockZ` record component

 

### surfaceY

  

```java
public int surfaceY()
```

 

Returns the value of the `surfaceY` record component.

 

**Returns:**

 

the value of the `surfaceY` record component

 

### sampleRadius

  

```java
public int sampleRadius()
```

 

Returns the value of the `sampleRadius` record component.

 

**Returns:**

 

the value of the `sampleRadius` record component

 

### slopeDegrees

  

```java
public double slopeDegrees()
```

 

Returns the value of the `slopeDegrees` record component.

 

**Returns:**

 

the value of the `slopeDegrees` record component

 

### aspectDegrees

  

```java
public OptionalDouble aspectDegrees()
```

 

Returns the value of the `aspectDegrees` record component.

 

**Returns:**

 

the value of the `aspectDegrees` record component

 

### roughness

  

```java
public double roughness()
```

 

Returns the value of the `roughness` record component.

 

**Returns:**

 

the value of the `roughness` record component

 

### curvature

  

```java
public double curvature()
```

 

Returns the value of the `curvature` record component.

 

**Returns:**

 

the value of the `curvature` record component

 

### relativeElevation

  

```java
public double relativeElevation()
```

 

Returns the value of the `relativeElevation` record component.

 

**Returns:**

 

the value of the `relativeElevation` record component
