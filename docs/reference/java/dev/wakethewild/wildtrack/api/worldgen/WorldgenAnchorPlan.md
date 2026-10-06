# WorldgenAnchorPlan

`dev.wakethewild.wildtrack.api.worldgen.WorldgenAnchorPlan`

```java
public record WorldgenAnchorPlan(
    net.minecraft.resources.Identifier ruleId,
    int regionX,
    int regionZ,
    net.minecraft.world.level.ChunkPos anchorChunk
)
```

## Constructor Details

 

### WorldgenAnchorPlan

  

```java
public WorldgenAnchorPlan(
    net.minecraft.resources.Identifier ruleId,
    int regionX,
    int regionZ,
    net.minecraft.world.level.ChunkPos anchorChunk
)
```

 

Creates an instance of a `WorldgenAnchorPlan` record class.

 

**Parameters:**

 

`ruleId` - the value for the `ruleId` record component

 

`regionX` - the value for the `regionX` record component

 

`regionZ` - the value for the `regionZ` record component

 

`anchorChunk` - the value for the `anchorChunk` record component

  

## Method Details

 

### contains

  

```java
public boolean contains(net.minecraft.world.level.ChunkPos chunk)
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

 

### ruleId

  

```java
public net.minecraft.resources.Identifier ruleId()
```

 

Returns the value of the `ruleId` record component.

 

**Returns:**

 

the value of the `ruleId` record component

 

### regionX

  

```java
public int regionX()
```

 

Returns the value of the `regionX` record component.

 

**Returns:**

 

the value of the `regionX` record component

 

### regionZ

  

```java
public int regionZ()
```

 

Returns the value of the `regionZ` record component.

 

**Returns:**

 

the value of the `regionZ` record component

 

### anchorChunk

  

```java
public net.minecraft.world.level.ChunkPos anchorChunk()
```

 

Returns the value of the `anchorChunk` record component.

 

**Returns:**

 

the value of the `anchorChunk` record component
