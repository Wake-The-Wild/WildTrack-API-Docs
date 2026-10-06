# WatercourseFragment

`dev.wakethewild.wildtrack.api.classification.WatercourseFragment`

```java
public record WatercourseFragment(
    int waterColumns,
    double waterCoverage,
    double approximateWidthBlocks,
    double confidence,
    EnvironmentBoundaryEvidence boundaryEvidence
)
```

 

Chunk-local evidence for a narrow water corridor that crosses chunk edges.

## Constructor Details

 

### WatercourseFragment

  

```java
public WatercourseFragment(
    int waterColumns,
    double waterCoverage,
    double approximateWidthBlocks,
    double confidence,
    EnvironmentBoundaryEvidence boundaryEvidence
)
```

 

Creates an instance of a `WatercourseFragment` record class.

 

**Parameters:**

 

`waterColumns` - the value for the `waterColumns` record component

 

`waterCoverage` - the value for the `waterCoverage` record component

 

`approximateWidthBlocks` - the value for the `approximateWidthBlocks` record component

 

`confidence` - the value for the `confidence` record component

 

`boundaryEvidence` - the value for the `boundaryEvidence` record component

  

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

 

### waterColumns

  

```java
public int waterColumns()
```

 

Returns the value of the `waterColumns` record component.

 

**Returns:**

 

the value of the `waterColumns` record component

 

### waterCoverage

  

```java
public double waterCoverage()
```

 

Returns the value of the `waterCoverage` record component.

 

**Returns:**

 

the value of the `waterCoverage` record component

 

### approximateWidthBlocks

  

```java
public double approximateWidthBlocks()
```

 

Returns the value of the `approximateWidthBlocks` record component.

 

**Returns:**

 

the value of the `approximateWidthBlocks` record component

 

### confidence

  

```java
public double confidence()
```

 

Returns the value of the `confidence` record component.

 

**Returns:**

 

the value of the `confidence` record component

 

### boundaryEvidence

  

```java
public EnvironmentBoundaryEvidence boundaryEvidence()
```

 

Returns the value of the `boundaryEvidence` record component.

 

**Returns:**

 

the value of the `boundaryEvidence` record component
