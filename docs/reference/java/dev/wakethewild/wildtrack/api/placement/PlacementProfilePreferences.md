# PlacementProfilePreferences

`dev.wakethewild.wildtrack.api.placement.PlacementProfilePreferences`

```java
public final class PlacementProfilePreferences extends Object
```

 

Common soft preferences backed by WildTrack's retained world profiles.

## Method Details

 

### targetSlope

  

```java
public static PlacementPreference targetSlope(double ideal, double zeroScoreDistance)
```

 

### targetRoughness

  

```java
public static PlacementPreference targetRoughness(double ideal, double zeroScoreDistance)
```

 

### targetRelativeElevation

  

```java
public static PlacementPreference targetRelativeElevation(double ideal, double zeroScoreDistance)
```

 

### targetCanopyCoverage

  

```java
public static PlacementPreference targetCanopyCoverage(double ideal, double zeroScoreDistance)
```

 

### targetPlantCoverage

  

```java
public static PlacementPreference targetPlantCoverage(double ideal, double zeroScoreDistance)
```

 

### targetBiomeBoundaryStrength

  

```java
public static PlacementPreference targetBiomeBoundaryStrength(double ideal, double zeroScoreDistance)
```

 

### targetUndergroundAirFraction

  

```java
public static PlacementPreference targetUndergroundAirFraction(double ideal, double zeroScoreDistance)
```

 

### targetUndergroundFluidFraction

  

```java
public static PlacementPreference targetUndergroundFluidFraction(double ideal, double zeroScoreDistance)
```

 

### targetLargestVoidShare

  

```java
public static PlacementPreference targetLargestVoidShare(double ideal, double zeroScoreDistance)
```

 

### targetLargestVoidWidth

  

```java
public static PlacementPreference targetLargestVoidWidth(double ideal, double zeroScoreDistance)
```

 

### targetLargestVoidHeight

  

```java
public static PlacementPreference targetLargestVoidHeight(double ideal, double zeroScoreDistance)
```

 

### targetLargestVoidDepth

  

```java
public static PlacementPreference targetLargestVoidDepth(double ideal, double zeroScoreDistance)
```

 

### targetLargestVoidFillFraction

  

```java
public static PlacementPreference targetLargestVoidFillFraction(double ideal, double zeroScoreDistance)
```

 

### targetWatercourseWidth

  

```java
public static PlacementPreference targetWatercourseWidth(double ideal, double zeroScoreDistance)
```

 

### targetWatercourseConfidence

  

```java
public static PlacementPreference targetWatercourseConfidence(double ideal, double zeroScoreDistance)
```

 

### targetClassificationConfidence

  

```java
public static PlacementPreference targetClassificationConfidence(
    net.minecraft.resources.Identifier environmentType,
    double ideal,
    double zeroScoreDistance
)
```

 

### target

  

```java
public static PlacementPreference target(
    net.minecraft.resources.Identifier id,
    String measurementName,
    Function<PlacementContext, OptionalDouble> measurement,
    double ideal,
    double zeroScoreDistance
)
```

 

Creates a triangular score: one at the ideal and zero at or beyond the configured distance.
