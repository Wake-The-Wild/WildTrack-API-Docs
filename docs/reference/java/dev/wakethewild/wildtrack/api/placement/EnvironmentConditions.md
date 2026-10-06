# EnvironmentConditions

`dev.wakethewild.wildtrack.api.placement.EnvironmentConditions`

```java
public final class EnvironmentConditions extends Object
```

 

Biome and transition rules backed by retained environment snapshots.

## Method Details

 

### biome

  

```java
public static Condition<PlacementContext> biome(net.minecraft.resources.Identifier biomeId)
```

 

### anyBiome

  

```java
public static Condition<PlacementContext> anyBiome(Set<net.minecraft.resources.Identifier> biomeIds)
```

 

### biomeTag

  

```java
public static Condition<PlacementContext> biomeTag(net.minecraft.resources.Identifier tagId)
```

 

### biomeBoundaryStrengthBetween

  

```java
public static Condition<PlacementContext> biomeBoundaryStrengthBetween(double minimum, double maximum)
```

 

### elevationRangeBetween

  

```java
public static Condition<PlacementContext> elevationRangeBetween(double minimum, double maximum)
```
