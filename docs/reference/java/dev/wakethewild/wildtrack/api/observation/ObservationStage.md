# ObservationStage

`dev.wakethewild.wildtrack.api.observation.ObservationStage`

**All Implemented Interfaces:**

 

`Serializable, Comparable<ObservationStage>, Constable`

   

```java
public enum ObservationStage
```

 

Minimum world-generation maturity represented by a chunk snapshot.

## Enum Constant Details

 

### PREDICTED

  

```java
public static final ObservationStage PREDICTED
```

 

### BIOMES

  

```java
public static final ObservationStage BIOMES
```

 

### NOISE

  

```java
public static final ObservationStage NOISE
```

 

### SURFACE

  

```java
public static final ObservationStage SURFACE
```

 

### CARVERS

  

```java
public static final ObservationStage CARVERS
```

 

### FEATURES

  

```java
public static final ObservationStage FEATURES
```

 

### COMPLETE

  

```java
public static final ObservationStage COMPLETE
```

  

## Method Details

 

### values

  

```java
public static ObservationStage[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static ObservationStage valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null

 

### satisfies

  

```java
public boolean satisfies(ObservationStage required)
```
