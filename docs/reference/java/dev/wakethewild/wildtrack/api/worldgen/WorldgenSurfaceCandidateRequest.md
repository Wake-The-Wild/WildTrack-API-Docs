# WorldgenSurfaceCandidateRequest

`dev.wakethewild.wildtrack.api.worldgen.WorldgenSurfaceCandidateRequest`

```java
public record WorldgenSurfaceCandidateRequest(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    int anchorBlockX,
    int anchorBlockZ,
    int searchRadiusBlocks,
    int stepBlocks,
    int terrainSampleRadius,
    int placementYOffset,
    net.minecraft.world.level.levelgen.Heightmap.Types heightmapType,
    int maximumSamples
)
```

 

Bounded center-out surface candidate pattern.

## Field Details

 

### MAXIMUM_SEARCH_RADIUS

  

```java
public static final int MAXIMUM_SEARCH_RADIUS
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

 

### MAXIMUM_SAMPLES

  

```java
public static final int MAXIMUM_SAMPLES
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

  

## Constructor Details

 

### WorldgenSurfaceCandidateRequest

  

```java
public WorldgenSurfaceCandidateRequest(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    int anchorBlockX,
    int anchorBlockZ,
    int searchRadiusBlocks,
    int stepBlocks,
    int terrainSampleRadius,
    int placementYOffset,
    net.minecraft.world.level.levelgen.Heightmap.Types heightmapType,
    int maximumSamples
)
```

 

Creates an instance of a `WorldgenSurfaceCandidateRequest` record class.

 

**Parameters:**

 

`dimension` - the value for the `dimension` record component

 

`anchorBlockX` - the value for the `anchorBlockX` record component

 

`anchorBlockZ` - the value for the `anchorBlockZ` record component

 

`searchRadiusBlocks` - the value for the `searchRadiusBlocks` record component

 

`stepBlocks` - the value for the `stepBlocks` record component

 

`terrainSampleRadius` - the value for the `terrainSampleRadius` record component

 

`placementYOffset` - the value for the `placementYOffset` record component

 

`heightmapType` - the value for the `heightmapType` record component

 

`maximumSamples` - the value for the `maximumSamples` record component

  

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

 

### anchorBlockX

  

```java
public int anchorBlockX()
```

 

Returns the value of the `anchorBlockX` record component.

 

**Returns:**

 

the value of the `anchorBlockX` record component

 

### anchorBlockZ

  

```java
public int anchorBlockZ()
```

 

Returns the value of the `anchorBlockZ` record component.

 

**Returns:**

 

the value of the `anchorBlockZ` record component

 

### searchRadiusBlocks

  

```java
public int searchRadiusBlocks()
```

 

Returns the value of the `searchRadiusBlocks` record component.

 

**Returns:**

 

the value of the `searchRadiusBlocks` record component

 

### stepBlocks

  

```java
public int stepBlocks()
```

 

Returns the value of the `stepBlocks` record component.

 

**Returns:**

 

the value of the `stepBlocks` record component

 

### terrainSampleRadius

  

```java
public int terrainSampleRadius()
```

 

Returns the value of the `terrainSampleRadius` record component.

 

**Returns:**

 

the value of the `terrainSampleRadius` record component

 

### placementYOffset

  

```java
public int placementYOffset()
```

 

Returns the value of the `placementYOffset` record component.

 

**Returns:**

 

the value of the `placementYOffset` record component

 

### heightmapType

  

```java
public net.minecraft.world.level.levelgen.Heightmap.Types heightmapType()
```

 

Returns the value of the `heightmapType` record component.

 

**Returns:**

 

the value of the `heightmapType` record component

 

### maximumSamples

  

```java
public int maximumSamples()
```

 

Returns the value of the `maximumSamples` record component.

 

**Returns:**

 

the value of the `maximumSamples` record component
