# SurfaceMaterial

`dev.wakethewild.wildtrack.api.surface.SurfaceMaterial`

```java
public record SurfaceMaterial(
    net.minecraft.resources.Identifier blockId,
    Set<net.minecraft.resources.Identifier> blockTags,
    Optional<net.minecraft.resources.Identifier> fluidId,
    Set<net.minecraft.resources.Identifier> fluidTags
)
```

 

Registry identity and data-pack tags of a sampled block.

## Constructor Details

 

### SurfaceMaterial

  

```java
public SurfaceMaterial(
    net.minecraft.resources.Identifier blockId,
    Set<net.minecraft.resources.Identifier> blockTags,
    Optional<net.minecraft.resources.Identifier> fluidId,
    Set<net.minecraft.resources.Identifier> fluidTags
)
```

 

Creates an instance of a `SurfaceMaterial` record class.

 

**Parameters:**

 

`blockId` - the value for the `blockId` record component

 

`blockTags` - the value for the `blockTags` record component

 

`fluidId` - the value for the `fluidId` record component

 

`fluidTags` - the value for the `fluidTags` record component

 

### SurfaceMaterial

  

```java
public SurfaceMaterial(
    net.minecraft.resources.Identifier blockId,
    Set<net.minecraft.resources.Identifier> blockTags
)
```

  

## Method Details

 

### hasTag

  

```java
public boolean hasTag(net.minecraft.resources.Identifier tagId)
```

 

### containsFluid

  

```java
public boolean containsFluid()
```

 

### hasFluidTag

  

```java
public boolean hasFluidTag(net.minecraft.resources.Identifier tagId)
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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)).

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### blockId

  

```java
public net.minecraft.resources.Identifier blockId()
```

 

Returns the value of the `blockId` record component.

 

**Returns:**

 

the value of the `blockId` record component

 

### blockTags

  

```java
public Set<net.minecraft.resources.Identifier> blockTags()
```

 

Returns the value of the `blockTags` record component.

 

**Returns:**

 

the value of the `blockTags` record component

 

### fluidId

  

```java
public Optional<net.minecraft.resources.Identifier> fluidId()
```

 

Returns the value of the `fluidId` record component.

 

**Returns:**

 

the value of the `fluidId` record component

 

### fluidTags

  

```java
public Set<net.minecraft.resources.Identifier> fluidTags()
```

 

Returns the value of the `fluidTags` record component.

 

**Returns:**

 

the value of the `fluidTags` record component
