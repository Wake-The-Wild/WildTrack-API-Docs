# WatercourseQueryResult

`dev.wakethewild.wildtrack.api.classification.WatercourseQueryResult`

```java
public record WatercourseQueryResult(
    WatercourseQueryStatus status,
    long revision,
    Optional<WatercourseFragment> fragment
)
```

 

Revision-aware result that distinguishes absent observations from a confirmed negative.

## Constructor Details

 

### WatercourseQueryResult

  

```java
public WatercourseQueryResult(
    WatercourseQueryStatus status,
    long revision,
    Optional<WatercourseFragment> fragment
)
```

 

Creates an instance of a `WatercourseQueryResult` record class.

 

**Parameters:**

 

`status` - the value for the `status` record component

 

`revision` - the value for the `revision` record component

 

`fragment` - the value for the `fragment` record component

  

## Method Details

 

### unknown

  

```java
public static WatercourseQueryResult unknown()
```

 

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

 

### status

  

```java
public WatercourseQueryStatus status()
```

 

Returns the value of the `status` record component.

 

**Returns:**

 

the value of the `status` record component

 

### revision

  

```java
public long revision()
```

 

Returns the value of the `revision` record component.

 

**Returns:**

 

the value of the `revision` record component

 

### fragment

  

```java
public Optional<WatercourseFragment> fragment()
```

 

Returns the value of the `fragment` record component.

 

**Returns:**

 

the value of the `fragment` record component
