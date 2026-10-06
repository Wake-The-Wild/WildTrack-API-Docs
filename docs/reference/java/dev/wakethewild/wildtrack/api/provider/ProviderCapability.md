# ProviderCapability

`dev.wakethewild.wildtrack.api.provider.ProviderCapability`

**All Implemented Interfaces:**

 

`Serializable, Comparable<ProviderCapability>, Constable`

   

```java
public enum ProviderCapability
```

## Enum Constant Details

 

### PUBLISH_LOCATIONS

  

```java
public static final ProviderCapability PUBLISH_LOCATIONS
```

 

### CUSTOM_GEOMETRY

  

```java
public static final ProviderCapability CUSTOM_GEOMETRY
```

 

### PERSISTENT_METADATA

  

```java
public static final ProviderCapability PERSISTENT_METADATA
```

 

### LOADED_CHUNK_ANALYSIS

  

```java
public static final ProviderCapability LOADED_CHUNK_ANALYSIS
```

 

### WORLDGEN_SAFE_PREDICTION

  

```java
public static final ProviderCapability WORLDGEN_SAFE_PREDICTION
```

  

## Method Details

 

### values

  

```java
public static ProviderCapability[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static ProviderCapability valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
