# RuntimeObservationDemand

`dev.wakethewild.wildtrack.api.runtime.RuntimeObservationDemand`

```java
public record RuntimeObservationDemand(
    net.minecraft.resources.Identifier owner,
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos center,
    int radius,
    int durationTicks,
    Set<RuntimeObservationCapability> capabilities
)
```

 

A bounded, temporary request to analyze already-loaded chunks around a point.

## Constructor Details

 

### RuntimeObservationDemand

  

```java
public RuntimeObservationDemand(
    net.minecraft.resources.Identifier owner,
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos center,
    int radius,
    int durationTicks,
    Set<RuntimeObservationCapability> capabilities
)
```

 

Creates an instance of a `RuntimeObservationDemand` record class.

 

**Parameters:**

 

`owner` - the value for the `owner` record component

 

`dimension` - the value for the `dimension` record component

 

`center` - the value for the `center` record component

 

`radius` - the value for the `radius` record component

 

`durationTicks` - the value for the `durationTicks` record component

 

`capabilities` - the value for the `capabilities` record component

  

## Method Details

 

### subterranean

  

```java
public static RuntimeObservationDemand subterranean(
    net.minecraft.resources.Identifier owner,
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos center,
    int radius,
    int durationTicks
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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. Reference components are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)); primitive components are compared with the `compare` method from their corresponding wrapper classes.

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### owner

  

```java
public net.minecraft.resources.Identifier owner()
```

 

Returns the value of the `owner` record component.

 

**Returns:**

 

the value of the `owner` record component

 

### dimension

  

```java
public net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension()
```

 

Returns the value of the `dimension` record component.

 

**Returns:**

 

the value of the `dimension` record component

 

### center

  

```java
public net.minecraft.world.level.ChunkPos center()
```

 

Returns the value of the `center` record component.

 

**Returns:**

 

the value of the `center` record component

 

### radius

  

```java
public int radius()
```

 

Returns the value of the `radius` record component.

 

**Returns:**

 

the value of the `radius` record component

 

### durationTicks

  

```java
public int durationTicks()
```

 

Returns the value of the `durationTicks` record component.

 

**Returns:**

 

the value of the `durationTicks` record component

 

### capabilities

  

```java
public Set<RuntimeObservationCapability> capabilities()
```

 

Returns the value of the `capabilities` record component.

 

**Returns:**

 

the value of the `capabilities` record component
