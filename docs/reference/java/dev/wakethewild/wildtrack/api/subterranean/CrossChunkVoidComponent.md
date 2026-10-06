# CrossChunkVoidComponent

`dev.wakethewild.wildtrack.api.subterranean.CrossChunkVoidComponent`

```java
public record CrossChunkVoidComponent(
    Set<net.minecraft.world.level.ChunkPos> chunks,
    long blocks,
    boolean surfaceConnected,
    boolean openFrontier,
    List<KnownVoidShape> fragments
)
```

 

Exact known void component assembled from chunk-local component fragments.

## Constructor Details

 

### CrossChunkVoidComponent

  

```java
public CrossChunkVoidComponent(
    Set<net.minecraft.world.level.ChunkPos> chunks,
    long blocks,
    boolean surfaceConnected,
    boolean openFrontier,
    List<KnownVoidShape> fragments
)
```

 

Creates an instance of a `CrossChunkVoidComponent` record class.

 

**Parameters:**

 

`chunks` - the value for the `chunks` record component

 

`blocks` - the value for the `blocks` record component

 

`surfaceConnected` - the value for the `surfaceConnected` record component

 

`openFrontier` - the value for the `openFrontier` record component

 

`fragments` - the value for the `fragments` record component

  

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

 

### chunks

  

```java
public Set<net.minecraft.world.level.ChunkPos> chunks()
```

 

Returns the value of the `chunks` record component.

 

**Returns:**

 

the value of the `chunks` record component

 

### blocks

  

```java
public long blocks()
```

 

Returns the value of the `blocks` record component.

 

**Returns:**

 

the value of the `blocks` record component

 

### surfaceConnected

  

```java
public boolean surfaceConnected()
```

 

Returns the value of the `surfaceConnected` record component.

 

**Returns:**

 

the value of the `surfaceConnected` record component

 

### openFrontier

  

```java
public boolean openFrontier()
```

 

Returns the value of the `openFrontier` record component.

 

**Returns:**

 

the value of the `openFrontier` record component

 

### fragments

  

```java
public List<KnownVoidShape> fragments()
```

 

Returns the value of the `fragments` record component.

 

**Returns:**

 

the value of the `fragments` record component
