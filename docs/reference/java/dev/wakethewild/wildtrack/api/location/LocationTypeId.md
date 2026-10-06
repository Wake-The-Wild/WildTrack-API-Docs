# LocationTypeId

`dev.wakethewild.wildtrack.api.location.LocationTypeId`

```java
public record LocationTypeId(net.minecraft.resources.Identifier value)
```

## Constructor Details

 

### LocationTypeId

  

```java
public LocationTypeId(net.minecraft.resources.Identifier value)
```

 

Creates an instance of a `LocationTypeId` record class.

 

**Parameters:**

 

`value` - the value for the `value` record component

  

## Method Details

 

### toString

  

```java
public String toString()
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

 

### value

  

```java
public net.minecraft.resources.Identifier value()
```

 

Returns the value of the `value` record component.

 

**Returns:**

 

the value of the `value` record component
