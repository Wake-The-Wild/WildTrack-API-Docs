# AnalysisSchedulerStats

`dev.wakethewild.wildtrack.api.observation.AnalysisSchedulerStats`

```java
public record AnalysisSchedulerStats(
    int queued,
    int running,
    int completedAwaitingPublication,
    long dropped,
    long stale,
    long failed,
    long published
)
```

## Constructor Details

 

### AnalysisSchedulerStats

  

```java
public AnalysisSchedulerStats(
    int queued,
    int running,
    int completedAwaitingPublication,
    long dropped,
    long stale,
    long failed,
    long published
)
```

 

Creates an instance of a `AnalysisSchedulerStats` record class.

 

**Parameters:**

 

`queued` - the value for the `queued` record component

 

`running` - the value for the `running` record component

 

`completedAwaitingPublication` - the value for the `completedAwaitingPublication` record component

 

`dropped` - the value for the `dropped` record component

 

`stale` - the value for the `stale` record component

 

`failed` - the value for the `failed` record component

 

`published` - the value for the `published` record component

  

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

 

Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with the `compare` method from their corresponding wrapper classes.

 

**Specified by:**

 

`equals` in class `Record`

 

**Parameters:**

 

`o` - the object with which to compare

 

**Returns:**

 

`true` if this object is the same as the `o` argument; `false` otherwise.

 

### queued

  

```java
public int queued()
```

 

Returns the value of the `queued` record component.

 

**Returns:**

 

the value of the `queued` record component

 

### running

  

```java
public int running()
```

 

Returns the value of the `running` record component.

 

**Returns:**

 

the value of the `running` record component

 

### completedAwaitingPublication

  

```java
public int completedAwaitingPublication()
```

 

Returns the value of the `completedAwaitingPublication` record component.

 

**Returns:**

 

the value of the `completedAwaitingPublication` record component

 

### dropped

  

```java
public long dropped()
```

 

Returns the value of the `dropped` record component.

 

**Returns:**

 

the value of the `dropped` record component

 

### stale

  

```java
public long stale()
```

 

Returns the value of the `stale` record component.

 

**Returns:**

 

the value of the `stale` record component

 

### failed

  

```java
public long failed()
```

 

Returns the value of the `failed` record component.

 

**Returns:**

 

the value of the `failed` record component

 

### published

  

```java
public long published()
```

 

Returns the value of the `published` record component.

 

**Returns:**

 

the value of the `published` record component
