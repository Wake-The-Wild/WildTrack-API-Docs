# BlockSearchView

`dev.wakethewild.wildtrack.api.query.BlockSearchView`

```java
public interface BlockSearchView
```

 

Query-scoped reads from cached chunks only. Unavailable reads make the search incomplete.

## Method Details

 

### blockState

  

```java
Optional<net.minecraft.world.level.block.state.BlockState> blockState(net.minecraft.core.BlockPos position)
```

 

### biome

  

```java
Optional<net.minecraft.core.Holder<net.minecraft.world.level.biome.Biome>> biome(
    net.minecraft.core.BlockPos position
)
```

 

### is

  

```java
default boolean is(net.minecraft.core.BlockPos position, net.minecraft.world.level.block.Block block)
```
