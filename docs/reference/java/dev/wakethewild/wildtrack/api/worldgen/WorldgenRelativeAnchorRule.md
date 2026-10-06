# WorldgenRelativeAnchorRule

`dev.wakethewild.wildtrack.api.worldgen.WorldgenRelativeAnchorRule`

```java
public record WorldgenRelativeAnchorRule(
    net.minecraft.resources.Identifier id,
    long salt,
    int minimumDistanceChunks,
    int maximumDistanceChunks
)
```

## Field Details

 

### MAXIMUM_DISTANCE_CHUNKS

  

```java
public static final int MAXIMUM_DISTANCE_CHUNKS
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

  

## Constructor Details

 

### WorldgenRelativeAnchorRule

  

```java
public WorldgenRelativeAnchorRule(
    net.minecraft.resources.Identifier id,
    long salt,
    int minimumDistanceChunks,
    int maximumDistanceChunks
)
```

 

Creates an instance of a `WorldgenRelativeAnchorRule` record class.

 

**Parameters:**

 

`id` - the value for the `id` record component

 

`salt` - the value for the `salt` record component

 

`minimumDistanceChunks` - the value for the `minimumDistanceChunks` record component

 

`maximumDistanceChunks` - the value for the `maximumDistanceChunks` record component

  

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

 

### id

  

```java
public net.minecraft.resources.Identifier id()
```

 

Returns the value of the `id` record component.

 

**Returns:**

 

the value of the `id` record component

 

### salt

  

```java
public long salt()
```

 

Returns the value of the `salt` record component.

 

**Returns:**

 

the value of the `salt` record component

 

### minimumDistanceChunks

  

```java
public int minimumDistanceChunks()
```

 

Returns the value of the `minimumDistanceChunks` record component.

 

**Returns:**

 

the value of the `minimumDistanceChunks` record component

 

### maximumDistanceChunks

  

```java
public int maximumDistanceChunks()
```

 

Returns the value of the `maximumDistanceChunks` record component.

 

**Returns:**

 

the value of the `maximumDistanceChunks` record component
