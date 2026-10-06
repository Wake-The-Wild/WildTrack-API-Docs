# EntranceProximityStatus

`dev.wakethewild.wildtrack.api.subterranean.EntranceProximityStatus`

**All Implemented Interfaces:**

 

`Serializable, Comparable<EntranceProximityStatus>, Constable`

   

```java
public enum EntranceProximityStatus
```

 

Whether every chunk intersecting an entrance search was available.

## Enum Constant Details

 

### COMPLETE

  

```java
public static final EntranceProximityStatus COMPLETE
```

 

### PARTIAL

  

```java
public static final EntranceProximityStatus PARTIAL
```

  

## Method Details

 

### values

  

```java
public static EntranceProximityStatus[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static EntranceProximityStatus valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
