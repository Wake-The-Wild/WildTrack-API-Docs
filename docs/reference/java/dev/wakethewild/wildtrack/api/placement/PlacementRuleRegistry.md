# PlacementRuleRegistry

`dev.wakethewild.wildtrack.api.placement.PlacementRuleRegistry`

```java
public interface PlacementRuleRegistry
```

 

Thread-safe registry for namespaced placement rules supplied by consumer mods.

## Method Details

 

### register

  

```java
void register(PlacementRule rule)
```

 

Registers one rule and fails if its ID is already owned.

 

### find

  

```java
Optional<PlacementRule> find(net.minecraft.resources.Identifier id)
```

 

### rules

  

```java
List<PlacementRule> rules()
```

 

Returns a stable ID-sorted snapshot.

 

### size

  

```java
int size()
```

 

### capacity

  

```java
int capacity()
```

 

### unregister

  

```java
boolean unregister(PlacementRule rule)
```

 

Removes the rule only when the exact registered instance matches.
