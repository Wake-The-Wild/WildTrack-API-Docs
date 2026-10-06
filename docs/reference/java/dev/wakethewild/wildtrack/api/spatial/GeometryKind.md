# GeometryKind

`dev.wakethewild.wildtrack.api.spatial.GeometryKind`

**All Implemented Interfaces:**

 

`Serializable, Comparable<GeometryKind>, Constable`

   

```java
public enum GeometryKind
```

 

Built-in geometry families. Providers can expose custom behavior through [`SpatialGeometry`](SpatialGeometry.md) while returning `CUSTOM` here.

## Enum Constant Details

 

### PIECE

  

```java
public static final GeometryKind PIECE
```

 

### BOUNDING_BOX

  

```java
public static final GeometryKind BOUNDING_BOX
```

 

### RADIUS

  

```java
public static final GeometryKind RADIUS
```

 

### CELL_REGION

  

```java
public static final GeometryKind CELL_REGION
```

 

### CUSTOM

  

```java
public static final GeometryKind CUSTOM
```

  

## Method Details

 

### values

  

```java
public static GeometryKind[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static GeometryKind valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
