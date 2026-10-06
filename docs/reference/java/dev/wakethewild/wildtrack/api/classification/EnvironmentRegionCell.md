# EnvironmentRegionCell

`dev.wakethewild.wildtrack.api.classification.EnvironmentRegionCell`

```java
public record EnvironmentRegionCell(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunk,
    Optional<net.minecraft.resources.Identifier> environmentType,
    OptionalDouble confidence,
    Optional<LocationId> regionId,
    boolean regionEligible,
    List<EnvironmentRegionSignal> signals
)
```

 

Current progressively discovered environment-region state for one chunk.

## Constructor Details

 

### EnvironmentRegionCell

  

```java
public EnvironmentRegionCell(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunk,
    Optional<net.minecraft.resources.Identifier> environmentType,
    OptionalDouble confidence,
    Optional<LocationId> regionId,
    boolean regionEligible,
    List<EnvironmentRegionSignal> signals
)
```

 

Creates an instance of a `EnvironmentRegionCell` record class.

 

**Parameters:**

 

`dimension` - the value for the `dimension` record component

 

`chunk` - the value for the `chunk` record component

 

`environmentType` - the value for the `environmentType` record component

 

`confidence` - the value for the `confidence` record component

 

`regionId` - the value for the `regionId` record component

 

`regionEligible` - the value for the `regionEligible` record component

 

`signals` - the value for the `signals` record component

  

## Method Details

 

### known

  

```java
public boolean known()
```

 

### unknown

  

```java
public static EnvironmentRegionCell unknown(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    net.minecraft.world.level.ChunkPos chunk
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

 

### dimension

  

```java
public net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension()
```

 

Returns the value of the `dimension` record component.

 

**Returns:**

 

the value of the `dimension` record component

 

### chunk

  

```java
public net.minecraft.world.level.ChunkPos chunk()
```

 

Returns the value of the `chunk` record component.

 

**Returns:**

 

the value of the `chunk` record component

 

### environmentType

  

```java
public Optional<net.minecraft.resources.Identifier> environmentType()
```

 

Returns the value of the `environmentType` record component.

 

**Returns:**

 

the value of the `environmentType` record component

 

### confidence

  

```java
public OptionalDouble confidence()
```

 

Returns the value of the `confidence` record component.

 

**Returns:**

 

the value of the `confidence` record component

 

### regionId

  

```java
public Optional<LocationId> regionId()
```

 

Returns the value of the `regionId` record component.

 

**Returns:**

 

the value of the `regionId` record component

 

### regionEligible

  

```java
public boolean regionEligible()
```

 

Returns the value of the `regionEligible` record component.

 

**Returns:**

 

the value of the `regionEligible` record component

 

### signals

  

```java
public List<EnvironmentRegionSignal> signals()
```

 

Returns the value of the `signals` record component.

 

**Returns:**

 

the value of the `signals` record component
