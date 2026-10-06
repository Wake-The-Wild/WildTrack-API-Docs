# SubterraneanQueryResult

`dev.wakethewild.wildtrack.api.subterranean.SubterraneanQueryResult`

```java
public record SubterraneanQueryResult(SubterraneanQueryStatus status, Optional<SubterraneanProfile> profile)
```

 

Explicit result that distinguishes missing observations from an empty cave volume.

## Constructor Details

 

### SubterraneanQueryResult

  

```java
public SubterraneanQueryResult(SubterraneanQueryStatus status, Optional<SubterraneanProfile> profile)
```

 

Creates an instance of a `SubterraneanQueryResult` record class.

 

**Parameters:**

 

`status` - the value for the `status` record component

 

`profile` - the value for the `profile` record component

  

## Method Details

 

### available

  

```java
public static SubterraneanQueryResult available(SubterraneanProfile profile)
```

 

### insufficientData

  

```java
public static SubterraneanQueryResult insufficientData()
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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object)).

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### status

  

```java
public SubterraneanQueryStatus status()
```

 

Returns the value of the `status` record component.

 

**Returns:**

 

the value of the `status` record component

 

### profile

  

```java
public Optional<SubterraneanProfile> profile()
```

 

Returns the value of the `profile` record component.

 

**Returns:**

 

the value of the `profile` record component
