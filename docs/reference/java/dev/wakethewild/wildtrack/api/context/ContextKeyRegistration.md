# ContextKeyRegistration

`dev.wakethewild.wildtrack.api.context.ContextKeyRegistration`

```java
public record ContextKeyRegistration(ContextKey<?> key, int maximumEncodedBytes)
```

## Constructor Details

 

### ContextKeyRegistration

  

```java
public ContextKeyRegistration(ContextKey<?> key, int maximumEncodedBytes)
```

 

Creates an instance of a `ContextKeyRegistration` record class.

 

**Parameters:**

 

`key` - the value for the `key` record component

 

`maximumEncodedBytes` - the value for the `maximumEncodedBytes` record component

  

## Method Details

 

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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. Reference components are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)); primitive components are compared with the `compare` method from their corresponding wrapper classes.

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### key

  

```java
public ContextKey<?> key()
```

 

Returns the value of the `key` record component.

 

**Returns:**

 

the value of the `key` record component

 

### maximumEncodedBytes

  

```java
public int maximumEncodedBytes()
```

 

Returns the value of the `maximumEncodedBytes` record component.

 

**Returns:**

 

the value of the `maximumEncodedBytes` record component
