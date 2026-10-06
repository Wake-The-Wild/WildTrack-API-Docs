# SubterraneanConditions

`dev.wakethewild.wildtrack.api.placement.SubterraneanConditions`

```java
public final class SubterraneanConditions extends Object
```

 

Cave-volume and entrance rules backed by retained subterranean profiles.

## Method Details

 

### caveCandidate

  

```java
public static Condition<PlacementContext> caveCandidate()
```

 

### entranceCandidate

  

```java
public static Condition<PlacementContext> entranceCandidate()
```

 

### nearEntranceColumn

  

```java
public static Condition<PlacementContext> nearEntranceColumn(double maximumDistance)
```

 

### largestVoidAtLeast

  

```java
public static Condition<PlacementContext> largestVoidAtLeast(int minimumBlocks)
```

 

### largestVoidDimensionsAtLeast

  

```java
public static Condition<PlacementContext> largestVoidDimensionsAtLeast(
    int minimumWidth,
    int minimumHeight,
    int minimumDepth
)
```

 

### largestVoidFillFractionBetween

  

```java
public static Condition<PlacementContext> largestVoidFillFractionBetween(double minimum, double maximum)
```

 

### largestVoidTouchesChunkBoundary

  

```java
public static Condition<PlacementContext> largestVoidTouchesChunkBoundary(boolean expected)
```

 

### largestVoidTouchesSurface

  

```java
public static Condition<PlacementContext> largestVoidTouchesSurface(boolean expected)
```

 

### undergroundAirFractionBetween

  

```java
public static Condition<PlacementContext> undergroundAirFractionBetween(double minimum, double maximum)
```

 

### deepAirFractionBetween

  

```java
public static Condition<PlacementContext> deepAirFractionBetween(double minimum, double maximum)
```

 

### undergroundFluidFractionBetween

  

```java
public static Condition<PlacementContext> undergroundFluidFractionBetween(double minimum, double maximum)
```

 

### largestVoidShareBetween

  

```java
public static Condition<PlacementContext> largestVoidShareBetween(double minimum, double maximum)
```

 

### surfaceConnectedComponentsBetween

  

```java
public static Condition<PlacementContext> surfaceConnectedComponentsBetween(int minimum, int maximum)
```
