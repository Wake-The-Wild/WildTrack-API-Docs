# SubterraneanQuery

`dev.wakethewild.wildtrack.api.subterranean.SubterraneanQuery`

```java
public record SubterraneanQuery(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunkPosition
)
```

 

Identifies one chunk-local below-surface observation.

## Constructor Details

 

### SubterraneanQuery

  

```java
public SubterraneanQuery(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunkPosition
)
```

 

Creates an instance of a `SubterraneanQuery` record class.

 

**Parameters:**

 

`dimension` - the value for the `dimension` record component

 

`chunkPosition` - the value for the `chunkPosition` record component

  

## Method Details

 

### atBlock

  

```java
public static SubterraneanQuery atBlock(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    int blockX,
    int blockZ
)
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

 

### dimension

  

```java
public net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension()
```

 

Returns the value of the `dimension` record component.

 

**Returns:**

 

the value of the `dimension` record component

 

### chunkPosition

  

```java
public net.minecraft.world.level.ChunkPos chunkPosition()
```

 

Returns the value of the `chunkPosition` record component.

 

**Returns:**

 

the value of the `chunkPosition` record component
