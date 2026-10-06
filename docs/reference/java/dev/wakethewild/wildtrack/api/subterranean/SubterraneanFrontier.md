# SubterraneanFrontier

`dev.wakethewild.wildtrack.api.subterranean.SubterraneanFrontier`

```java
public record SubterraneanFrontier(
    net.minecraft.world.level.ChunkPos sourceChunk,
    HorizontalFace face,
    net.minecraft.world.level.ChunkPos missingChunk,
    int openingCells
)
```

 

Known cave opening that continues from a retained profile into a missing chunk.

## Constructor Details

 

### SubterraneanFrontier

  

```java
public SubterraneanFrontier(
    net.minecraft.world.level.ChunkPos sourceChunk,
    HorizontalFace face,
    net.minecraft.world.level.ChunkPos missingChunk,
    int openingCells
)
```

 

Creates an instance of a `SubterraneanFrontier` record class.

 

**Parameters:**

 

`sourceChunk` - the value for the `sourceChunk` record component

 

`face` - the value for the `face` record component

 

`missingChunk` - the value for the `missingChunk` record component

 

`openingCells` - the value for the `openingCells` record component

  

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

 

### sourceChunk

  

```java
public net.minecraft.world.level.ChunkPos sourceChunk()
```

 

Returns the value of the `sourceChunk` record component.

 

**Returns:**

 

the value of the `sourceChunk` record component

 

### face

  

```java
public HorizontalFace face()
```

 

Returns the value of the `face` record component.

 

**Returns:**

 

the value of the `face` record component

 

### missingChunk

  

```java
public net.minecraft.world.level.ChunkPos missingChunk()
```

 

Returns the value of the `missingChunk` record component.

 

**Returns:**

 

the value of the `missingChunk` record component

 

### openingCells

  

```java
public int openingCells()
```

 

Returns the value of the `openingCells` record component.

 

**Returns:**

 

the value of the `openingCells` record component
