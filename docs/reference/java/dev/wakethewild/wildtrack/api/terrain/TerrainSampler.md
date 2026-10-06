# TerrainSampler

`dev.wakethewild.wildtrack.api.terrain.TerrainSampler`

```java
public final class TerrainSampler extends Object
```

 

Deterministic terrain math independent of chunk storage and scheduling.

## Method Details

 

### trySample

  

```java
public static Optional<TerrainProfile> trySample(HeightField field, int blockX, int blockZ, int radius)
```

 

Samples the center, cardinal, and diagonal positions at the requested radius. Empty means at least one required column is not known. 

Aspect is the downhill compass direction: 0 north, 90 east, 180 south, and 270 west. Flat terrain has no aspect. Positive curvature describes a local depression and negative curvature a local peak.
