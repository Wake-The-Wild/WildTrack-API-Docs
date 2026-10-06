# SubterraneanRegionQuery

`dev.wakethewild.wildtrack.api.subterranean.SubterraneanRegionQuery`

```java
public record SubterraneanRegionQuery(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos origin,
    int maximumChunks
)
```

 

Bounded request for the known cave component containing one chunk.

## Field Details

 

### MAXIMUM_CHUNKS

  

```java
public static final int MAXIMUM_CHUNKS
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

  

## Constructor Details

 

### SubterraneanRegionQuery

  

```java
public SubterraneanRegionQuery(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos origin,
    int maximumChunks
)
```

 

Creates an instance of a `SubterraneanRegionQuery` record class.

 

**Parameters:**

 

`dimension` - the value for the `dimension` record component

 

`origin` - the value for the `origin` record component

 

`maximumChunks` - the value for the `maximumChunks` record component

  

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

 

### dimension

  

```java
public net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension()
```

 

Returns the value of the `dimension` record component.

 

**Returns:**

 

the value of the `dimension` record component

 

### origin

  

```java
public net.minecraft.world.level.ChunkPos origin()
```

 

Returns the value of the `origin` record component.

 

**Returns:**

 

the value of the `origin` record component

 

### maximumChunks

  

```java
public int maximumChunks()
```

 

Returns the value of the `maximumChunks` record component.

 

**Returns:**

 

the value of the `maximumChunks` record component
