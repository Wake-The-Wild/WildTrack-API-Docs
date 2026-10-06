# WorldgenRelativeAnchorPlan

`dev.wakethewild.wildtrack.api.worldgen.WorldgenRelativeAnchorPlan`

```java
public record WorldgenRelativeAnchorPlan(
    net.minecraft.resources.Identifier ruleId,
    net.minecraft.resources.Identifier originRuleId,
    net.minecraft.world.level.ChunkPos originChunk,
    net.minecraft.world.level.ChunkPos anchorChunk,
    int distanceChunks
)
```

## Constructor Details

 

### WorldgenRelativeAnchorPlan

  

```java
public WorldgenRelativeAnchorPlan(
    net.minecraft.resources.Identifier ruleId,
    net.minecraft.resources.Identifier originRuleId,
    net.minecraft.world.level.ChunkPos originChunk,
    net.minecraft.world.level.ChunkPos anchorChunk,
    int distanceChunks
)
```

 

Creates an instance of a `WorldgenRelativeAnchorPlan` record class.

 

**Parameters:**

 

`ruleId` - the value for the `ruleId` record component

 

`originRuleId` - the value for the `originRuleId` record component

 

`originChunk` - the value for the `originChunk` record component

 

`anchorChunk` - the value for the `anchorChunk` record component

 

`distanceChunks` - the value for the `distanceChunks` record component

  

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

 

### originRuleId

  

```java
public net.minecraft.resources.Identifier originRuleId()
```

 

Returns the value of the `originRuleId` record component.

 

**Returns:**

 

the value of the `originRuleId` record component

 

### originChunk

  

```java
public net.minecraft.world.level.ChunkPos originChunk()
```

 

Returns the value of the `originChunk` record component.

 

**Returns:**

 

the value of the `originChunk` record component

 

### anchorChunk

  

```java
public net.minecraft.world.level.ChunkPos anchorChunk()
```

 

Returns the value of the `anchorChunk` record component.

 

**Returns:**

 

the value of the `anchorChunk` record component

 

### distanceChunks

  

```java
public int distanceChunks()
```

 

Returns the value of the `distanceChunks` record component.

 

**Returns:**

 

the value of the `distanceChunks` record component
