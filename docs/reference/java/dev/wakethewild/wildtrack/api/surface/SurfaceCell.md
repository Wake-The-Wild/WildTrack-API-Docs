# SurfaceCell

`dev.wakethewild.wildtrack.api.surface.SurfaceCell`

```java
public record SurfaceCell(
    int topY,
    SurfaceMaterial topMaterial,
    int groundY,
    SurfaceMaterial groundMaterial,
    int canopyDepth
)
```

## Constructor Details

 

### SurfaceCell

  

```java
public SurfaceCell(
    int topY,
    SurfaceMaterial topMaterial,
    int groundY,
    SurfaceMaterial groundMaterial,
    int canopyDepth
)
```

 

Creates an instance of a `SurfaceCell` record class.

 

**Parameters:**

 

`topY` - the value for the `topY` record component

 

`topMaterial` - the value for the `topMaterial` record component

 

`groundY` - the value for the `groundY` record component

 

`groundMaterial` - the value for the `groundMaterial` record component

 

`canopyDepth` - the value for the `canopyDepth` record component

  

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

 

### topY

  

```java
public int topY()
```

 

Returns the value of the `topY` record component.

 

**Returns:**

 

the value of the `topY` record component

 

### topMaterial

  

```java
public SurfaceMaterial topMaterial()
```

 

Returns the value of the `topMaterial` record component.

 

**Returns:**

 

the value of the `topMaterial` record component

 

### groundY

  

```java
public int groundY()
```

 

Returns the value of the `groundY` record component.

 

**Returns:**

 

the value of the `groundY` record component

 

### groundMaterial

  

```java
public SurfaceMaterial groundMaterial()
```

 

Returns the value of the `groundMaterial` record component.

 

**Returns:**

 

the value of the `groundMaterial` record component

 

### canopyDepth

  

```java
public int canopyDepth()
```

 

Returns the value of the `canopyDepth` record component.

 

**Returns:**

 

the value of the `canopyDepth` record component
