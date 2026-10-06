# AnalysisComplexity

`dev.wakethewild.wildtrack.api.observation.AnalysisComplexity`

**All Implemented Interfaces:**

 

`Serializable, Comparable<AnalysisComplexity>, Constable`

   

```java
public enum AnalysisComplexity
```

 

Scheduling hint; actual time and memory budgets remain server-controlled.

## Enum Constant Details

 

### LIGHT

  

```java
public static final AnalysisComplexity LIGHT
```

 

### MEDIUM

  

```java
public static final AnalysisComplexity MEDIUM
```

 

### HEAVY

  

```java
public static final AnalysisComplexity HEAVY
```

  

## Method Details

 

### values

  

```java
public static AnalysisComplexity[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static AnalysisComplexity valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
