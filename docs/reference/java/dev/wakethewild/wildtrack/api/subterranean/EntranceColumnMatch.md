# EntranceColumnMatch

`dev.wakethewild.wildtrack.api.subterranean.EntranceColumnMatch`

```java
public record EntranceColumnMatch(
    int blockX,
    int blockZ,
    double distance,
    net.minecraft.world.level.ChunkPos sourceChunk,
    long sourceRevision
)
```

 

Nearest retained entrance column and the profile revision that supplied it.

## Constructor Details

 

### EntranceColumnMatch

  

```java
public EntranceColumnMatch(
    int blockX,
    int blockZ,
    double distance,
    net.minecraft.world.level.ChunkPos sourceChunk,
    long sourceRevision
)
```

 

Creates an instance of a `EntranceColumnMatch` record class.

 

**Parameters:**

 

`blockX` - the value for the `blockX` record component

 

`blockZ` - the value for the `blockZ` record component

 

`distance` - the value for the `distance` record component

 

`sourceChunk` - the value for the `sourceChunk` record component

 

`sourceRevision` - the value for the `sourceRevision` record component

  

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

 

### blockX

  

```java
public int blockX()
```

 

Returns the value of the `blockX` record component.

 

**Returns:**

 

the value of the `blockX` record component

 

### blockZ

  

```java
public int blockZ()
```

 

Returns the value of the `blockZ` record component.

 

**Returns:**

 

the value of the `blockZ` record component

 

### distance

  

```java
public double distance()
```

 

Returns the value of the `distance` record component.

 

**Returns:**

 

the value of the `distance` record component

 

### sourceChunk

  

```java
public net.minecraft.world.level.ChunkPos sourceChunk()
```

 

Returns the value of the `sourceChunk` record component.

 

**Returns:**

 

the value of the `sourceChunk` record component

 

### sourceRevision

  

```java
public long sourceRevision()
```

 

Returns the value of the `sourceRevision` record component.

 

**Returns:**

 

the value of the `sourceRevision` record component
