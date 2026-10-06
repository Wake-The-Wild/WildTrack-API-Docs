# TerrainQuery

`dev.wakethewild.wildtrack.api.terrain.TerrainQuery`

```java
public record TerrainQuery(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    int blockX,
    int blockZ,
    int sampleRadius,
    net.minecraft.world.level.levelgen.Heightmap.Types heightmapType
)
```

 

Request for terrain metrics around one world column.

## Constructor Details

 

### TerrainQuery

  

```java
public TerrainQuery(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    int blockX,
    int blockZ,
    int sampleRadius,
    net.minecraft.world.level.levelgen.Heightmap.Types heightmapType
)
```

 

Creates an instance of a `TerrainQuery` record class.

 

**Parameters:**

 

`dimension` - the value for the `dimension` record component

 

`blockX` - the value for the `blockX` record component

 

`blockZ` - the value for the `blockZ` record component

 

`sampleRadius` - the value for the `sampleRadius` record component

 

`heightmapType` - the value for the `heightmapType` record component

  

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

 

### sampleRadius

  

```java
public int sampleRadius()
```

 

Returns the value of the `sampleRadius` record component.

 

**Returns:**

 

the value of the `sampleRadius` record component

 

### heightmapType

  

```java
public net.minecraft.world.level.levelgen.Heightmap.Types heightmapType()
```

 

Returns the value of the `heightmapType` record component.

 

**Returns:**

 

the value of the `heightmapType` record component
