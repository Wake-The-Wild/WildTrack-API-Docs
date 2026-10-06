# LocationIdentitySource

`dev.wakethewild.wildtrack.api.location.LocationIdentitySource`

```java
public record LocationIdentitySource(
    ProviderId provider,
    LocationTypeId type,
    net.minecraft.resources.Identifier dimension,
    String stableSourceKey
)
```

 

Stable provider-native inputs used to derive a concrete location identity.

## Constructor Details

 

### LocationIdentitySource

  

```java
public LocationIdentitySource(
    ProviderId provider,
    LocationTypeId type,
    net.minecraft.resources.Identifier dimension,
    String stableSourceKey
)
```

 

Creates an instance of a `LocationIdentitySource` record class.

 

**Parameters:**

 

`provider` - the value for the `provider` record component

 

`type` - the value for the `type` record component

 

`dimension` - the value for the `dimension` record component

 

`stableSourceKey` - the value for the `stableSourceKey` record component

  

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

 

### provider

  

```java
public ProviderId provider()
```

 

Returns the value of the `provider` record component.

 

**Returns:**

 

the value of the `provider` record component

 

### type

  

```java
public LocationTypeId type()
```

 

Returns the value of the `type` record component.

 

**Returns:**

 

the value of the `type` record component

 

### dimension

  

```java
public net.minecraft.resources.Identifier dimension()
```

 

Returns the value of the `dimension` record component.

 

**Returns:**

 

the value of the `dimension` record component

 

### stableSourceKey

  

```java
public String stableSourceKey()
```

 

Returns the value of the `stableSourceKey` record component.

 

**Returns:**

 

the value of the `stableSourceKey` record component
