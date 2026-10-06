# PlacementConditionDefinitionRegistry

`dev.wakethewild.wildtrack.api.placement.PlacementConditionDefinitionRegistry`

```java
public interface PlacementConditionDefinitionRegistry
```

 

Bounded registry and compiler for data-facing placement condition trees.

## Field Details

 

### ALL

  

```java
static final net.minecraft.resources.Identifier ALL
```

 

### ANY

  

```java
static final net.minecraft.resources.Identifier ANY
```

 

### NOT

  

```java
static final net.minecraft.resources.Identifier NOT
```

  

## Method Details

 

### register

  

```java
void register(net.minecraft.resources.Identifier type, PlacementConditionFactory factory)
```

 

### compile

  

```java
Condition<PlacementContext> compile(PlacementConditionDefinition definition)
```

 

### registeredTypes

  

```java
List<net.minecraft.resources.Identifier> registeredTypes()
```

 

### size

  

```java
int size()
```

 

### capacity

  

```java
int capacity()
```
