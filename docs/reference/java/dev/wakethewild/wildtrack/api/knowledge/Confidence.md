# Confidence

`dev.wakethewild.wildtrack.api.knowledge.Confidence`

```java
public record Confidence(double value)
```

 

Normalized certainty for inferred data. Exact provider results use `certain()`.

## Constructor Details

 

### Confidence

  

```java
public Confidence(double value)
```

 

Creates an instance of a `Confidence` record class.

 

**Parameters:**

 

`value` - the value for the `value` record component

  

## Method Details

 

### certain

  

```java
public static Confidence certain()
```

 

### unknown

  

```java
public static Confidence unknown()
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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with the `compare` method from their corresponding wrapper classes.

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### value

  

```java
public double value()
```

 

Returns the value of the `value` record component.

 

**Returns:**

 

the value of the `value` record component
