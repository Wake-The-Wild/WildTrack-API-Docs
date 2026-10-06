# SubterraneanConnectivity

`dev.wakethewild.wildtrack.api.subterranean.SubterraneanConnectivity`

```java
public record SubterraneanConnectivity(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunkPosition,
    long revision,
    Map<HorizontalFace, Integer> overlappingCells,
    Set<HorizontalFace> missingNeighbors
)
```

 

Exact face-to-face connectivity from one profile to its four neighbors.

## Constructor Details

 

### SubterraneanConnectivity

  

```java
public SubterraneanConnectivity(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunkPosition,
    long revision,
    Map<HorizontalFace, Integer> overlappingCells,
    Set<HorizontalFace> missingNeighbors
)
```

 

Creates an instance of a `SubterraneanConnectivity` record class.

 

**Parameters:**

 

`dimension` - the value for the `dimension` record component

 

`chunkPosition` - the value for the `chunkPosition` record component

 

`revision` - the value for the `revision` record component

 

`overlappingCells` - the value for the `overlappingCells` record component

 

`missingNeighbors` - the value for the `missingNeighbors` record component

  

## Method Details

 

### connectedNeighborCount

  

```java
public int connectedNeighborCount()
```

 

### completeNeighborhood

  

```java
public boolean completeNeighborhood()
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

 

### revision

  

```java
public long revision()
```

 

Returns the value of the `revision` record component.

 

**Returns:**

 

the value of the `revision` record component

 

### overlappingCells

  

```java
public Map<HorizontalFace, Integer> overlappingCells()
```

 

Returns the value of the `overlappingCells` record component.

 

**Returns:**

 

the value of the `overlappingCells` record component

 

### missingNeighbors

  

```java
public Set<HorizontalFace> missingNeighbors()
```

 

Returns the value of the `missingNeighbors` record component.

 

**Returns:**

 

the value of the `missingNeighbors` record component
