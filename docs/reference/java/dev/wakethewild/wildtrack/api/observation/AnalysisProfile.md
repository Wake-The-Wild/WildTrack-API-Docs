# AnalysisProfile

`dev.wakethewild.wildtrack.api.observation.AnalysisProfile`

```java
public record AnalysisProfile(
    ObservationStage minimumStage,
    AnalysisComplexity complexity,
    boolean needsBlockStates,
    boolean needsBiomes,
    boolean needsHeightmaps
)
```

## Constructor Details

 

### AnalysisProfile

  

```java
public AnalysisProfile(
    ObservationStage minimumStage,
    AnalysisComplexity complexity,
    boolean needsBlockStates,
    boolean needsBiomes,
    boolean needsHeightmaps
)
```

 

Creates an instance of a `AnalysisProfile` record class.

 

**Parameters:**

 

`minimumStage` - the value for the `minimumStage` record component

 

`complexity` - the value for the `complexity` record component

 

`needsBlockStates` - the value for the `needsBlockStates` record component

 

`needsBiomes` - the value for the `needsBiomes` record component

 

`needsHeightmaps` - the value for the `needsHeightmaps` record component

  

## Method Details

 

### requiredCapabilities

  

```java
public Set<SnapshotCapability> requiredCapabilities()
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

 

### minimumStage

  

```java
public ObservationStage minimumStage()
```

 

Returns the value of the `minimumStage` record component.

 

**Returns:**

 

the value of the `minimumStage` record component

 

### complexity

  

```java
public AnalysisComplexity complexity()
```

 

Returns the value of the `complexity` record component.

 

**Returns:**

 

the value of the `complexity` record component

 

### needsBlockStates

  

```java
public boolean needsBlockStates()
```

 

Returns the value of the `needsBlockStates` record component.

 

**Returns:**

 

the value of the `needsBlockStates` record component

 

### needsBiomes

  

```java
public boolean needsBiomes()
```

 

Returns the value of the `needsBiomes` record component.

 

**Returns:**

 

the value of the `needsBiomes` record component

 

### needsHeightmaps

  

```java
public boolean needsHeightmaps()
```

 

Returns the value of the `needsHeightmaps` record component.

 

**Returns:**

 

the value of the `needsHeightmaps` record component
