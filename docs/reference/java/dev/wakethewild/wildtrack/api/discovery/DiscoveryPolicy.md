# DiscoveryPolicy

`dev.wakethewild.wildtrack.api.discovery.DiscoveryPolicy`

```java
public record DiscoveryPolicy(
    net.minecraft.resources.Identifier id,
    DiscoveryScope scope,
    LocationSelector selector,
    double enterDistance,
    double leaveDistance,
    DistanceMetric distanceMetric,
    double minimumConfidence
)
```

 

Immutable automatic discovery rule with leave-distance hysteresis.

## Constructor Details

 

### DiscoveryPolicy

  

```java
public DiscoveryPolicy(
    net.minecraft.resources.Identifier id,
    DiscoveryScope scope,
    LocationSelector selector,
    double enterDistance,
    double leaveDistance,
    DistanceMetric distanceMetric,
    double minimumConfidence
)
```

 

Creates an instance of a `DiscoveryPolicy` record class.

 

**Parameters:**

 

`id` - the value for the `id` record component

 

`scope` - the value for the `scope` record component

 

`selector` - the value for the `selector` record component

 

`enterDistance` - the value for the `enterDistance` record component

 

`leaveDistance` - the value for the `leaveDistance` record component

 

`distanceMetric` - the value for the `distanceMetric` record component

 

`minimumConfidence` - the value for the `minimumConfidence` record component

  

## Method Details

 

### toString

  

```java
public final String toString()
```

 

Returns a string representation of this record class. The representation contains the name of the class, followed by the name and value of each of the record components.

 

**Specified by:**

 

`toString` in class `Record`

 

**Returns:**

 

a string representation of this object

 

### hashCode

  

```java
public final int hashCode()
```

 

Returns a hash code value for this object. The value is derived from the hash code of each of the record components.

 

**Specified by:**

 

`hashCode` in class `Record`

 

**Returns:**

 

a hash code value for this object

 

### equals

  

```java
public final boolean equals(Object o)
```

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. Reference components are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)); primitive components are compared with the `compare` method from their corresponding wrapper classes.

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### id

  

```java
public net.minecraft.resources.Identifier id()
```

 

Returns the value of the `id` record component.

 

**Returns:**

 

the value of the `id` record component

 

### scope

  

```java
public DiscoveryScope scope()
```

 

Returns the value of the `scope` record component.

 

**Returns:**

 

the value of the `scope` record component

 

### selector

  

```java
public LocationSelector selector()
```

 

Returns the value of the `selector` record component.

 

**Returns:**

 

the value of the `selector` record component

 

### enterDistance

  

```java
public double enterDistance()
```

 

Returns the value of the `enterDistance` record component.

 

**Returns:**

 

the value of the `enterDistance` record component

 

### leaveDistance

  

```java
public double leaveDistance()
```

 

Returns the value of the `leaveDistance` record component.

 

**Returns:**

 

the value of the `leaveDistance` record component

 

### distanceMetric

  

```java
public DistanceMetric distanceMetric()
```

 

Returns the value of the `distanceMetric` record component.

 

**Returns:**

 

the value of the `distanceMetric` record component

 

### minimumConfidence

  

```java
public double minimumConfidence()
```

 

Returns the value of the `minimumConfidence` record component.

 

**Returns:**

 

the value of the `minimumConfidence` record component
