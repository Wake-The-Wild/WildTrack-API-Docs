# StorageDataKey

`dev.wakethewild.wildtrack.api.storage.StorageDataKey`

```java
public record StorageDataKey<T>(net.minecraft.resources.Identifier id, Class<T> valueType)
```

 

Namespaced identity and runtime type for a persisted extension value.

## Constructor Details

 

### StorageDataKey

  

```java
public StorageDataKey(net.minecraft.resources.Identifier id, Class<T> valueType)
```

 

Creates an instance of a `StorageDataKey` record class.

 

**Parameters:**

 

`id` - the value for the `id` record component

 

`valueType` - the value for the `valueType` record component

  

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

 

### id

  

```java
public net.minecraft.resources.Identifier id()
```

 

Returns the value of the `id` record component.

 

**Returns:**

 

the value of the `id` record component

 

### valueType

  

```java
public Class<T> valueType()
```

 

Returns the value of the `valueType` record component.

 

**Returns:**

 

the value of the `valueType` record component
