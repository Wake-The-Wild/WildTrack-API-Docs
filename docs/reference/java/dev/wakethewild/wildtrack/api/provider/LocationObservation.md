# LocationObservation

`dev.wakethewild.wildtrack.api.provider.LocationObservation`

```java
public record LocationObservation(
    LocationId id,
    LocationTypeId type,
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.core.BlockPos anchor,
    Optional<net.minecraft.core.BlockPos> center,
    SpatialGeometry geometry,
    Set<net.minecraft.resources.Identifier> tags,
    MetadataView metadata
)
```

 

Provider-owned location state submitted to WildTrack for indexing.

## Constructor Details

 

### LocationObservation

  

```java
public LocationObservation(
    LocationId id,
    LocationTypeId type,
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.core.BlockPos anchor,
    Optional<net.minecraft.core.BlockPos> center,
    SpatialGeometry geometry,
    Set<net.minecraft.resources.Identifier> tags,
    MetadataView metadata
)
```

 

Creates an instance of a `LocationObservation` record class.

 

**Parameters:**

 

`id` - the value for the `id` record component

 

`type` - the value for the `type` record component

 

`dimension` - the value for the `dimension` record component

 

`anchor` - the value for the `anchor` record component

 

`center` - the value for the `center` record component

 

`geometry` - the value for the `geometry` record component

 

`tags` - the value for the `tags` record component

 

`metadata` - the value for the `metadata` record component

  

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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)).

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### id

  

```java
public LocationId id()
```

 

Returns the value of the `id` record component.

 

**Returns:**

 

the value of the `id` record component

 

### type

  

```java
public LocationTypeId type()
```

 

Returns the value of the `type` record component.

 

**Returns:**

 

the value of the `type` record component

 

### dimension

  

```java
public net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension()
```

 

Returns the value of the `dimension` record component.

 

**Returns:**

 

the value of the `dimension` record component

 

### anchor

  

```java
public net.minecraft.core.BlockPos anchor()
```

 

Returns the value of the `anchor` record component.

 

**Returns:**

 

the value of the `anchor` record component

 

### center

  

```java
public Optional<net.minecraft.core.BlockPos> center()
```

 

Returns the value of the `center` record component.

 

**Returns:**

 

the value of the `center` record component

 

### geometry

  

```java
public SpatialGeometry geometry()
```

 

Returns the value of the `geometry` record component.

 

**Returns:**

 

the value of the `geometry` record component

 

### tags

  

```java
public Set<net.minecraft.resources.Identifier> tags()
```

 

Returns the value of the `tags` record component.

 

**Returns:**

 

the value of the `tags` record component

 

### metadata

  

```java
public MetadataView metadata()
```

 

Returns the value of the `metadata` record component.

 

**Returns:**

 

the value of the `metadata` record component
