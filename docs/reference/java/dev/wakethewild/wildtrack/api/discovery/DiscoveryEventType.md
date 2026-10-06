# DiscoveryEventType

`dev.wakethewild.wildtrack.api.discovery.DiscoveryEventType`

**All Implemented Interfaces:**

 

`Serializable, Comparable<DiscoveryEventType>, Constable`

   

```java
public enum DiscoveryEventType
```

## Enum Constant Details

 

### ENTER

  

```java
public static final DiscoveryEventType ENTER
```

 

### LEAVE

  

```java
public static final DiscoveryEventType LEAVE
```

 

### FIRST_DISCOVERED

  

```java
public static final DiscoveryEventType FIRST_DISCOVERED
```

 

### DATA_CHANGED

  

```java
public static final DiscoveryEventType DATA_CHANGED
```

  

## Method Details

 

### values

  

```java
public static DiscoveryEventType[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static DiscoveryEventType valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
