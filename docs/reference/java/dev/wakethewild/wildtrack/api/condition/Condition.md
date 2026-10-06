# Condition

`dev.wakethewild.wildtrack.api.condition.Condition`

**Functional Interface:**

 

This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

   

```java
@FunctionalInterface public interface Condition<C>
```

 

Side-effect-free condition over an immutable or otherwise safe query context.

## Method Details

 

### evaluate

  

```java
ConditionEvaluation evaluate(C context)
```
