# DistanceMetric

`dev.wakethewild.wildtrack.api.spatial.DistanceMetric`

**All Implemented Interfaces:**

 

`Serializable, Comparable<DistanceMetric>, Constable`

   

```java
public enum DistanceMetric
```

 

Distance metrics supported by built-in spatial queries.

## Enum Constant Details

 

### EUCLIDEAN_3D

  

```java
public static final DistanceMetric EUCLIDEAN_3D
```

 

### HORIZONTAL

  

```java
public static final DistanceMetric HORIZONTAL
```

  

## Method Details

 

### values

  

```java
public static DistanceMetric[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static DistanceMetric valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null

 

### distanceSquared

  

```java
public abstract double distanceSquared(
    net.minecraft.world.phys.Vec3 first,
    net.minecraft.world.phys.Vec3 second
)
```

 

### distance

  

```java
public double distance(net.minecraft.world.phys.Vec3 first, net.minecraft.world.phys.Vec3 second)
```
