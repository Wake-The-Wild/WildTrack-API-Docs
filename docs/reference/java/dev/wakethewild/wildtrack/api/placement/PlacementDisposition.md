# PlacementDisposition

`dev.wakethewild.wildtrack.api.placement.PlacementDisposition`

**All Implemented Interfaces:**

 

`Serializable, Comparable<PlacementDisposition>, Constable`

   

```java
public enum PlacementDisposition
```

## Enum Constant Details

 

### ACCEPT

  

```java
public static final PlacementDisposition ACCEPT
```

 

### REJECT

  

```java
public static final PlacementDisposition REJECT
```

 

### DEFER

  

```java
public static final PlacementDisposition DEFER
```

  

## Method Details

 

### values

  

```java
public static PlacementDisposition[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static PlacementDisposition valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
