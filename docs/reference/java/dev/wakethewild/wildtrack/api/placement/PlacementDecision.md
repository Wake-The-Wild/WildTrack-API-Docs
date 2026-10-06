# PlacementDecision

`dev.wakethewild.wildtrack.api.placement.PlacementDecision`

```java
public record PlacementDecision(PlacementDisposition disposition, ConditionEvaluation evaluation)
```

 

An explanation tree paired with the caller-selected action for unknown data.

## Constructor Details

 

### PlacementDecision

  

```java
public PlacementDecision(PlacementDisposition disposition, ConditionEvaluation evaluation)
```

 

Creates an instance of a `PlacementDecision` record class.

 

**Parameters:**

 

`disposition` - the value for the `disposition` record component

 

`evaluation` - the value for the `evaluation` record component

  

## Method Details

 

### from

  

```java
public static PlacementDecision from(ConditionEvaluation evaluation, UnknownPlacementPolicy unknownPolicy)
```

 

### accepted

  

```java
public boolean accepted()
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

 

### disposition

  

```java
public PlacementDisposition disposition()
```

 

Returns the value of the `disposition` record component.

 

**Returns:**

 

the value of the `disposition` record component

 

### evaluation

  

```java
public ConditionEvaluation evaluation()
```

 

Returns the value of the `evaluation` record component.

 

**Returns:**

 

the value of the `evaluation` record component
