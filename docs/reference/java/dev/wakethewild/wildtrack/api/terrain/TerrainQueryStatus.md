# TerrainQueryStatus

`dev.wakethewild.wildtrack.api.terrain.TerrainQueryStatus`

**All Implemented Interfaces:**

 

`Serializable, Comparable<TerrainQueryStatus>, Constable`

   

```java
public enum TerrainQueryStatus
```

## Enum Constant Details

 

### AVAILABLE

  

```java
public static final TerrainQueryStatus AVAILABLE
```

 

### INSUFFICIENT_DATA

  

```java
public static final TerrainQueryStatus INSUFFICIENT_DATA
```

 

### UNSUPPORTED_HEIGHTMAP

  

```java
public static final TerrainQueryStatus UNSUPPORTED_HEIGHTMAP
```

  

## Method Details

 

### values

  

```java
public static TerrainQueryStatus[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static TerrainQueryStatus valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
