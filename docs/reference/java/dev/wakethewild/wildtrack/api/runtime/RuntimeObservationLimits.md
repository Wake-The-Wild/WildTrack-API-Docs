# RuntimeObservationLimits

`dev.wakethewild.wildtrack.api.runtime.RuntimeObservationLimits`

```java
public record RuntimeObservationLimits(
    int maximumLeases,
    int maximumLeasesPerOwner,
    int maximumRadius,
    int maximumDurationTicks,
    int maximumActiveChunks
)
```

## Constructor Details

 

### RuntimeObservationLimits

  

```java
public RuntimeObservationLimits(
    int maximumLeases,
    int maximumLeasesPerOwner,
    int maximumRadius,
    int maximumDurationTicks,
    int maximumActiveChunks
)
```

 

Creates an instance of a `RuntimeObservationLimits` record class.

 

**Parameters:**

 

`maximumLeases` - the value for the `maximumLeases` record component

 

`maximumLeasesPerOwner` - the value for the `maximumLeasesPerOwner` record component

 

`maximumRadius` - the value for the `maximumRadius` record component

 

`maximumDurationTicks` - the value for the `maximumDurationTicks` record component

 

`maximumActiveChunks` - the value for the `maximumActiveChunks` record component

  

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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with the `compare` method from their corresponding wrapper classes.

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### maximumLeases

  

```java
public int maximumLeases()
```

 

Returns the value of the `maximumLeases` record component.

 

**Returns:**

 

the value of the `maximumLeases` record component

 

### maximumLeasesPerOwner

  

```java
public int maximumLeasesPerOwner()
```

 

Returns the value of the `maximumLeasesPerOwner` record component.

 

**Returns:**

 

the value of the `maximumLeasesPerOwner` record component

 

### maximumRadius

  

```java
public int maximumRadius()
```

 

Returns the value of the `maximumRadius` record component.

 

**Returns:**

 

the value of the `maximumRadius` record component

 

### maximumDurationTicks

  

```java
public int maximumDurationTicks()
```

 

Returns the value of the `maximumDurationTicks` record component.

 

**Returns:**

 

the value of the `maximumDurationTicks` record component

 

### maximumActiveChunks

  

```java
public int maximumActiveChunks()
```

 

Returns the value of the `maximumActiveChunks` record component.

 

**Returns:**

 

the value of the `maximumActiveChunks` record component
