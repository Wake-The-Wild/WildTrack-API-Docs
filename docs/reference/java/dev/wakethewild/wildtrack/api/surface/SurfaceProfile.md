# SurfaceProfile

`dev.wakethewild.wildtrack.api.surface.SurfaceProfile`

```java
public record SurfaceProfile(
    int blockX,
    int blockZ,
    int sampleRadius,
    SurfaceCell center,
    double canopyCoverage,
    double canopyGapFraction,
    double plantCoverage,
    double woodCoverage,
    double fluidCoverage,
    double waterCoverage,
    double averageCanopyDepth,
    Map<net.minecraft.resources.Identifier, Double> topMaterialFractions,
    Set<net.minecraft.resources.Identifier> observedBlockTags
)
```

 

Multi-scale surface composition and vegetation metrics.

## Constructor Details

 

### SurfaceProfile

  

```java
public SurfaceProfile(
    int blockX,
    int blockZ,
    int sampleRadius,
    SurfaceCell center,
    double canopyCoverage,
    double canopyGapFraction,
    double plantCoverage,
    double woodCoverage,
    double fluidCoverage,
    double waterCoverage,
    double averageCanopyDepth,
    Map<net.minecraft.resources.Identifier, Double> topMaterialFractions,
    Set<net.minecraft.resources.Identifier> observedBlockTags
)
```

 

Creates an instance of a `SurfaceProfile` record class.

 

**Parameters:**

 

`blockX` - the value for the `blockX` record component

 

`blockZ` - the value for the `blockZ` record component

 

`sampleRadius` - the value for the `sampleRadius` record component

 

`center` - the value for the `center` record component

 

`canopyCoverage` - the value for the `canopyCoverage` record component

 

`canopyGapFraction` - the value for the `canopyGapFraction` record component

 

`plantCoverage` - the value for the `plantCoverage` record component

 

`woodCoverage` - the value for the `woodCoverage` record component

 

`fluidCoverage` - the value for the `fluidCoverage` record component

 

`waterCoverage` - the value for the `waterCoverage` record component

 

`averageCanopyDepth` - the value for the `averageCanopyDepth` record component

 

`topMaterialFractions` - the value for the `topMaterialFractions` record component

 

`observedBlockTags` - the value for the `observedBlockTags` record component

 

### SurfaceProfile

  

```java
public SurfaceProfile(
    int blockX,
    int blockZ,
    int sampleRadius,
    SurfaceCell center,
    double canopyCoverage,
    double canopyGapFraction,
    double plantCoverage,
    double woodCoverage,
    double averageCanopyDepth,
    Map<net.minecraft.resources.Identifier, Double> topMaterialFractions,
    Set<net.minecraft.resources.Identifier> observedBlockTags
)
```

  

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

 

### sampleRadius

  

```java
public int sampleRadius()
```

 

Returns the value of the `sampleRadius` record component.

 

**Returns:**

 

the value of the `sampleRadius` record component

 

### center

  

```java
public SurfaceCell center()
```

 

Returns the value of the `center` record component.

 

**Returns:**

 

the value of the `center` record component

 

### canopyCoverage

  

```java
public double canopyCoverage()
```

 

Returns the value of the `canopyCoverage` record component.

 

**Returns:**

 

the value of the `canopyCoverage` record component

 

### canopyGapFraction

  

```java
public double canopyGapFraction()
```

 

Returns the value of the `canopyGapFraction` record component.

 

**Returns:**

 

the value of the `canopyGapFraction` record component

 

### plantCoverage

  

```java
public double plantCoverage()
```

 

Returns the value of the `plantCoverage` record component.

 

**Returns:**

 

the value of the `plantCoverage` record component

 

### woodCoverage

  

```java
public double woodCoverage()
```

 

Returns the value of the `woodCoverage` record component.

 

**Returns:**

 

the value of the `woodCoverage` record component

 

### fluidCoverage

  

```java
public double fluidCoverage()
```

 

Returns the value of the `fluidCoverage` record component.

 

**Returns:**

 

the value of the `fluidCoverage` record component

 

### waterCoverage

  

```java
public double waterCoverage()
```

 

Returns the value of the `waterCoverage` record component.

 

**Returns:**

 

the value of the `waterCoverage` record component

 

### averageCanopyDepth

  

```java
public double averageCanopyDepth()
```

 

Returns the value of the `averageCanopyDepth` record component.

 

**Returns:**

 

the value of the `averageCanopyDepth` record component

 

### topMaterialFractions

  

```java
public Map<net.minecraft.resources.Identifier, Double> topMaterialFractions()
```

 

Returns the value of the `topMaterialFractions` record component.

 

**Returns:**

 

the value of the `topMaterialFractions` record component

 

### observedBlockTags

  

```java
public Set<net.minecraft.resources.Identifier> observedBlockTags()
```

 

Returns the value of the `observedBlockTags` record component.

 

**Returns:**

 

the value of the `observedBlockTags` record component
