# RuntimeObservationLease

`dev.wakethewild.wildtrack.api.runtime.RuntimeObservationLease`

```java
public record RuntimeObservationLease(UUID id, RuntimeObservationDemand demand, long expiresAtTick)
```

 

Accepted demand handle. The expiry is measured in the server's monotonic tick clock.

## Constructor Details

 

### RuntimeObservationLease

  

```java
public RuntimeObservationLease(UUID id, RuntimeObservationDemand demand, long expiresAtTick)
```

 

Creates an instance of a `RuntimeObservationLease` record class.

 

**Parameters:**

 

`id` - the value for the `id` record component

 

`demand` - the value for the `demand` record component

 

`expiresAtTick` - the value for the `expiresAtTick` record component

  

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

 

### id

  

```java
public UUID id()
```

 

Returns the value of the `id` record component.

 

**Returns:**

 

the value of the `id` record component

 

### demand

  

```java
public RuntimeObservationDemand demand()
```

 

Returns the value of the `demand` record component.

 

**Returns:**

 

the value of the `demand` record component

 

### expiresAtTick

  

```java
public long expiresAtTick()
```

 

Returns the value of the `expiresAtTick` record component.

 

**Returns:**

 

the value of the `expiresAtTick` record component
