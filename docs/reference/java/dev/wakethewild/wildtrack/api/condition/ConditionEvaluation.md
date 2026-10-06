# ConditionEvaluation

`dev.wakethewild.wildtrack.api.condition.ConditionEvaluation`

```java
public record ConditionEvaluation(
    net.minecraft.resources.Identifier conditionId,
    ConditionVerdict verdict,
    String explanation,
    List<ConditionEvaluation> children
)
```

 

Immutable, explainable result of one condition tree evaluation.

## Constructor Details

 

### ConditionEvaluation

  

```java
public ConditionEvaluation(
    net.minecraft.resources.Identifier conditionId,
    ConditionVerdict verdict,
    String explanation,
    List<ConditionEvaluation> children
)
```

 

Creates an instance of a `ConditionEvaluation` record class.

 

**Parameters:**

 

`conditionId` - the value for the `conditionId` record component

 

`verdict` - the value for the `verdict` record component

 

`explanation` - the value for the `explanation` record component

 

`children` - the value for the `children` record component

  

## Method Details

 

### leaf

  

```java
public static ConditionEvaluation leaf(
    net.minecraft.resources.Identifier id,
    ConditionVerdict verdict,
    String explanation
)
```

 

### passed

  

```java
public boolean passed()
```

 

### conclusive

  

```java
public boolean conclusive()
```

 

### toString

  

```java
public final String toString()
```

 

Returns a string representation of this record class. The representation contains the name of the class, followed by the name and value of each of the record components.

 

**Specified by:**

 

`toString` in class `Record`

 

**Returns:**

 

a string representation of this object

 

### hashCode

  

```java
public final int hashCode()
```

 

Returns a hash code value for this object. The value is derived from the hash code of each of the record components.

 

**Specified by:**

 

`hashCode` in class `Record`

 

**Returns:**

 

a hash code value for this object

 

### equals

  

```java
public final boolean equals(Object o)
```

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)).

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### conditionId

  

```java
public net.minecraft.resources.Identifier conditionId()
```

 

Returns the value of the `conditionId` record component.

 

**Returns:**

 

the value of the `conditionId` record component

 

### verdict

  

```java
public ConditionVerdict verdict()
```

 

Returns the value of the `verdict` record component.

 

**Returns:**

 

the value of the `verdict` record component

 

### explanation

  

```java
public String explanation()
```

 

Returns the value of the `explanation` record component.

 

**Returns:**

 

the value of the `explanation` record component

 

### children

  

```java
public List<ConditionEvaluation> children()
```

 

Returns the value of the `children` record component.

 

**Returns:**

 

the value of the `children` record component
