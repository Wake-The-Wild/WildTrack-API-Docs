# SubterraneanProfile

`dev.wakethewild.wildtrack.api.subterranean.SubterraneanProfile`

```java
public record SubterraneanProfile(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunkPosition,
    long revision,
    ContentFingerprint contentFingerprint,
    Completeness completeness,
    int analyzedUndergroundBlocks,
    int undergroundAirBlocks,
    int deepAirBlocks,
    int undergroundFluidBlocks,
    int boundaryAirBlocks,
    int connectedVoidComponents,
    int boundaryConnectedComponents,
    int largestVoidBlocks,
    Optional<LargestVoidShape> largestVoidShape,
    int surfaceConnectedComponents,
    EntranceColumnMask entranceCandidates,
    Map<HorizontalFace, BoundaryOpeningMask> boundaryOpenings,
    OptionalInt minimumAirY,
    OptionalInt maximumAirY,
    double undergroundAirFraction,
    double deepAirFraction,
    List<BoundaryVoidComponent> boundaryVoidComponents
)
```

 

Chunk-local measurements used as input for later cross-chunk cave reconstruction.

## Constructor Details

 

### SubterraneanProfile

  

```java
public SubterraneanProfile(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunkPosition,
    long revision,
    ContentFingerprint contentFingerprint,
    Completeness completeness,
    int analyzedUndergroundBlocks,
    int undergroundAirBlocks,
    int deepAirBlocks,
    int undergroundFluidBlocks,
    int boundaryAirBlocks,
    int connectedVoidComponents,
    int boundaryConnectedComponents,
    int largestVoidBlocks,
    Optional<LargestVoidShape> largestVoidShape,
    int surfaceConnectedComponents,
    EntranceColumnMask entranceCandidates,
    Map<HorizontalFace, BoundaryOpeningMask> boundaryOpenings,
    OptionalInt minimumAirY,
    OptionalInt maximumAirY,
    double undergroundAirFraction,
    double deepAirFraction,
    List<BoundaryVoidComponent> boundaryVoidComponents
)
```

 

Creates an instance of a `SubterraneanProfile` record class.

 

**Parameters:**

 

`dimension` - the value for the `dimension` record component

 

`chunkPosition` - the value for the `chunkPosition` record component

 

`revision` - the value for the `revision` record component

 

`contentFingerprint` - the value for the `contentFingerprint` record component

 

`completeness` - the value for the `completeness` record component

 

`analyzedUndergroundBlocks` - the value for the `analyzedUndergroundBlocks` record component

 

`undergroundAirBlocks` - the value for the `undergroundAirBlocks` record component

 

`deepAirBlocks` - the value for the `deepAirBlocks` record component

 

`undergroundFluidBlocks` - the value for the `undergroundFluidBlocks` record component

 

`boundaryAirBlocks` - the value for the `boundaryAirBlocks` record component

 

`connectedVoidComponents` - the value for the `connectedVoidComponents` record component

 

`boundaryConnectedComponents` - the value for the `boundaryConnectedComponents` record component

 

`largestVoidBlocks` - the value for the `largestVoidBlocks` record component

 

`largestVoidShape` - the value for the `largestVoidShape` record component

 

`surfaceConnectedComponents` - the value for the `surfaceConnectedComponents` record component

 

`entranceCandidates` - the value for the `entranceCandidates` record component

 

`boundaryOpenings` - the value for the `boundaryOpenings` record component

 

`minimumAirY` - the value for the `minimumAirY` record component

 

`maximumAirY` - the value for the `maximumAirY` record component

 

`undergroundAirFraction` - the value for the `undergroundAirFraction` record component

 

`deepAirFraction` - the value for the `deepAirFraction` record component

 

`boundaryVoidComponents` - the value for the `boundaryVoidComponents` record component

 

### SubterraneanProfile

  

```java
public SubterraneanProfile(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunkPosition,
    long revision,
    ContentFingerprint contentFingerprint,
    Completeness completeness,
    int analyzedUndergroundBlocks,
    int undergroundAirBlocks,
    int deepAirBlocks,
    int undergroundFluidBlocks,
    int boundaryAirBlocks,
    int connectedVoidComponents,
    int boundaryConnectedComponents,
    int largestVoidBlocks,
    Optional<LargestVoidShape> largestVoidShape,
    int surfaceConnectedComponents,
    EntranceColumnMask entranceCandidates,
    Map<HorizontalFace, BoundaryOpeningMask> boundaryOpenings,
    OptionalInt minimumAirY,
    OptionalInt maximumAirY,
    double undergroundAirFraction,
    double deepAirFraction
)
```

 

### SubterraneanProfile

  

```java
public SubterraneanProfile(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunkPosition,
    long revision,
    ContentFingerprint contentFingerprint,
    Completeness completeness,
    int analyzedUndergroundBlocks,
    int undergroundAirBlocks,
    int deepAirBlocks,
    int undergroundFluidBlocks,
    int boundaryAirBlocks,
    int connectedVoidComponents,
    int boundaryConnectedComponents,
    int largestVoidBlocks,
    int surfaceConnectedComponents,
    EntranceColumnMask entranceCandidates,
    Map<HorizontalFace, BoundaryOpeningMask> boundaryOpenings,
    OptionalInt minimumAirY,
    OptionalInt maximumAirY,
    double undergroundAirFraction,
    double deepAirFraction
)
```

 

Compatibility constructor for persisted or manually assembled profiles without shape bounds.

  

## Method Details

 

### hasCaveCandidate

  

```java
public boolean hasCaveCandidate()
```

 

### hasEntranceCandidate

  

```java
public boolean hasEntranceCandidate()
```

 

### undergroundFluidFraction

  

```java
public double undergroundFluidFraction()
```

 

### largestVoidShare

  

```java
public double largestVoidShare()
```

 

### entranceRegions

  

```java
public List<EntranceColumnRegion> entranceRegions()
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

 

### contentFingerprint

  

```java
public ContentFingerprint contentFingerprint()
```

 

Returns the value of the `contentFingerprint` record component.

 

**Returns:**

 

the value of the `contentFingerprint` record component

 

### completeness

  

```java
public Completeness completeness()
```

 

Returns the value of the `completeness` record component.

 

**Returns:**

 

the value of the `completeness` record component

 

### analyzedUndergroundBlocks

  

```java
public int analyzedUndergroundBlocks()
```

 

Returns the value of the `analyzedUndergroundBlocks` record component.

 

**Returns:**

 

the value of the `analyzedUndergroundBlocks` record component

 

### undergroundAirBlocks

  

```java
public int undergroundAirBlocks()
```

 

Returns the value of the `undergroundAirBlocks` record component.

 

**Returns:**

 

the value of the `undergroundAirBlocks` record component

 

### deepAirBlocks

  

```java
public int deepAirBlocks()
```

 

Returns the value of the `deepAirBlocks` record component.

 

**Returns:**

 

the value of the `deepAirBlocks` record component

 

### undergroundFluidBlocks

  

```java
public int undergroundFluidBlocks()
```

 

Returns the value of the `undergroundFluidBlocks` record component.

 

**Returns:**

 

the value of the `undergroundFluidBlocks` record component

 

### boundaryAirBlocks

  

```java
public int boundaryAirBlocks()
```

 

Returns the value of the `boundaryAirBlocks` record component.

 

**Returns:**

 

the value of the `boundaryAirBlocks` record component

 

### connectedVoidComponents

  

```java
public int connectedVoidComponents()
```

 

Returns the value of the `connectedVoidComponents` record component.

 

**Returns:**

 

the value of the `connectedVoidComponents` record component

 

### boundaryConnectedComponents

  

```java
public int boundaryConnectedComponents()
```

 

Returns the value of the `boundaryConnectedComponents` record component.

 

**Returns:**

 

the value of the `boundaryConnectedComponents` record component

 

### largestVoidBlocks

  

```java
public int largestVoidBlocks()
```

 

Returns the value of the `largestVoidBlocks` record component.

 

**Returns:**

 

the value of the `largestVoidBlocks` record component

 

### largestVoidShape

  

```java
public Optional<LargestVoidShape> largestVoidShape()
```

 

Returns the value of the `largestVoidShape` record component.

 

**Returns:**

 

the value of the `largestVoidShape` record component

 

### surfaceConnectedComponents

  

```java
public int surfaceConnectedComponents()
```

 

Returns the value of the `surfaceConnectedComponents` record component.

 

**Returns:**

 

the value of the `surfaceConnectedComponents` record component

 

### entranceCandidates

  

```java
public EntranceColumnMask entranceCandidates()
```

 

Returns the value of the `entranceCandidates` record component.

 

**Returns:**

 

the value of the `entranceCandidates` record component

 

### boundaryOpenings

  

```java
public Map<HorizontalFace, BoundaryOpeningMask> boundaryOpenings()
```

 

Returns the value of the `boundaryOpenings` record component.

 

**Returns:**

 

the value of the `boundaryOpenings` record component

 

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

 

### undergroundAirFraction

  

```java
public double undergroundAirFraction()
```

 

Returns the value of the `undergroundAirFraction` record component.

 

**Returns:**

 

the value of the `undergroundAirFraction` record component

 

### deepAirFraction

  

```java
public double deepAirFraction()
```

 

Returns the value of the `deepAirFraction` record component.

 

**Returns:**

 

the value of the `deepAirFraction` record component

 

### boundaryVoidComponents

  

```java
public List<BoundaryVoidComponent> boundaryVoidComponents()
```

 

Returns the value of the `boundaryVoidComponents` record component.

 

**Returns:**

 

the value of the `boundaryVoidComponents` record component
