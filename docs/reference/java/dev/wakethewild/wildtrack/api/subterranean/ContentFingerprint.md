# ContentFingerprint

`dev.wakethewild.wildtrack.api.subterranean.ContentFingerprint`

```java
public record ContentFingerprint(long high, long low)
```

## Field Details

 

### UNKNOWN

  

```java
public static final ContentFingerprint UNKNOWN
```

  

## Constructor Details

 

### ContentFingerprint

  

```java
public ContentFingerprint(long high, long low)
```

 

Creates an instance of a `ContentFingerprint` record class.

 

**Parameters:**

 

`high` - the value for the `high` record component

 

`low` - the value for the `low` record component

  

## Method Details

 

### known

  

```java
public boolean known()
```

 

### toHexString

  

```java
public String toHexString()
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

 

### high

  

```java
public long high()
```

 

Returns the value of the `high` record component.

 

**Returns:**

 

the value of the `high` record component

 

### low

  

```java
public long low()
```

 

Returns the value of the `low` record component.

 

**Returns:**

 

the value of the `low` record component
