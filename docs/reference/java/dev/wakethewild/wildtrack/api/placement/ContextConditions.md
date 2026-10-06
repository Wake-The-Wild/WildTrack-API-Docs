# ContextConditions

`dev.wakethewild.wildtrack.api.placement.ContextConditions`

```java
public final class ContextConditions extends Object
```

 

Conditions backed by registered extension values contributed to a placement context.

## Method Details

 

### present

  

```java
public static Condition<PlacementContext> present(ContextKey<?> key)
```

 

### matches

  

```java
public static <T> Condition<PlacementContext> matches(
    ContextKey<T> key,
    ContextKeyRegistry registry,
    Predicate<? super T> predicate,
    String expectation
)
```

 

### equalTo

  

```java
public static <T> Condition<PlacementContext> equalTo(
    ContextKey<T> key,
    ContextKeyRegistry registry,
    T expected
)
```
