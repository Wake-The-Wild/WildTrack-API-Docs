# LargestVoidShape

`dev.wakethewild.wildtrack.api.subterranean.LargestVoidShape`

```java
public record LargestVoidShape(
    int blocks,
    int minimumLocalX,
    int maximumLocalX,
    int minimumY,
    int maximumY,
    int minimumLocalZ,
    int maximumLocalZ,
    boolean touchesChunkBoundary,
    boolean touchesSurface
)
```

 

Exact local bounds and connectivity of the largest air component in one chunk profile.

## Constructor Details

 

### LargestVoidShape

  

```java
public LargestVoidShape(
    int blocks,
    int minimumLocalX,
    int maximumLocalX,
    int minimumY,
    int maximumY,
    int minimumLocalZ,
    int maximumLocalZ,
    boolean touchesChunkBoundary,
    boolean touchesSurface
)
```

 

Creates an instance of a `LargestVoidShape` record class.

 

**Parameters:**

 

`blocks` - the value for the `blocks` record component

 

`minimumLocalX` - the value for the `minimumLocalX` record component

 

`maximumLocalX` - the value for the `maximumLocalX` record component

 

`minimumY` - the value for the `minimumY` record component

 

`maximumY` - the value for the `maximumY` record component

 

`minimumLocalZ` - the value for the `minimumLocalZ` record component

 

`maximumLocalZ` - the value for the `maximumLocalZ` record component

 

`touchesChunkBoundary` - the value for the `touchesChunkBoundary` record component

 

`touchesSurface` - the value for the `touchesSurface` record component

  

## Method Details

 

### widthBlocks

  

```java
public int widthBlocks()
```

 

### heightBlocks

  

```java
public int heightBlocks()
```

 

### depthBlocks

  

```java
public int depthBlocks()
```

 

### fillFraction

  

```java
public double fillFraction()
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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with the `compare` method from their corresponding wrapper classes.

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### blocks

  

```java
public int blocks()
```

 

Returns the value of the `blocks` record component.

 

**Returns:**

 

the value of the `blocks` record component

 

### minimumLocalX

  

```java
public int minimumLocalX()
```

 

Returns the value of the `minimumLocalX` record component.

 

**Returns:**

 

the value of the `minimumLocalX` record component

 

### maximumLocalX

  

```java
public int maximumLocalX()
```

 

Returns the value of the `maximumLocalX` record component.

 

**Returns:**

 

the value of the `maximumLocalX` record component

 

### minimumY

  

```java
public int minimumY()
```

 

Returns the value of the `minimumY` record component.

 

**Returns:**

 

the value of the `minimumY` record component

 

### maximumY

  

```java
public int maximumY()
```

 

Returns the value of the `maximumY` record component.

 

**Returns:**

 

the value of the `maximumY` record component

 

### minimumLocalZ

  

```java
public int minimumLocalZ()
```

 

Returns the value of the `minimumLocalZ` record component.

 

**Returns:**

 

the value of the `minimumLocalZ` record component

 

### maximumLocalZ

  

```java
public int maximumLocalZ()
```

 

Returns the value of the `maximumLocalZ` record component.

 

**Returns:**

 

the value of the `maximumLocalZ` record component

 

### touchesChunkBoundary

  

```java
public boolean touchesChunkBoundary()
```

 

Returns the value of the `touchesChunkBoundary` record component.

 

**Returns:**

 

the value of the `touchesChunkBoundary` record component

 

### touchesSurface

  

```java
public boolean touchesSurface()
```

 

Returns the value of the `touchesSurface` record component.

 

**Returns:**

 

the value of the `touchesSurface` record component
