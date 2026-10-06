# DiscoverySubject

`dev.wakethewild.wildtrack.api.discovery.DiscoverySubject`

```java
public record DiscoverySubject(DiscoveryScope scope, Optional<UUID> player)
```

## Constructor Details

 

### DiscoverySubject

  

```java
public DiscoverySubject(DiscoveryScope scope, Optional<UUID> player)
```

 

Creates an instance of a `DiscoverySubject` record class.

 

**Parameters:**

 

`scope` - the value for the `scope` record component

 

`player` - the value for the `player` record component

  

## Method Details

 

### player

  

```java
public static DiscoverySubject player(UUID player)
```

 

### sharedWorld

  

```java
public static DiscoverySubject sharedWorld()
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

 

### scope

  

```java
public DiscoveryScope scope()
```

 

Returns the value of the `scope` record component.

 

**Returns:**

 

the value of the `scope` record component

 

### player

  

```java
public Optional<UUID> player()
```

 

Returns the value of the `player` record component.

 

**Returns:**

 

the value of the `player` record component
