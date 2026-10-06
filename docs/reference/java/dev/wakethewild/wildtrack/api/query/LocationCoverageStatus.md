# LocationCoverageStatus

`dev.wakethewild.wildtrack.api.query.LocationCoverageStatus`

**All Implemented Interfaces:**

 

`Serializable, Comparable<LocationCoverageStatus>, Constable`

   

```java
public enum LocationCoverageStatus
```

## Enum Constant Details

 

### AVAILABLE

  

```java
public static final LocationCoverageStatus AVAILABLE
```

 

All requested source columns and their references were available for this observation.

 

### PENDING

  

```java
public static final LocationCoverageStatus PENDING
```

 

Some source data is not available yet; an empty index query cannot establish absence.

 

### BUDGET_EXHAUSTED

  

```java
public static final LocationCoverageStatus BUDGET_EXHAUSTED
```

 

### UNSUPPORTED

  

```java
public static final LocationCoverageStatus UNSUPPORTED
```

 

The provider has no source coverage observer.

  

## Method Details

 

### values

  

```java
public static LocationCoverageStatus[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static LocationCoverageStatus valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
