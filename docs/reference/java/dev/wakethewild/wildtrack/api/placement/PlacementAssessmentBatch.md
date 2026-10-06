# PlacementAssessmentBatch

`dev.wakethewild.wildtrack.api.placement.PlacementAssessmentBatch`

```java
public record PlacementAssessmentBatch(int totalCandidates, List<PlacementCandidateAssessment> assessments)
```

 

Bounded assessments with stable score ranking for accepted candidates.

## Constructor Details

 

### PlacementAssessmentBatch

  

```java
public PlacementAssessmentBatch(int totalCandidates, List<PlacementCandidateAssessment> assessments)
```

 

Creates an instance of a `PlacementAssessmentBatch` record class.

 

**Parameters:**

 

`totalCandidates` - the value for the `totalCandidates` record component

 

`assessments` - the value for the `assessments` record component

  

## Method Details

 

### complete

  

```java
public boolean complete()
```

 

### remainingCandidates

  

```java
public int remainingCandidates()
```

 

### acceptedByScore

  

```java
public List<PlacementCandidateAssessment> acceptedByScore()
```

 

### deferred

  

```java
public List<PlacementCandidateAssessment> deferred()
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

 

### totalCandidates

  

```java
public int totalCandidates()
```

 

Returns the value of the `totalCandidates` record component.

 

**Returns:**

 

the value of the `totalCandidates` record component

 

### assessments

  

```java
public List<PlacementCandidateAssessment> assessments()
```

 

Returns the value of the `assessments` record component.

 

**Returns:**

 

the value of the `assessments` record component
