# Completeness

`dev.wakethewild.wildtrack.api.knowledge.Completeness`

**All Implemented Interfaces:**

 

`Serializable, Comparable<Completeness>, Constable`

   

```java
public enum Completeness
```

 

Describes how much of a result is currently known.

## Enum Constant Details

 

### PREDICTED

  

```java
public static final Completeness PREDICTED
```

 

Derived without observing the final world state.

 

### PARTIAL

  

```java
public static final Completeness PARTIAL
```

 

Based on observed data with one or more unresolved boundaries.

 

### COMPLETE

  

```java
public static final Completeness COMPLETE
```

 

Complete according to the provider that produced the result.

 

### INVALIDATED

  

```java
public static final Completeness INVALIDATED
```

 

Previously valid data that must be recomputed before authoritative use.

  

## Method Details

 

### values

  

```java
public static Completeness[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static Completeness valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
