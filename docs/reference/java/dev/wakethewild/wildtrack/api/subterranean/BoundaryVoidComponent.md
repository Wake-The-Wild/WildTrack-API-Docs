# BoundaryVoidComponent

`dev.wakethewild.wildtrack.api.subterranean.BoundaryVoidComponent`

```java
public record BoundaryVoidComponent(
    int localId,
    LargestVoidShape shape,
    Map<HorizontalFace, SparseBoundaryOpening> openings
)
```

 

One chunk-local void component that can connect to an adjacent chunk.

## Constructor Details

 

### BoundaryVoidComponent

  

```java
public BoundaryVoidComponent(
    int localId,
    LargestVoidShape shape,
    Map<HorizontalFace, SparseBoundaryOpening> openings
)
```

 

Creates an instance of a `BoundaryVoidComponent` record class.

 

**Parameters:**

 

`localId` - the value for the `localId` record component

 

`shape` - the value for the `shape` record component

 

`openings` - the value for the `openings` record component

  

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

 

### localId

  

```java
public int localId()
```

 

Returns the value of the `localId` record component.

 

**Returns:**

 

the value of the `localId` record component

 

### shape

  

```java
public LargestVoidShape shape()
```

 

Returns the value of the `shape` record component.

 

**Returns:**

 

the value of the `shape` record component

 

### openings

  

```java
public Map<HorizontalFace, SparseBoundaryOpening> openings()
```

 

Returns the value of the `openings` record component.

 

**Returns:**

 

the value of the `openings` record component
