# WorldgenAnchorRequest

`dev.wakethewild.wildtrack.api.worldgen.WorldgenAnchorRequest`

```java
public record WorldgenAnchorRequest(
    long worldSeed,
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos candidateChunk,
    WorldgenAnchorRule rule
)
```

## Constructor Details

 

### WorldgenAnchorRequest

  

```java
public WorldgenAnchorRequest(
    long worldSeed,
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos candidateChunk,
    WorldgenAnchorRule rule
)
```

 

Creates an instance of a `WorldgenAnchorRequest` record class.

 

**Parameters:**

 

`worldSeed` - the value for the `worldSeed` record component

 

`dimension` - the value for the `dimension` record component

 

`candidateChunk` - the value for the `candidateChunk` record component

 

`rule` - the value for the `rule` record component

  

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

 

### worldSeed

  

```java
public long worldSeed()
```

 

Returns the value of the `worldSeed` record component.

 

**Returns:**

 

the value of the `worldSeed` record component

 

### dimension

  

```java
public net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension()
```

 

Returns the value of the `dimension` record component.

 

**Returns:**

 

the value of the `dimension` record component

 

### candidateChunk

  

```java
public net.minecraft.world.level.ChunkPos candidateChunk()
```

 

Returns the value of the `candidateChunk` record component.

 

**Returns:**

 

the value of the `candidateChunk` record component

 

### rule

  

```java
public WorldgenAnchorRule rule()
```

 

Returns the value of the `rule` record component.

 

**Returns:**

 

the value of the `rule` record component
