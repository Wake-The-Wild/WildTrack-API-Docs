# TerrainConditions

`dev.wakethewild.wildtrack.api.placement.TerrainConditions`

```java
public final class TerrainConditions extends Object
```

 

Reusable terrain rules for runtime and snapshot-backed placement decisions.

## Method Details

 

### positionYBetween

  

```java
public static Condition<PlacementContext> positionYBetween(int minimumInclusive, int maximumInclusive)
```

 

### surfaceHeightBetween

  

```java
public static Condition<PlacementContext> surfaceHeightBetween(int minimumInclusive, int maximumInclusive)
```

 

### slopeBetween

  

```java
public static Condition<PlacementContext> slopeBetween(double minimumInclusive, double maximumInclusive)
```

 

### roughnessBetween

  

```java
public static Condition<PlacementContext> roughnessBetween(double minimumInclusive, double maximumInclusive)
```

 

### curvatureBetween

  

```java
public static Condition<PlacementContext> curvatureBetween(double minimumInclusive, double maximumInclusive)
```

 

### relativeElevationBetween

  

```java
public static Condition<PlacementContext> relativeElevationBetween(
    double minimumInclusive,
    double maximumInclusive
)
```
