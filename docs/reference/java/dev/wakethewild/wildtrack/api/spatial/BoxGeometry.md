# BoxGeometry

`dev.wakethewild.wildtrack.api.spatial.BoxGeometry`

**All Implemented Interfaces:**

 

`SpatialGeometry`

   

```java
public record BoxGeometry(
    net.minecraft.world.phys.AABB envelope,
    Completeness completeness,
    Confidence confidence
) implements SpatialGeometry
```

 

Exact or inferred axis-aligned box geometry.

## Constructor Details

 

### BoxGeometry

  

```java
public BoxGeometry(net.minecraft.world.phys.AABB envelope, Completeness completeness, Confidence confidence)
```

 

Creates an instance of a `BoxGeometry` record class.

 

**Parameters:**

 

`envelope` - the value for the `envelope` record component

 

`completeness` - the value for the `completeness` record component

 

`confidence` - the value for the `confidence` record component

  

## Method Details

 

### kind

  

```java
public GeometryKind kind()
```

 

**Specified by:**

 

`kind` in interface `SpatialGeometry`

 

### knownFragments

  

```java
public List<net.minecraft.world.phys.AABB> knownFragments()
```

 

**Specified by:**

 

`knownFragments` in interface `SpatialGeometry`

 

### contains

  

```java
public boolean contains(net.minecraft.core.BlockPos position)
```

 

**Specified by:**

 

`contains` in interface `SpatialGeometry`

 

### intersects

  

```java
public boolean intersects(net.minecraft.world.phys.AABB bounds)
```

 

**Specified by:**

 

`intersects` in interface `SpatialGeometry`

 

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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)).

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### envelope

  

```java
public net.minecraft.world.phys.AABB envelope()
```

 

Returns the value of the `envelope` record component.

 

**Specified by:**

 

`envelope` in interface `SpatialGeometry`

 

**Returns:**

 

the value of the `envelope` record component

 

### completeness

  

```java
public Completeness completeness()
```

 

Returns the value of the `completeness` record component.

 

**Specified by:**

 

`completeness` in interface `SpatialGeometry`

 

**Returns:**

 

the value of the `completeness` record component

 

### confidence

  

```java
public Confidence confidence()
```

 

Returns the value of the `confidence` record component.

 

**Specified by:**

 

`confidence` in interface `SpatialGeometry`

 

**Returns:**

 

the value of the `confidence` record component
