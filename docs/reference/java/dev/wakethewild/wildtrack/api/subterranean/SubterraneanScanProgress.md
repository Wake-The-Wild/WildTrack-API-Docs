# SubterraneanScanProgress

`dev.wakethewild.wildtrack.api.subterranean.SubterraneanScanProgress`

```java
public record SubterraneanScanProgress(
    SubterraneanScanPhase phase,
    long revision,
    int capturedLayers,
    int totalLayers
)
```

 

Non-loading progress view for one chunk's current subterranean observation.

## Constructor Details

 

### SubterraneanScanProgress

  

```java
public SubterraneanScanProgress(
    SubterraneanScanPhase phase,
    long revision,
    int capturedLayers,
    int totalLayers
)
```

 

Creates an instance of a `SubterraneanScanProgress` record class.

 

**Parameters:**

 

`phase` - the value for the `phase` record component

 

`revision` - the value for the `revision` record component

 

`capturedLayers` - the value for the `capturedLayers` record component

 

`totalLayers` - the value for the `totalLayers` record component

  

## Method Details

 

### unknown

  

```java
public static SubterraneanScanProgress unknown()
```

 

### percent

  

```java
public int percent()
```

 

### ready

  

```java
public boolean ready()
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

 

### phase

  

```java
public SubterraneanScanPhase phase()
```

 

Returns the value of the `phase` record component.

 

**Returns:**

 

the value of the `phase` record component

 

### revision

  

```java
public long revision()
```

 

Returns the value of the `revision` record component.

 

**Returns:**

 

the value of the `revision` record component

 

### capturedLayers

  

```java
public int capturedLayers()
```

 

Returns the value of the `capturedLayers` record component.

 

**Returns:**

 

the value of the `capturedLayers` record component

 

### totalLayers

  

```java
public int totalLayers()
```

 

Returns the value of the `totalLayers` record component.

 

**Returns:**

 

the value of the `totalLayers` record component
