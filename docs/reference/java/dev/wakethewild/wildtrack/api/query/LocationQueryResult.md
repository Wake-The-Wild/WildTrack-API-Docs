# LocationQueryResult

`dev.wakethewild.wildtrack.api.query.LocationQueryResult`

```java
public record LocationQueryResult(
    List<LocationSnapshot> locations,
    QueryStatus status,
    int examinedCandidates
)
```

## Constructor Details

 

### LocationQueryResult

  

```java
public LocationQueryResult(List<LocationSnapshot> locations, QueryStatus status, int examinedCandidates)
```

 

Creates an instance of a `LocationQueryResult` record class.

 

**Parameters:**

 

`locations` - the value for the `locations` record component

 

`status` - the value for the `status` record component

 

`examinedCandidates` - the value for the `examinedCandidates` record component

  

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

 

### locations

  

```java
public List<LocationSnapshot> locations()
```

 

Returns the value of the `locations` record component.

 

**Returns:**

 

the value of the `locations` record component

 

### status

  

```java
public QueryStatus status()
```

 

Returns the value of the `status` record component.

 

**Returns:**

 

the value of the `status` record component

 

### examinedCandidates

  

```java
public int examinedCandidates()
```

 

Returns the value of the `examinedCandidates` record component.

 

**Returns:**

 

the value of the `examinedCandidates` record component
