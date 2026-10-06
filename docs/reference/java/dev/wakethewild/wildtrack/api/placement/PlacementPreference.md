# PlacementPreference

`dev.wakethewild.wildtrack.api.placement.PlacementPreference`

**Functional Interface:**

 

This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

   

```java
@FunctionalInterface public interface PlacementPreference
```

 

A soft, normalized suitability measurement used to rank valid candidates.

## Method Details

 

### evaluate

  

```java
PlacementPreferenceEvaluation evaluate(PlacementContext context)
```
