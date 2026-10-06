# SubterraneanRegion

`dev.wakethewild.wildtrack.api.subterranean.SubterraneanRegion`

```java
public record SubterraneanRegion(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    Set<net.minecraft.world.level.ChunkPos> chunks,
    Map<net.minecraft.world.level.ChunkPos, Long> revisions,
    Completeness completeness,
    Set<net.minecraft.world.level.ChunkPos> missingChunks,
    Set<SubterraneanFrontier> frontier,
    boolean truncated,
    long analyzedUndergroundBlocks,
    long undergroundAirBlocks,
    long undergroundFluidBlocks,
    int largestKnownVoidBlocks,
    long localVoidComponents,
    long boundaryConnectedLocalComponents,
    long surfaceConnectedLocalComponents,
    long entranceCandidateColumns,
    double undergroundAirFraction,
    double undergroundFluidFraction,
    List<KnownVoidShape> knownVoidShapes,
    OptionalInt minimumAirY,
    OptionalInt maximumAirY,
    boolean exactComponentTopology,
    List<CrossChunkVoidComponent> crossChunkVoidComponents
)
```

 

Aggregated known component of caves connected through exact chunk-face openings.

## Constructor Details

 

### SubterraneanRegion

  

```java
public SubterraneanRegion(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    Set<net.minecraft.world.level.ChunkPos> chunks,
    Map<net.minecraft.world.level.ChunkPos, Long> revisions,
    Completeness completeness,
    Set<net.minecraft.world.level.ChunkPos> missingChunks,
    Set<SubterraneanFrontier> frontier,
    boolean truncated,
    long analyzedUndergroundBlocks,
    long undergroundAirBlocks,
    long undergroundFluidBlocks,
    int largestKnownVoidBlocks,
    long localVoidComponents,
    long boundaryConnectedLocalComponents,
    long surfaceConnectedLocalComponents,
    long entranceCandidateColumns,
    double undergroundAirFraction,
    double undergroundFluidFraction,
    List<KnownVoidShape> knownVoidShapes,
    OptionalInt minimumAirY,
    OptionalInt maximumAirY,
    boolean exactComponentTopology,
    List<CrossChunkVoidComponent> crossChunkVoidComponents
)
```

 

Creates an instance of a `SubterraneanRegion` record class.

 

**Parameters:**

 

`dimension` - the value for the `dimension` record component

 

`chunks` - the value for the `chunks` record component

 

`revisions` - the value for the `revisions` record component

 

`completeness` - the value for the `completeness` record component

 

`missingChunks` - the value for the `missingChunks` record component

 

`frontier` - the value for the `frontier` record component

 

`truncated` - the value for the `truncated` record component

 

`analyzedUndergroundBlocks` - the value for the `analyzedUndergroundBlocks` record component

 

`undergroundAirBlocks` - the value for the `undergroundAirBlocks` record component

 

`undergroundFluidBlocks` - the value for the `undergroundFluidBlocks` record component

 

`largestKnownVoidBlocks` - the value for the `largestKnownVoidBlocks` record component

 

`localVoidComponents` - the value for the `localVoidComponents` record component

 

`boundaryConnectedLocalComponents` - the value for the `boundaryConnectedLocalComponents` record component

 

`surfaceConnectedLocalComponents` - the value for the `surfaceConnectedLocalComponents` record component

 

`entranceCandidateColumns` - the value for the `entranceCandidateColumns` record component

 

`undergroundAirFraction` - the value for the `undergroundAirFraction` record component

 

`undergroundFluidFraction` - the value for the `undergroundFluidFraction` record component

 

`knownVoidShapes` - the value for the `knownVoidShapes` record component

 

`minimumAirY` - the value for the `minimumAirY` record component

 

`maximumAirY` - the value for the `maximumAirY` record component

 

`exactComponentTopology` - the value for the `exactComponentTopology` record component

 

`crossChunkVoidComponents` - the value for the `crossChunkVoidComponents` record component

 

### SubterraneanRegion

  

```java
public SubterraneanRegion(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    Set<net.minecraft.world.level.ChunkPos> chunks,
    Map<net.minecraft.world.level.ChunkPos, Long> revisions,
    Completeness completeness,
    Set<net.minecraft.world.level.ChunkPos> missingChunks,
    Set<SubterraneanFrontier> frontier,
    boolean truncated,
    long analyzedUndergroundBlocks,
    long undergroundAirBlocks,
    long undergroundFluidBlocks,
    int largestKnownVoidBlocks,
    long localVoidComponents,
    long boundaryConnectedLocalComponents,
    long surfaceConnectedLocalComponents,
    long entranceCandidateColumns,
    double undergroundAirFraction,
    double undergroundFluidFraction,
    List<KnownVoidShape> knownVoidShapes,
    OptionalInt minimumAirY,
    OptionalInt maximumAirY
)
```

  

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

 

### chunks

  

```java
public Set<net.minecraft.world.level.ChunkPos> chunks()
```

 

Returns the value of the `chunks` record component.

 

**Returns:**

 

the value of the `chunks` record component

 

### revisions

  

```java
public Map<net.minecraft.world.level.ChunkPos, Long> revisions()
```

 

Returns the value of the `revisions` record component.

 

**Returns:**

 

the value of the `revisions` record component

 

### completeness

  

```java
public Completeness completeness()
```

 

Returns the value of the `completeness` record component.

 

**Returns:**

 

the value of the `completeness` record component

 

### missingChunks

  

```java
public Set<net.minecraft.world.level.ChunkPos> missingChunks()
```

 

Returns the value of the `missingChunks` record component.

 

**Returns:**

 

the value of the `missingChunks` record component

 

### frontier

  

```java
public Set<SubterraneanFrontier> frontier()
```

 

Returns the value of the `frontier` record component.

 

**Returns:**

 

the value of the `frontier` record component

 

### truncated

  

```java
public boolean truncated()
```

 

Returns the value of the `truncated` record component.

 

**Returns:**

 

the value of the `truncated` record component

 

### analyzedUndergroundBlocks

  

```java
public long analyzedUndergroundBlocks()
```

 

Returns the value of the `analyzedUndergroundBlocks` record component.

 

**Returns:**

 

the value of the `analyzedUndergroundBlocks` record component

 

### undergroundAirBlocks

  

```java
public long undergroundAirBlocks()
```

 

Returns the value of the `undergroundAirBlocks` record component.

 

**Returns:**

 

the value of the `undergroundAirBlocks` record component

 

### undergroundFluidBlocks

  

```java
public long undergroundFluidBlocks()
```

 

Returns the value of the `undergroundFluidBlocks` record component.

 

**Returns:**

 

the value of the `undergroundFluidBlocks` record component

 

### largestKnownVoidBlocks

  

```java
public int largestKnownVoidBlocks()
```

 

Returns the value of the `largestKnownVoidBlocks` record component.

 

**Returns:**

 

the value of the `largestKnownVoidBlocks` record component

 

### localVoidComponents

  

```java
public long localVoidComponents()
```

 

Returns the value of the `localVoidComponents` record component.

 

**Returns:**

 

the value of the `localVoidComponents` record component

 

### boundaryConnectedLocalComponents

  

```java
public long boundaryConnectedLocalComponents()
```

 

Returns the value of the `boundaryConnectedLocalComponents` record component.

 

**Returns:**

 

the value of the `boundaryConnectedLocalComponents` record component

 

### surfaceConnectedLocalComponents

  

```java
public long surfaceConnectedLocalComponents()
```

 

Returns the value of the `surfaceConnectedLocalComponents` record component.

 

**Returns:**

 

the value of the `surfaceConnectedLocalComponents` record component

 

### entranceCandidateColumns

  

```java
public long entranceCandidateColumns()
```

 

Returns the value of the `entranceCandidateColumns` record component.

 

**Returns:**

 

the value of the `entranceCandidateColumns` record component

 

### undergroundAirFraction

  

```java
public double undergroundAirFraction()
```

 

Returns the value of the `undergroundAirFraction` record component.

 

**Returns:**

 

the value of the `undergroundAirFraction` record component

 

### undergroundFluidFraction

  

```java
public double undergroundFluidFraction()
```

 

Returns the value of the `undergroundFluidFraction` record component.

 

**Returns:**

 

the value of the `undergroundFluidFraction` record component

 

### knownVoidShapes

  

```java
public List<KnownVoidShape> knownVoidShapes()
```

 

Returns the value of the `knownVoidShapes` record component.

 

**Returns:**

 

the value of the `knownVoidShapes` record component

 

### minimumAirY

  

```java
public OptionalInt minimumAirY()
```

 

Returns the value of the `minimumAirY` record component.

 

**Returns:**

 

the value of the `minimumAirY` record component

 

### maximumAirY

  

```java
public OptionalInt maximumAirY()
```

 

Returns the value of the `maximumAirY` record component.

 

**Returns:**

 

the value of the `maximumAirY` record component

 

### exactComponentTopology

  

```java
public boolean exactComponentTopology()
```

 

Returns the value of the `exactComponentTopology` record component.

 

**Returns:**

 

the value of the `exactComponentTopology` record component

 

### crossChunkVoidComponents

  

```java
public List<CrossChunkVoidComponent> crossChunkVoidComponents()
```

 

Returns the value of the `crossChunkVoidComponents` record component.

 

**Returns:**

 

the value of the `crossChunkVoidComponents` record component
