# VanillaBiomeRegions

`dev.wakethewild.wildtrack.api.location.VanillaBiomeRegions`

```java
public final class VanillaBiomeRegions extends Object
```

 

Public identifiers for progressively assembled vanilla and modded surface-biome regions.

## Field Details

 

### PROVIDER

  

```java
public static final ProviderId PROVIDER
```

 

### REGION_TAG

  

```java
public static final net.minecraft.resources.Identifier REGION_TAG
```

 

### BIOME_ID

  

```java
public static final MetadataKey<String> BIOME_ID
```

 

### SURFACE_CELLS

  

```java
public static final MetadataKey<Integer> SURFACE_CELLS
```

 

### OBSERVED_CHUNKS

  

```java
public static final MetadataKey<Integer> OBSERVED_CHUNKS
```

  

## Method Details

 

### locationType

  

```java
public static LocationTypeId locationType(net.minecraft.resources.Identifier biome)
```

 

### biome

  

```java
public static Optional<net.minecraft.resources.Identifier> biome(LocationTypeId type)
```
