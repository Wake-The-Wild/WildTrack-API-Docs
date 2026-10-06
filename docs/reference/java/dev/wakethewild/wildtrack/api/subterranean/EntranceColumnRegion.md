# EntranceColumnRegion

`dev.wakethewild.wildtrack.api.subterranean.EntranceColumnRegion`

```java
public record EntranceColumnRegion(
    int minimumLocalX,
    int minimumLocalZ,
    int maximumLocalX,
    int maximumLocalZ,
    int columnCount,
    double centerLocalX,
    double centerLocalZ,
    boolean touchesChunkBoundary
)
```

 

One four-neighbor-connected group of candidate cave-entrance columns.

## Constructor Details

 

### EntranceColumnRegion

  

```java
public EntranceColumnRegion(
    int minimumLocalX,
    int minimumLocalZ,
    int maximumLocalX,
    int maximumLocalZ,
    int columnCount,
    double centerLocalX,
    double centerLocalZ,
    boolean touchesChunkBoundary
)
```

 

Creates an instance of a `EntranceColumnRegion` record class.

 

**Parameters:**

 

`minimumLocalX` - the value for the `minimumLocalX` record component

 

`minimumLocalZ` - the value for the `minimumLocalZ` record component

 

`maximumLocalX` - the value for the `maximumLocalX` record component

 

`maximumLocalZ` - the value for the `maximumLocalZ` record component

 

`columnCount` - the value for the `columnCount` record component

 

`centerLocalX` - the value for the `centerLocalX` record component

 

`centerLocalZ` - the value for the `centerLocalZ` record component

 

`touchesChunkBoundary` - the value for the `touchesChunkBoundary` record component

  

## Method Details

 

### width

  

```java
public int width()
```

 

### depth

  

```java
public int depth()
```

 

### boundingArea

  

```java
public int boundingArea()
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

 

### minimumLocalX

  

```java
public int minimumLocalX()
```

 

Returns the value of the `minimumLocalX` record component.

 

**Returns:**

 

the value of the `minimumLocalX` record component

 

### minimumLocalZ

  

```java
public int minimumLocalZ()
```

 

Returns the value of the `minimumLocalZ` record component.

 

**Returns:**

 

the value of the `minimumLocalZ` record component

 

### maximumLocalX

  

```java
public int maximumLocalX()
```

 

Returns the value of the `maximumLocalX` record component.

 

**Returns:**

 

the value of the `maximumLocalX` record component

 

### maximumLocalZ

  

```java
public int maximumLocalZ()
```

 

Returns the value of the `maximumLocalZ` record component.

 

**Returns:**

 

the value of the `maximumLocalZ` record component

 

### columnCount

  

```java
public int columnCount()
```

 

Returns the value of the `columnCount` record component.

 

**Returns:**

 

the value of the `columnCount` record component

 

### centerLocalX

  

```java
public double centerLocalX()
```

 

Returns the value of the `centerLocalX` record component.

 

**Returns:**

 

the value of the `centerLocalX` record component

 

### centerLocalZ

  

```java
public double centerLocalZ()
```

 

Returns the value of the `centerLocalZ` record component.

 

**Returns:**

 

the value of the `centerLocalZ` record component

 

### touchesChunkBoundary

  

```java
public boolean touchesChunkBoundary()
```

 

Returns the value of the `touchesChunkBoundary` record component.

 

**Returns:**

 

the value of the `touchesChunkBoundary` record component
