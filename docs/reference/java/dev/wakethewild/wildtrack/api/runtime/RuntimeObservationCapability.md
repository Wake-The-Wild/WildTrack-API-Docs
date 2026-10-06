# RuntimeObservationCapability

`dev.wakethewild.wildtrack.api.runtime.RuntimeObservationCapability`

**All Implemented Interfaces:**

 

`Serializable, Comparable<RuntimeObservationCapability>, Constable`

   

```java
public enum RuntimeObservationCapability
```

 

Expensive runtime knowledge that a consumer can keep warm for loaded chunks.

## Enum Constant Details

 

### SUBTERRANEAN

  

```java
public static final RuntimeObservationCapability SUBTERRANEAN
```

  

## Method Details

 

### values

  

```java
public static RuntimeObservationCapability[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static RuntimeObservationCapability valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
