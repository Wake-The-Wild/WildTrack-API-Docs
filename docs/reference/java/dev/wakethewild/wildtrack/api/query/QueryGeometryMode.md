# QueryGeometryMode

`dev.wakethewild.wildtrack.api.query.QueryGeometryMode`

**All Implemented Interfaces:**

 

`Serializable, Comparable<QueryGeometryMode>, Constable`

   

```java
public enum QueryGeometryMode
```

 

Geometry used for intersection, distance constraints and distance ordering.

## Enum Constant Details

 

### KNOWN_GEOMETRY

  

```java
public static final QueryGeometryMode KNOWN_GEOMETRY
```

 

Exact known fragments, preserving the original query behavior.

 

### ENVELOPE

  

```java
public static final QueryGeometryMode ENVELOPE
```

 

The enclosing acceleration envelope, including gaps and provider margins.

  

## Method Details

 

### values

  

```java
public static QueryGeometryMode[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static QueryGeometryMode valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
