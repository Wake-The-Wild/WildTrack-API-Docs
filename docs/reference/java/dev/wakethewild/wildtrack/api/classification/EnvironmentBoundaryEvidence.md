# EnvironmentBoundaryEvidence

`dev.wakethewild.wildtrack.api.classification.EnvironmentBoundaryEvidence`

```java
public record EnvironmentBoundaryEvidence(Map<CardinalChunkFace, Integer> masks, int minimumOverlap)
```

 

Bit-packed evidence that an environment reaches each of a chunk's 16-column edges.

## Constructor Details

 

### EnvironmentBoundaryEvidence

  

```java
public EnvironmentBoundaryEvidence(Map<CardinalChunkFace, Integer> masks, int minimumOverlap)
```

 

Creates an instance of a `EnvironmentBoundaryEvidence` record class.

 

**Parameters:**

 

`masks` - the value for the `masks` record component

 

`minimumOverlap` - the value for the `minimumOverlap` record component

  

## Method Details

 

### mask

  

```java
public int mask(CardinalChunkFace face)
```

 

### overlap

  

```java
public int overlap(CardinalChunkFace face, EnvironmentBoundaryEvidence adjacent)
```

 

### connects

  

```java
public boolean connects(CardinalChunkFace face, EnvironmentBoundaryEvidence adjacent)
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

 

### masks

  

```java
public Map<CardinalChunkFace, Integer> masks()
```

 

Returns the value of the `masks` record component.

 

**Returns:**

 

the value of the `masks` record component

 

### minimumOverlap

  

```java
public int minimumOverlap()
```

 

Returns the value of the `minimumOverlap` record component.

 

**Returns:**

 

the value of the `minimumOverlap` record component
