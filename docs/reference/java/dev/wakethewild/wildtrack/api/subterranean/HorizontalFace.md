# HorizontalFace

`dev.wakethewild.wildtrack.api.subterranean.HorizontalFace`

**All Implemented Interfaces:**

 

`Serializable, Comparable<HorizontalFace>, Constable`

   

```java
public enum HorizontalFace
```

## Enum Constant Details

 

### NORTH

  

```java
public static final HorizontalFace NORTH
```

 

### SOUTH

  

```java
public static final HorizontalFace SOUTH
```

 

### WEST

  

```java
public static final HorizontalFace WEST
```

 

### EAST

  

```java
public static final HorizontalFace EAST
```

  

## Method Details

 

### values

  

```java
public static HorizontalFace[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static HorizontalFace valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null

 

### chunkOffsetX

  

```java
public int chunkOffsetX()
```

 

### chunkOffsetZ

  

```java
public int chunkOffsetZ()
```

 

### opposite

  

```java
public HorizontalFace opposite()
```
