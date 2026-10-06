# PlacementConditionDefinition

`dev.wakethewild.wildtrack.api.placement.PlacementConditionDefinition`

```java
public record PlacementConditionDefinition(
    net.minecraft.resources.Identifier type,
    Map<String,String> arguments,
    List<PlacementConditionDefinition> children
)
```

 

Immutable data-facing node compiled into an explainable placement condition.

## Field Details

 

### MAXIMUM_ARGUMENTS

  

```java
public static final int MAXIMUM_ARGUMENTS
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

 

### MAXIMUM_ARGUMENT_LENGTH

  

```java
public static final int MAXIMUM_ARGUMENT_LENGTH
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

  

## Constructor Details

 

### PlacementConditionDefinition

  

```java
public PlacementConditionDefinition(
    net.minecraft.resources.Identifier type,
    Map<String,String> arguments,
    List<PlacementConditionDefinition> children
)
```

 

Creates an instance of a `PlacementConditionDefinition` record class.

 

**Parameters:**

 

`type` - the value for the `type` record component

 

`arguments` - the value for the `arguments` record component

 

`children` - the value for the `children` record component

  

## Method Details

 

### leaf

  

```java
public static PlacementConditionDefinition leaf(
    net.minecraft.resources.Identifier type,
    Map<String,String> arguments
)
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

 

### type

  

```java
public net.minecraft.resources.Identifier type()
```

 

Returns the value of the `type` record component.

 

**Returns:**

 

the value of the `type` record component

 

### arguments

  

```java
public Map<String,String> arguments()
```

 

Returns the value of the `arguments` record component.

 

**Returns:**

 

the value of the `arguments` record component

 

### children

  

```java
public List<PlacementConditionDefinition> children()
```

 

Returns the value of the `children` record component.

 

**Returns:**

 

the value of the `children` record component
