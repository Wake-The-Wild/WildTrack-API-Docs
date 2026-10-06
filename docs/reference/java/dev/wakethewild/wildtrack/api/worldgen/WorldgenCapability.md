# WorldgenCapability

`dev.wakethewild.wildtrack.api.worldgen.WorldgenCapability`

**All Implemented Interfaces:**

 

`Serializable, Comparable<WorldgenCapability>, Constable`

   

```java
public enum WorldgenCapability
```

 

Information families safely captured from the caller-provided generation region.

## Enum Constant Details

 

### TERRAIN

  

```java
public static final WorldgenCapability TERRAIN
```

 

### BIOMES

  

```java
public static final WorldgenCapability BIOMES
```

 

### SURFACE

  

```java
public static final WorldgenCapability SURFACE
```

 

### SUBTERRANEAN

  

```java
public static final WorldgenCapability SUBTERRANEAN
```

  

## Method Details

 

### values

  

```java
public static WorldgenCapability[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static WorldgenCapability valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
