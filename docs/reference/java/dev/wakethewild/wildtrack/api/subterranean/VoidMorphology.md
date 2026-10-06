# VoidMorphology

`dev.wakethewild.wildtrack.api.subterranean.VoidMorphology`

**All Implemented Interfaces:**

 

`Serializable, Comparable<VoidMorphology>, Constable`

   

```java
public enum VoidMorphology
```

 

Coarse shape family derived from exact local void bounds.

## Enum Constant Details

 

### COMPACT_CHAMBER

  

```java
public static final VoidMorphology COMPACT_CHAMBER
```

 

### HORIZONTAL_PASSAGE

  

```java
public static final VoidMorphology HORIZONTAL_PASSAGE
```

 

### VERTICAL_SHAFT

  

```java
public static final VoidMorphology VERTICAL_SHAFT
```

 

### IRREGULAR

  

```java
public static final VoidMorphology IRREGULAR
```

  

## Method Details

 

### values

  

```java
public static VoidMorphology[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static VoidMorphology valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null

 

### classify

  

```java
public static VoidMorphology classify(LargestVoidShape shape)
```
