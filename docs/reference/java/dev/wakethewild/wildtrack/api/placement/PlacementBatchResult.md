# PlacementBatchResult

`dev.wakethewild.wildtrack.api.placement.PlacementBatchResult`

```java
public record PlacementBatchResult(int totalCandidates, List<PlacementCandidateEvaluation> evaluations)
```

 

Bounded, deterministic result for evaluating a sequence of placement candidates.

## Field Details

 

### MAXIMUM_EVALUATIONS

  

```java
public static final int MAXIMUM_EVALUATIONS
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

  

## Constructor Details

 

### PlacementBatchResult

  

```java
public PlacementBatchResult(int totalCandidates, List<PlacementCandidateEvaluation> evaluations)
```

 

Creates an instance of a `PlacementBatchResult` record class.

 

**Parameters:**

 

`totalCandidates` - the value for the `totalCandidates` record component

 

`evaluations` - the value for the `evaluations` record component

  

## Method Details

 

### evaluatedCandidates

  

```java
public int evaluatedCandidates()
```

 

### remainingCandidates

  

```java
public int remainingCandidates()
```

 

### complete

  

```java
public boolean complete()
```

 

### count

  

```java
public long count(ConditionVerdict verdict)
```

 

### passing

  

```java
public List<PlacementCandidateEvaluation> passing()
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

 

### evaluations

  

```java
public List<PlacementCandidateEvaluation> evaluations()
```

 

Returns the value of the `evaluations` record component.

 

**Returns:**

 

the value of the `evaluations` record component
