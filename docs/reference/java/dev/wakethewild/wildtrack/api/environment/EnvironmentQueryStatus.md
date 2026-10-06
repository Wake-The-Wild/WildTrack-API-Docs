# EnvironmentQueryStatus

`dev.wakethewild.wildtrack.api.environment.EnvironmentQueryStatus`

**All Implemented Interfaces:**

 

`Serializable, Comparable<EnvironmentQueryStatus>, Constable`

   

```java
public enum EnvironmentQueryStatus
```

## Enum Constant Details

 

### AVAILABLE

  

```java
public static final EnvironmentQueryStatus AVAILABLE
```

 

### INSUFFICIENT_DATA

  

```java
public static final EnvironmentQueryStatus INSUFFICIENT_DATA
```

 

### UNREGISTERED_BIOME

  

```java
public static final EnvironmentQueryStatus UNREGISTERED_BIOME
```

  

## Method Details

 

### values

  

```java
public static EnvironmentQueryStatus[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static EnvironmentQueryStatus valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
