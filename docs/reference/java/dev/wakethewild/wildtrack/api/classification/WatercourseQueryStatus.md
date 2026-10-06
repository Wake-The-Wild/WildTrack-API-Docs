# WatercourseQueryStatus

`dev.wakethewild.wildtrack.api.classification.WatercourseQueryStatus`

**All Implemented Interfaces:**

 

`Serializable, Comparable<WatercourseQueryStatus>, Constable`

   

```java
public enum WatercourseQueryStatus
```

 

Whether a chunk has been analyzed and classified as a water corridor.

## Enum Constant Details

 

### UNKNOWN

  

```java
public static final WatercourseQueryStatus UNKNOWN
```

 

### NO_WATERCOURSE

  

```java
public static final WatercourseQueryStatus NO_WATERCOURSE
```

 

### DETECTED

  

```java
public static final WatercourseQueryStatus DETECTED
```

  

## Method Details

 

### values

  

```java
public static WatercourseQueryStatus[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static WatercourseQueryStatus valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
