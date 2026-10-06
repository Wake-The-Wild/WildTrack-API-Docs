# DiscoveryEvent

`dev.wakethewild.wildtrack.api.discovery.DiscoveryEvent`

```java
public record DiscoveryEvent(
    DiscoveryEventType type,
    DiscoverySubject subject,
    UUID triggeringPlayer,
    net.minecraft.resources.Identifier policyId,
    LocationSnapshot location
)
```

## Constructor Details

 

### DiscoveryEvent

  

```java
public DiscoveryEvent(
    DiscoveryEventType type,
    DiscoverySubject subject,
    UUID triggeringPlayer,
    net.minecraft.resources.Identifier policyId,
    LocationSnapshot location
)
```

 

Creates an instance of a `DiscoveryEvent` record class.

 

**Parameters:**

 

`type` - the value for the `type` record component

 

`subject` - the value for the `subject` record component

 

`triggeringPlayer` - the value for the `triggeringPlayer` record component

 

`policyId` - the value for the `policyId` record component

 

`location` - the value for the `location` record component

  

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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)).

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### type

  

```java
public DiscoveryEventType type()
```

 

Returns the value of the `type` record component.

 

**Returns:**

 

the value of the `type` record component

 

### subject

  

```java
public DiscoverySubject subject()
```

 

Returns the value of the `subject` record component.

 

**Returns:**

 

the value of the `subject` record component

 

### triggeringPlayer

  

```java
public UUID triggeringPlayer()
```

 

Returns the value of the `triggeringPlayer` record component.

 

**Returns:**

 

the value of the `triggeringPlayer` record component

 

### policyId

  

```java
public net.minecraft.resources.Identifier policyId()
```

 

Returns the value of the `policyId` record component.

 

**Returns:**

 

the value of the `policyId` record component

 

### location

  

```java
public LocationSnapshot location()
```

 

Returns the value of the `location` record component.

 

**Returns:**

 

the value of the `location` record component
