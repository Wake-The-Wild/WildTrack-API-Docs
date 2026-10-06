# QueryStatus

`dev.wakethewild.wildtrack.api.query.QueryStatus`

**All Implemented Interfaces:**

 

`Serializable, Comparable<QueryStatus>, Constable`

   

```java
public enum QueryStatus
```

## Enum Constant Details

 

### COMPLETE

  

```java
public static final QueryStatus COMPLETE
```

 

### RESULT_LIMIT_REACHED

  

```java
public static final QueryStatus RESULT_LIMIT_REACHED
```

 

### BUDGET_EXHAUSTED

  

```java
public static final QueryStatus BUDGET_EXHAUSTED
```

  

## Method Details

 

### values

  

```java
public static QueryStatus[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static QueryStatus valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
