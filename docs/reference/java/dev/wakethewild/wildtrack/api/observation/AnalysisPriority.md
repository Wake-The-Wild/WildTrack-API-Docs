# AnalysisPriority

`dev.wakethewild.wildtrack.api.observation.AnalysisPriority`

**All Implemented Interfaces:**

 

`Serializable, Comparable<AnalysisPriority>, Constable`

   

```java
public enum AnalysisPriority
```

 

Server-assigned scheduling priority. Providers cannot raise their own priority.

## Enum Constant Details

 

### BACKGROUND

  

```java
public static final AnalysisPriority BACKGROUND
```

 

### LOADED

  

```java
public static final AnalysisPriority LOADED
```

 

### PLAYER_NEARBY

  

```java
public static final AnalysisPriority PLAYER_NEARBY
```

 

### PLAYER_CURRENT

  

```java
public static final AnalysisPriority PLAYER_CURRENT
```

  

## Method Details

 

### values

  

```java
public static AnalysisPriority[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static AnalysisPriority valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null

 

### rank

  

```java
public int rank()
```
