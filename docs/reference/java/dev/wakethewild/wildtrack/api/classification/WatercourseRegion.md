# WatercourseRegion

`dev.wakethewild.wildtrack.api.classification.WatercourseRegion`

```java
public record WatercourseRegion(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    Set<net.minecraft.world.level.ChunkPos> chunks,
    Map<net.minecraft.world.level.ChunkPos, Long> revisions,
    Completeness completeness,
    Set<WatercourseFrontier> frontier,
    boolean truncated,
    double meanWidthBlocks,
    double meanConfidence
)
```

 

Bounded connected component assembled from exact opposing river edge masks.

## Constructor Details

 

### WatercourseRegion

  

```java
public WatercourseRegion(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    Set<net.minecraft.world.level.ChunkPos> chunks,
    Map<net.minecraft.world.level.ChunkPos, Long> revisions,
    Completeness completeness,
    Set<WatercourseFrontier> frontier,
    boolean truncated,
    double meanWidthBlocks,
    double meanConfidence
)
```

 

Creates an instance of a `WatercourseRegion` record class.

 

**Parameters:**

 

`dimension` - the value for the `dimension` record component

 

`chunks` - the value for the `chunks` record component

 

`revisions` - the value for the `revisions` record component

 

`completeness` - the value for the `completeness` record component

 

`frontier` - the value for the `frontier` record component

 

`truncated` - the value for the `truncated` record component

 

`meanWidthBlocks` - the value for the `meanWidthBlocks` record component

 

`meanConfidence` - the value for the `meanConfidence` record component

  

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

 

### frontier

  

```java
public Set<WatercourseFrontier> frontier()
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

 

### meanWidthBlocks

  

```java
public double meanWidthBlocks()
```

 

Returns the value of the `meanWidthBlocks` record component.

 

**Returns:**

 

the value of the `meanWidthBlocks` record component

 

### meanConfidence

  

```java
public double meanConfidence()
```

 

Returns the value of the `meanConfidence` record component.

 

**Returns:**

 

the value of the `meanConfidence` record component
