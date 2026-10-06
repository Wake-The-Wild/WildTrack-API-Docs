# BoundaryOpeningMask

`dev.wakethewild.wildtrack.api.subterranean.BoundaryOpeningMask`

```java
public record BoundaryOpeningMask(int minimumY, int maximumYExclusive, long[] words)
```

 

Bit-packed 16-column vertical opening mask on one horizontal chunk face.

## Constructor Details

 

### BoundaryOpeningMask

  

```java
public BoundaryOpeningMask(int minimumY, int maximumYExclusive, long[] words)
```

 

Creates an instance of a `BoundaryOpeningMask` record class.

 

**Parameters:**

 

`minimumY` - the value for the `minimumY` record component

 

`maximumYExclusive` - the value for the `maximumYExclusive` record component

 

`words` - the value for the `words` record component

  

## Method Details

 

### empty

  

```java
public static BoundaryOpeningMask empty(int minimumY, int maximumYExclusive)
```

 

### words

  

```java
public long[] words()
```

 

Returns the value of the `words` record component.

 

**Returns:**

 

the value of the `words` record component

 

### isOpen

  

```java
public boolean isOpen(int horizontalCoordinate, int y)
```

 

### openCellCount

  

```java
public int openCellCount()
```

 

### overlapCount

  

```java
public int overlapCount(BoundaryOpeningMask adjacent)
```

 

Counts exact shared openings; north/south use X and west/east use Z as the coordinate.

 

### equals

  

```java
public boolean equals(Object other)
```

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. Reference components are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)); primitive components are compared with the `compare` method from their corresponding wrapper classes.

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`other` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `other` argument; `false` otherwise.

 

### hashCode

  

```java
public int hashCode()
```

 

Returns a hash code value for this object. The value is derived from the hash code of each of the record components.

 

**Specified by:**

 

`hashCode` in class `Record`

 

**Returns:**

 

a hash code value for this object

 

### toString

  

```java
public final String toString()
```

 

Returns a string representation of this record class. The representation contains the name of the class, followed by the name and value of each of the record components.

 

**Specified by:**

 

`toString` in class `Record`

 

**Returns:**

 

a string representation of this object

 

### minimumY

  

```java
public int minimumY()
```

 

Returns the value of the `minimumY` record component.

 

**Returns:**

 

the value of the `minimumY` record component

 

### maximumYExclusive

  

```java
public int maximumYExclusive()
```

 

Returns the value of the `maximumYExclusive` record component.

 

**Returns:**

 

the value of the `maximumYExclusive` record component
