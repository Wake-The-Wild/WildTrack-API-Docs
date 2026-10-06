# SnapshotCapability

`dev.wakethewild.wildtrack.api.observation.SnapshotCapability`

**All Implemented Interfaces:**

 

`Serializable, Comparable<SnapshotCapability>, Constable`

   

```java
public enum SnapshotCapability
```

 

Data families physically present in an immutable chunk snapshot.

## Enum Constant Details

 

### BLOCK_STATES

  

```java
public static final SnapshotCapability BLOCK_STATES
```

 

### BIOMES

  

```java
public static final SnapshotCapability BIOMES
```

 

### HEIGHTMAPS

  

```java
public static final SnapshotCapability HEIGHTMAPS
```

  

## Method Details

 

### values

  

```java
public static SnapshotCapability[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static SnapshotCapability valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
