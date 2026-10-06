# Conditions

`dev.wakethewild.wildtrack.api.condition.Conditions`

```java
public final class Conditions extends Object
```

 

Factories and three-state composition rules for public WildTrack conditions.

## Method Details

 

### fixed

  

```java
public static <C> Condition<C> fixed(
    net.minecraft.resources.Identifier id,
    ConditionVerdict verdict,
    String explanation
)
```

 

### predicate

  

```java
public static <C> Condition<C> predicate(
    net.minecraft.resources.Identifier id,
    Predicate<? super C> predicate,
    String passedExplanation,
    String failedExplanation
)
```

 

### all

  

```java
public static <C> Condition<C> all(
    net.minecraft.resources.Identifier id,
    List<? extends Condition<C>> conditions
)
```

 

### any

  

```java
public static <C> Condition<C> any(
    net.minecraft.resources.Identifier id,
    List<? extends Condition<C>> conditions
)
```

 

### not

  

```java
public static <C> Condition<C> not(net.minecraft.resources.Identifier id, Condition<C> condition)
```
