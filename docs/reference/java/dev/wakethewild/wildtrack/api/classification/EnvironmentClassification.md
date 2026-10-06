# EnvironmentClassification

`dev.wakethewild.wildtrack.api.classification.EnvironmentClassification`

```java
public record EnvironmentClassification(
    net.minecraft.resources.Identifier classifierId,
    net.minecraft.resources.Identifier environmentType,
    OptionalDouble confidence,
    String explanation,
    Map<String,Double> evidence
)
```

## Constructor Details

 

### EnvironmentClassification

  

```java
public EnvironmentClassification(
    net.minecraft.resources.Identifier classifierId,
    net.minecraft.resources.Identifier environmentType,
    OptionalDouble confidence,
    String explanation,
    Map<String,Double> evidence
)
```

 

Creates an instance of a `EnvironmentClassification` record class.

 

**Parameters:**

 

`classifierId` - the value for the `classifierId` record component

 

`environmentType` - the value for the `environmentType` record component

 

`confidence` - the value for the `confidence` record component

 

`explanation` - the value for the `explanation` record component

 

`evidence` - the value for the `evidence` record component

  

## Method Details

 

### unknown

  

```java
public static EnvironmentClassification unknown(
    net.minecraft.resources.Identifier classifierId,
    net.minecraft.resources.Identifier environmentType,
    String explanation
)
```

 

### available

  

```java
public boolean available()
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

 

### classifierId

  

```java
public net.minecraft.resources.Identifier classifierId()
```

 

Returns the value of the `classifierId` record component.

 

**Returns:**

 

the value of the `classifierId` record component

 

### environmentType

  

```java
public net.minecraft.resources.Identifier environmentType()
```

 

Returns the value of the `environmentType` record component.

 

**Returns:**

 

the value of the `environmentType` record component

 

### confidence

  

```java
public OptionalDouble confidence()
```

 

Returns the value of the `confidence` record component.

 

**Returns:**

 

the value of the `confidence` record component

 

### explanation

  

```java
public String explanation()
```

 

Returns the value of the `explanation` record component.

 

**Returns:**

 

the value of the `explanation` record component

 

### evidence

  

```java
public Map<String,Double> evidence()
```

 

Returns the value of the `evidence` record component.

 

**Returns:**

 

the value of the `evidence` record component
