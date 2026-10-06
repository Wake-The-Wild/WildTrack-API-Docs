# WorldgenRequest

`dev.wakethewild.wildtrack.api.worldgen.WorldgenRequest`

```java
public record WorldgenRequest(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    ObservationStage phase,
    List<? extends net.minecraft.world.level.chunk.ChunkAccess> chunks,
    Set<net.minecraft.world.level.levelgen.Heightmap.Types> heightmaps,
    Set<WorldgenCapability> requestedCapabilities
)
```

 

Explicit already-available generation inputs; capture never obtains another chunk.

## Field Details

 

### MAXIMUM_CHUNKS

  

```java
public static final int MAXIMUM_CHUNKS
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

 

### MAXIMUM_SUBTERRANEAN_CHUNKS

  

```java
public static final int MAXIMUM_SUBTERRANEAN_CHUNKS
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

  

## Constructor Details

 

### WorldgenRequest

  

```java
public WorldgenRequest(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    ObservationStage phase,
    List<? extends net.minecraft.world.level.chunk.ChunkAccess> chunks,
    Set<net.minecraft.world.level.levelgen.Heightmap.Types> heightmaps,
    Set<WorldgenCapability> requestedCapabilities
)
```

 

Creates an instance of a `WorldgenRequest` record class.

 

**Parameters:**

 

`dimension` - the value for the `dimension` record component

 

`phase` - the value for the `phase` record component

 

`chunks` - the value for the `chunks` record component

 

`heightmaps` - the value for the `heightmaps` record component

 

`requestedCapabilities` - the value for the `requestedCapabilities` record component

 

### WorldgenRequest

  

```java
public WorldgenRequest(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    ObservationStage phase,
    List<? extends net.minecraft.world.level.chunk.ChunkAccess> chunks,
    Set<net.minecraft.world.level.levelgen.Heightmap.Types> heightmaps
)
```

  

## Method Details

 

### of

  

```java
public static WorldgenRequest of(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    ObservationStage phase,
    net.minecraft.world.level.chunk.ChunkAccess chunk,
    net.minecraft.world.level.levelgen.Heightmap.Types heightmap
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

 

### phase

  

```java
public ObservationStage phase()
```

 

Returns the value of the `phase` record component.

 

**Returns:**

 

the value of the `phase` record component

 

### chunks

  

```java
public List<? extends net.minecraft.world.level.chunk.ChunkAccess> chunks()
```

 

Returns the value of the `chunks` record component.

 

**Returns:**

 

the value of the `chunks` record component

 

### heightmaps

  

```java
public Set<net.minecraft.world.level.levelgen.Heightmap.Types> heightmaps()
```

 

Returns the value of the `heightmaps` record component.

 

**Returns:**

 

the value of the `heightmaps` record component

 

### requestedCapabilities

  

```java
public Set<WorldgenCapability> requestedCapabilities()
```

 

Returns the value of the `requestedCapabilities` record component.

 

**Returns:**

 

the value of the `requestedCapabilities` record component
