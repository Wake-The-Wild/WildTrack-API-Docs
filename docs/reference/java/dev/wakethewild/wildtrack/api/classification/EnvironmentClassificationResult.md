# EnvironmentClassificationResult

`dev.wakethewild.wildtrack.api.classification.EnvironmentClassificationResult`

```java
public record EnvironmentClassificationResult(
    EnvironmentClassificationContext context,
    List<EnvironmentClassification> classifications
)
```

## Constructor Details

 

### EnvironmentClassificationResult

  

```java
public EnvironmentClassificationResult(
    EnvironmentClassificationContext context,
    List<EnvironmentClassification> classifications
)
```

 

Creates an instance of a `EnvironmentClassificationResult` record class.

 

**Parameters:**

 

`context` - the value for the `context` record component

 

`classifications` - the value for the `classifications` record component

  

## Method Details

 

### ranked

  

```java
public List<EnvironmentClassification> ranked()
```

 

### bestAvailable

  

```java
public Optional<EnvironmentClassification> bestAvailable()
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

 

### context

  

```java
public EnvironmentClassificationContext context()
```

 

Returns the value of the `context` record component.

 

**Returns:**

 

the value of the `context` record component

 

### classifications

  

```java
public List<EnvironmentClassification> classifications()
```

 

Returns the value of the `classifications` record component.

 

**Returns:**

 

the value of the `classifications` record component
