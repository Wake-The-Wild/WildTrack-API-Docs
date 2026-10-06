# PlacementCandidateAssessment

`dev.wakethewild.wildtrack.api.placement.PlacementCandidateAssessment`

```java
public record PlacementCandidateAssessment(
    int candidateIndex,
    PlacementQuery query,
    PlacementDecision decision,
    PlacementPreferenceEvaluation preference
)
```

## Constructor Details

 

### PlacementCandidateAssessment

  

```java
public PlacementCandidateAssessment(
    int candidateIndex,
    PlacementQuery query,
    PlacementDecision decision,
    PlacementPreferenceEvaluation preference
)
```

 

Creates an instance of a `PlacementCandidateAssessment` record class.

 

**Parameters:**

 

`candidateIndex` - the value for the `candidateIndex` record component

 

`query` - the value for the `query` record component

 

`decision` - the value for the `decision` record component

 

`preference` - the value for the `preference` record component

  

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

 

### candidateIndex

  

```java
public int candidateIndex()
```

 

Returns the value of the `candidateIndex` record component.

 

**Returns:**

 

the value of the `candidateIndex` record component

 

### query

  

```java
public PlacementQuery query()
```

 

Returns the value of the `query` record component.

 

**Returns:**

 

the value of the `query` record component

 

### decision

  

```java
public PlacementDecision decision()
```

 

Returns the value of the `decision` record component.

 

**Returns:**

 

the value of the `decision` record component

 

### preference

  

```java
public PlacementPreferenceEvaluation preference()
```

 

Returns the value of the `preference` record component.

 

**Returns:**

 

the value of the `preference` record component
