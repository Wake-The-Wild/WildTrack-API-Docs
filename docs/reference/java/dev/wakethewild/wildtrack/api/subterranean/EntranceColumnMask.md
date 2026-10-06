# EntranceColumnMask

`dev.wakethewild.wildtrack.api.subterranean.EntranceColumnMask`

```java
public record EntranceColumnMask(long[] words)
```

 

Compact 16x16 mask of columns where subterranean air meets exterior air.

## Field Details

 

### WORD_COUNT

  

```java
public static final int WORD_COUNT
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

  

## Constructor Details

 

### EntranceColumnMask

  

```java
public EntranceColumnMask(long[] words)
```

 

Creates an instance of a `EntranceColumnMask` record class.

 

**Parameters:**

 

`words` - the value for the `words` record component

  

## Method Details

 

### empty

  

```java
public static EntranceColumnMask empty()
```

 

### isCandidate

  

```java
public boolean isCandidate(int localX, int localZ)
```

 

### candidateCount

  

```java
public int candidateCount()
```

 

### regions

  

```java
public List<EntranceColumnRegion> regions()
```

 

Returns deterministic four-neighbor-connected entrance regions.

 

### words

  

```java
public long[] words()
```

 

Returns the value of the `words` record component.

 

**Returns:**

 

the value of the `words` record component

 

### equals

  

```java
public boolean equals(Object value)
```

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)).

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`value` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `value` argument; `false` otherwise.

 

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
