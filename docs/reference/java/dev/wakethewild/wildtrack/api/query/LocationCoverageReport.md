# LocationCoverageReport

`dev.wakethewild.wildtrack.api.query.LocationCoverageReport`

```java
public record LocationCoverageReport(
    LocationCoverageStatus status,
    int examinedChunks,
    int unavailableChunks,
    int examinedReferences,
    int unavailableReferences
)
```

 

Reference counts include examined entries; unavailable references are counted once per observation.

## Constructor Details

 

### LocationCoverageReport

  

```java
public LocationCoverageReport(
    LocationCoverageStatus status,
    int examinedChunks,
    int unavailableChunks,
    int examinedReferences,
    int unavailableReferences
)
```

 

Creates an instance of a `LocationCoverageReport` record class.

 

**Parameters:**

 

`status` - the value for the `status` record component

 

`examinedChunks` - the value for the `examinedChunks` record component

 

`unavailableChunks` - the value for the `unavailableChunks` record component

 

`examinedReferences` - the value for the `examinedReferences` record component

 

`unavailableReferences` - the value for the `unavailableReferences` record component

  

## Method Details

 

### unsupported

  

```java
public static LocationCoverageReport unsupported()
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
public LocationCoverageStatus status()
```

 

Returns the value of the `status` record component.

 

**Returns:**

 

the value of the `status` record component

 

### examinedChunks

  

```java
public int examinedChunks()
```

 

Returns the value of the `examinedChunks` record component.

 

**Returns:**

 

the value of the `examinedChunks` record component

 

### unavailableChunks

  

```java
public int unavailableChunks()
```

 

Returns the value of the `unavailableChunks` record component.

 

**Returns:**

 

the value of the `unavailableChunks` record component

 

### examinedReferences

  

```java
public int examinedReferences()
```

 

Returns the value of the `examinedReferences` record component.

 

**Returns:**

 

the value of the `examinedReferences` record component

 

### unavailableReferences

  

```java
public int unavailableReferences()
```

 

Returns the value of the `unavailableReferences` record component.

 

**Returns:**

 

the value of the `unavailableReferences` record component
