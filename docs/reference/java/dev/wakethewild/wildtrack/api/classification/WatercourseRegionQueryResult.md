# WatercourseRegionQueryResult

`dev.wakethewild.wildtrack.api.classification.WatercourseRegionQueryResult`

```java
public record WatercourseRegionQueryResult(WatercourseQueryStatus status, Optional<WatercourseRegion> region)
```

## Constructor Details

 

### WatercourseRegionQueryResult

  

```java
public WatercourseRegionQueryResult(WatercourseQueryStatus status, Optional<WatercourseRegion> region)
```

 

Creates an instance of a `WatercourseRegionQueryResult` record class.

 

**Parameters:**

 

`status` - the value for the `status` record component

 

`region` - the value for the `region` record component

  

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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)).

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### status

  

```java
public WatercourseQueryStatus status()
```

 

Returns the value of the `status` record component.

 

**Returns:**

 

the value of the `status` record component

 

### region

  

```java
public Optional<WatercourseRegion> region()
```

 

Returns the value of the `region` record component.

 

**Returns:**

 

the value of the `region` record component
