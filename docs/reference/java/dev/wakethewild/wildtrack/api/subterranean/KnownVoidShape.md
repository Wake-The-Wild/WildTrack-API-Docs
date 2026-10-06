# KnownVoidShape

`dev.wakethewild.wildtrack.api.subterranean.KnownVoidShape`

```java
public record KnownVoidShape(
    net.minecraft.world.level.ChunkPos chunk,
    LargestVoidShape shape,
    VoidMorphology morphology
)
```

 

Largest measured local void in one chunk of a subterranean region.

## Constructor Details

 

### KnownVoidShape

  

```java
public KnownVoidShape(
    net.minecraft.world.level.ChunkPos chunk,
    LargestVoidShape shape,
    VoidMorphology morphology
)
```

 

Creates an instance of a `KnownVoidShape` record class.

 

**Parameters:**

 

`chunk` - the value for the `chunk` record component

 

`shape` - the value for the `shape` record component

 

`morphology` - the value for the `morphology` record component

  

## Method Details

 

### minimumBlockX

  

```java
public int minimumBlockX()
```

 

### maximumBlockX

  

```java
public int maximumBlockX()
```

 

### minimumBlockZ

  

```java
public int minimumBlockZ()
```

 

### maximumBlockZ

  

```java
public int maximumBlockZ()
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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)).

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### chunk

  

```java
public net.minecraft.world.level.ChunkPos chunk()
```

 

Returns the value of the `chunk` record component.

 

**Returns:**

 

the value of the `chunk` record component

 

### shape

  

```java
public LargestVoidShape shape()
```

 

Returns the value of the `shape` record component.

 

**Returns:**

 

the value of the `shape` record component

 

### morphology

  

```java
public VoidMorphology morphology()
```

 

Returns the value of the `morphology` record component.

 

**Returns:**

 

the value of the `morphology` record component
