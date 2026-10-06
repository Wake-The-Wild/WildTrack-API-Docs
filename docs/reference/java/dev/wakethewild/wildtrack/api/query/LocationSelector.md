# LocationSelector

`dev.wakethewild.wildtrack.api.query.LocationSelector`

```java
public record LocationSelector(
    Set<LocationTypeId> types,
    Set<ProviderId> providers,
    Set<net.minecraft.resources.Identifier> tags
)
```

 

Cheap identity and tag filter applied before spatial query work.

## Constructor Details

 

### LocationSelector

  

```java
public LocationSelector(
    Set<LocationTypeId> types,
    Set<ProviderId> providers,
    Set<net.minecraft.resources.Identifier> tags
)
```

 

Creates an instance of a `LocationSelector` record class.

 

**Parameters:**

 

`types` - the value for the `types` record component

 

`providers` - the value for the `providers` record component

 

`tags` - the value for the `tags` record component

  

## Method Details

 

### any

  

```java
public static LocationSelector any()
```

 

### type

  

```java
public static LocationSelector type(LocationTypeId type)
```

 

### tag

  

```java
public static LocationSelector tag(net.minecraft.resources.Identifier tag)
```

 

### matches

  

```java
public boolean matches(LocationView location)
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

 

### types

  

```java
public Set<LocationTypeId> types()
```

 

Returns the value of the `types` record component.

 

**Returns:**

 

the value of the `types` record component

 

### providers

  

```java
public Set<ProviderId> providers()
```

 

Returns the value of the `providers` record component.

 

**Returns:**

 

the value of the `providers` record component

 

### tags

  

```java
public Set<net.minecraft.resources.Identifier> tags()
```

 

Returns the value of the `tags` record component.

 

**Returns:**

 

the value of the `tags` record component
