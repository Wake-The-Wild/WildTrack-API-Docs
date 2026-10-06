# BlockSearchStatus

`dev.wakethewild.wildtrack.api.query.BlockSearchStatus`

**All Implemented Interfaces:**

 

`Serializable, Comparable<BlockSearchStatus>, Constable`

   

```java
public enum BlockSearchStatus
```

## Enum Constant Details

 

### COMPLETE

  

```java
public static final BlockSearchStatus COMPLETE
```

 

### INCOMPLETE

  

```java
public static final BlockSearchStatus INCOMPLETE
```

 

### BUDGET_EXHAUSTED

  

```java
public static final BlockSearchStatus BUDGET_EXHAUSTED
```

  

## Method Details

 

### values

  

```java
public static BlockSearchStatus[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static BlockSearchStatus valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
