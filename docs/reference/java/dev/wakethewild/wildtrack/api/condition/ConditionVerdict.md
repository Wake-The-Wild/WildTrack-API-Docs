# ConditionVerdict

`dev.wakethewild.wildtrack.api.condition.ConditionVerdict`

**All Implemented Interfaces:**

 

`Serializable, Comparable<ConditionVerdict>, Constable`

   

```java
public enum ConditionVerdict
```

 

Three-state condition outcome that preserves unavailable world knowledge.

## Enum Constant Details

 

### PASS

  

```java
public static final ConditionVerdict PASS
```

 

### FAIL

  

```java
public static final ConditionVerdict FAIL
```

 

### UNKNOWN

  

```java
public static final ConditionVerdict UNKNOWN
```

  

## Method Details

 

### values

  

```java
public static ConditionVerdict[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static ConditionVerdict valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null

 

### negated

  

```java
public ConditionVerdict negated()
```
