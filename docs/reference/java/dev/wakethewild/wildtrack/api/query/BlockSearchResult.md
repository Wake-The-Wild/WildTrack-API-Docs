# BlockSearchResult

`dev.wakethewild.wildtrack.api.query.BlockSearchResult`

```java
public record BlockSearchResult(
    Optional<net.minecraft.core.BlockPos> match,
    BlockSearchStatus status,
    int examinedPositions
)
```

## Constructor Details

 

### BlockSearchResult

  

```java
public BlockSearchResult(
    Optional<net.minecraft.core.BlockPos> match,
    BlockSearchStatus status,
    int examinedPositions
)
```

 

Creates an instance of a `BlockSearchResult` record class.

 

**Parameters:**

 

`match` - the value for the `match` record component

 

`status` - the value for the `status` record component

 

`examinedPositions` - the value for the `examinedPositions` record component

  

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

 

### match

  

```java
public Optional<net.minecraft.core.BlockPos> match()
```

 

Returns the value of the `match` record component.

 

**Returns:**

 

the value of the `match` record component

 

### status

  

```java
public BlockSearchStatus status()
```

 

Returns the value of the `status` record component.

 

**Returns:**

 

the value of the `status` record component

 

### examinedPositions

  

```java
public int examinedPositions()
```

 

Returns the value of the `examinedPositions` record component.

 

**Returns:**

 

the value of the `examinedPositions` record component
