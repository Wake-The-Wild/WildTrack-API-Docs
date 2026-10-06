# EnvironmentProfile

`dev.wakethewild.wildtrack.api.environment.EnvironmentProfile`

```java
public record EnvironmentProfile(
    int blockX,
    int surfaceY,
    int blockZ,
    int sampleRadius,
    net.minecraft.resources.Identifier biomeId,
    Set<net.minecraft.resources.Identifier> biomeTags,
    Set<net.minecraft.resources.Identifier> observedBiomes,
    double biomeBoundaryStrength,
    int elevationRange
)
```

## Constructor Details

 

### EnvironmentProfile

  

```java
public EnvironmentProfile(
    int blockX,
    int surfaceY,
    int blockZ,
    int sampleRadius,
    net.minecraft.resources.Identifier biomeId,
    Set<net.minecraft.resources.Identifier> biomeTags,
    Set<net.minecraft.resources.Identifier> observedBiomes,
    double biomeBoundaryStrength,
    int elevationRange
)
```

 

Creates an instance of a `EnvironmentProfile` record class.

 

**Parameters:**

 

`blockX` - the value for the `blockX` record component

 

`surfaceY` - the value for the `surfaceY` record component

 

`blockZ` - the value for the `blockZ` record component

 

`sampleRadius` - the value for the `sampleRadius` record component

 

`biomeId` - the value for the `biomeId` record component

 

`biomeTags` - the value for the `biomeTags` record component

 

`observedBiomes` - the value for the `observedBiomes` record component

 

`biomeBoundaryStrength` - the value for the `biomeBoundaryStrength` record component

 

`elevationRange` - the value for the `elevationRange` record component

  

## Method Details

 

### isBiomeBoundary

  

```java
public boolean isBiomeBoundary()
```

 

### hasBiomeTag

  

```java
public boolean hasBiomeTag(net.minecraft.resources.Identifier tagId)
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

 

### blockX

  

```java
public int blockX()
```

 

Returns the value of the `blockX` record component.

 

**Returns:**

 

the value of the `blockX` record component

 

### surfaceY

  

```java
public int surfaceY()
```

 

Returns the value of the `surfaceY` record component.

 

**Returns:**

 

the value of the `surfaceY` record component

 

### blockZ

  

```java
public int blockZ()
```

 

Returns the value of the `blockZ` record component.

 

**Returns:**

 

the value of the `blockZ` record component

 

### sampleRadius

  

```java
public int sampleRadius()
```

 

Returns the value of the `sampleRadius` record component.

 

**Returns:**

 

the value of the `sampleRadius` record component

 

### biomeId

  

```java
public net.minecraft.resources.Identifier biomeId()
```

 

Returns the value of the `biomeId` record component.

 

**Returns:**

 

the value of the `biomeId` record component

 

### biomeTags

  

```java
public Set<net.minecraft.resources.Identifier> biomeTags()
```

 

Returns the value of the `biomeTags` record component.

 

**Returns:**

 

the value of the `biomeTags` record component

 

### observedBiomes

  

```java
public Set<net.minecraft.resources.Identifier> observedBiomes()
```

 

Returns the value of the `observedBiomes` record component.

 

**Returns:**

 

the value of the `observedBiomes` record component

 

### biomeBoundaryStrength

  

```java
public double biomeBoundaryStrength()
```

 

Returns the value of the `biomeBoundaryStrength` record component.

 

**Returns:**

 

the value of the `biomeBoundaryStrength` record component

 

### elevationRange

  

```java
public int elevationRange()
```

 

Returns the value of the `elevationRange` record component.

 

**Returns:**

 

the value of the `elevationRange` record component
