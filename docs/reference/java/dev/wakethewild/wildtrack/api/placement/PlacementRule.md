# PlacementRule

`dev.wakethewild.wildtrack.api.placement.PlacementRule`

```java
public record PlacementRule(
    net.minecraft.resources.Identifier id,
    Condition<PlacementContext> condition,
    PlacementPreference preference,
    UnknownPlacementPolicy unknownPolicy
)
```

 

Named runtime rule that combines validity, suitability and incomplete-data behavior.

## Constructor Details

 

### PlacementRule

  

```java
public PlacementRule(
    net.minecraft.resources.Identifier id,
    Condition<PlacementContext> condition,
    PlacementPreference preference,
    UnknownPlacementPolicy unknownPolicy
)
```

 

Creates an instance of a `PlacementRule` record class.

 

**Parameters:**

 

`id` - the value for the `id` record component

 

`condition` - the value for the `condition` record component

 

`preference` - the value for the `preference` record component

 

`unknownPolicy` - the value for the `unknownPolicy` record component

  

## Method Details

 

### assess

  

```java
public PlacementCandidateAssessment assess(int candidateIndex, PlacementContext context)
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

 

### id

  

```java
public net.minecraft.resources.Identifier id()
```

 

Returns the value of the `id` record component.

 

**Returns:**

 

the value of the `id` record component

 

### condition

  

```java
public Condition<PlacementContext> condition()
```

 

Returns the value of the `condition` record component.

 

**Returns:**

 

the value of the `condition` record component

 

### preference

  

```java
public PlacementPreference preference()
```

 

Returns the value of the `preference` record component.

 

**Returns:**

 

the value of the `preference` record component

 

### unknownPolicy

  

```java
public UnknownPlacementPolicy unknownPolicy()
```

 

Returns the value of the `unknownPolicy` record component.

 

**Returns:**

 

the value of the `unknownPolicy` record component
