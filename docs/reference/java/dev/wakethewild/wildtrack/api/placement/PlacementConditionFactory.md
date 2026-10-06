# PlacementConditionFactory

`dev.wakethewild.wildtrack.api.placement.PlacementConditionFactory`

**Functional Interface:**

 

This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

   

```java
@FunctionalInterface public interface PlacementConditionFactory
```

 

Creates one leaf condition from bounded string arguments decoded by an integration.

## Method Details

 

### create

  

```java
Condition<PlacementContext> create(Map<String,String> arguments)
```
