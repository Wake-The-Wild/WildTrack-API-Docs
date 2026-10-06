# WorldgenSurfaceCandidateResult

`dev.wakethewild.wildtrack.api.worldgen.WorldgenSurfaceCandidateResult`

```java
public record WorldgenSurfaceCandidateResult(
    int totalPatternPoints,
    int sampledPoints,
    List<PlacementQuery> candidates,
    Set<net.minecraft.world.level.ChunkPos> missingChunks,
    boolean unsupportedHeightmap
)
```

 

Available surface candidates plus explicit reasons for incomplete sampling.

## Constructor Details

 

### WorldgenSurfaceCandidateResult

  

```java
public WorldgenSurfaceCandidateResult(
    int totalPatternPoints,
    int sampledPoints,
    List<PlacementQuery> candidates,
    Set<net.minecraft.world.level.ChunkPos> missingChunks,
    boolean unsupportedHeightmap
)
```

 

Creates an instance of a `WorldgenSurfaceCandidateResult` record class.

 

**Parameters:**

 

`totalPatternPoints` - the value for the `totalPatternPoints` record component

 

`sampledPoints` - the value for the `sampledPoints` record component

 

`candidates` - the value for the `candidates` record component

 

`missingChunks` - the value for the `missingChunks` record component

 

`unsupportedHeightmap` - the value for the `unsupportedHeightmap` record component

  

## Method Details

 

### complete

  

```java
public boolean complete()
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

 

### totalPatternPoints

  

```java
public int totalPatternPoints()
```

 

Returns the value of the `totalPatternPoints` record component.

 

**Returns:**

 

the value of the `totalPatternPoints` record component

 

### sampledPoints

  

```java
public int sampledPoints()
```

 

Returns the value of the `sampledPoints` record component.

 

**Returns:**

 

the value of the `sampledPoints` record component

 

### candidates

  

```java
public List<PlacementQuery> candidates()
```

 

Returns the value of the `candidates` record component.

 

**Returns:**

 

the value of the `candidates` record component

 

### missingChunks

  

```java
public Set<net.minecraft.world.level.ChunkPos> missingChunks()
```

 

Returns the value of the `missingChunks` record component.

 

**Returns:**

 

the value of the `missingChunks` record component

 

### unsupportedHeightmap

  

```java
public boolean unsupportedHeightmap()
```

 

Returns the value of the `unsupportedHeightmap` record component.

 

**Returns:**

 

the value of the `unsupportedHeightmap` record component
