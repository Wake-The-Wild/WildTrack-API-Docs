# EntranceProximityQuery

`dev.wakethewild.wildtrack.api.subterranean.EntranceProximityQuery`

```java
public record EntranceProximityQuery(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    int blockX,
    int blockZ,
    int maximumDistance
)
```

 

Bounded horizontal search for retained cave-entrance columns.

## Field Details

 

### MAXIMUM_DISTANCE

  

```java
public static final int MAXIMUM_DISTANCE
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

  

## Constructor Details

 

### EntranceProximityQuery

  

```java
public EntranceProximityQuery(
    net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension,
    int blockX,
    int blockZ,
    int maximumDistance
)
```

 

Creates an instance of a `EntranceProximityQuery` record class.

 

**Parameters:**

 

`dimension` - the value for the `dimension` record component

 

`blockX` - the value for the `blockX` record component

 

`blockZ` - the value for the `blockZ` record component

 

`maximumDistance` - the value for the `maximumDistance` record component

  

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

 

### blockX

  

```java
public int blockX()
```

 

Returns the value of the `blockX` record component.

 

**Returns:**

 

the value of the `blockX` record component

 

### blockZ

  

```java
public int blockZ()
```

 

Returns the value of the `blockZ` record component.

 

**Returns:**

 

the value of the `blockZ` record component

 

### maximumDistance

  

```java
public int maximumDistance()
```

 

Returns the value of the `maximumDistance` record component.

 

**Returns:**

 

the value of the `maximumDistance` record component
