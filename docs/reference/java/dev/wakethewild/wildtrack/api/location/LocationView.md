# LocationView

`dev.wakethewild.wildtrack.api.location.LocationView`

**All Known Implementing Classes:**

 

`LocationSnapshot`

   

```java
public interface LocationView
```

## Method Details

 

### id

  

```java
LocationId id()
```

 

### type

  

```java
LocationTypeId type()
```

 

### provider

  

```java
ProviderId provider()
```

 

### dimension

  

```java
net.minecraft.resources.ResourceKey<net.minecraft.world.level.Level> dimension()
```

 

### anchor

  

```java
net.minecraft.core.BlockPos anchor()
```

 

### center

  

```java
Optional<net.minecraft.core.BlockPos> center()
```

 

### geometry

  

```java
SpatialGeometry geometry()
```

 

### tags

  

```java
Set<net.minecraft.resources.Identifier> tags()
```

 

### metadata

  

```java
MetadataView metadata()
```
