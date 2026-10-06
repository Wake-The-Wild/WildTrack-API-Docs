# SurfaceConditions

`dev.wakethewild.wildtrack.api.placement.SurfaceConditions`

```java
public final class SurfaceConditions extends Object
```

 

Surface-material and vegetation rules backed by retained surface snapshots.

## Method Details

 

### groundBlock

  

```java
public static Condition<PlacementContext> groundBlock(net.minecraft.resources.Identifier blockId)
```

 

### groundTag

  

```java
public static Condition<PlacementContext> groundTag(net.minecraft.resources.Identifier tagId)
```

 

### topBlock

  

```java
public static Condition<PlacementContext> topBlock(net.minecraft.resources.Identifier blockId)
```

 

### topTag

  

```java
public static Condition<PlacementContext> topTag(net.minecraft.resources.Identifier tagId)
```

 

### canopyCoverageBetween

  

```java
public static Condition<PlacementContext> canopyCoverageBetween(double minimum, double maximum)
```

 

### canopyGapBetween

  

```java
public static Condition<PlacementContext> canopyGapBetween(double minimum, double maximum)
```

 

### plantCoverageBetween

  

```java
public static Condition<PlacementContext> plantCoverageBetween(double minimum, double maximum)
```

 

### woodCoverageBetween

  

```java
public static Condition<PlacementContext> woodCoverageBetween(double minimum, double maximum)
```

 

### fluidCoverageBetween

  

```java
public static Condition<PlacementContext> fluidCoverageBetween(double minimum, double maximum)
```

 

### waterCoverageBetween

  

```java
public static Condition<PlacementContext> waterCoverageBetween(double minimum, double maximum)
```

 

### averageCanopyDepthBetween

  

```java
public static Condition<PlacementContext> averageCanopyDepthBetween(double minimum, double maximum)
```
