# PlacementContextContributor

`dev.wakethewild.wildtrack.api.context.PlacementContextContributor`

```java
public interface PlacementContextContributor
```

 

Extension hook that contributes bounded typed values to a completed base placement context.

## Method Details

 

### id

  

```java
net.minecraft.resources.Identifier id()
```

 

### contribute

  

```java
void contribute(PlacementContext context, ContextValueMap.Builder values)
```
