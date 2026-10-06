# EnvironmentRegionStats

`dev.wakethewild.wildtrack.api.classification.EnvironmentRegionStats`

```java
public record EnvironmentRegionStats(int observations, int regions, int dirtyGroups)
```

## Constructor Details

 

### EnvironmentRegionStats

  

```java
public EnvironmentRegionStats(int observations, int regions, int dirtyGroups)
```

 

Creates an instance of a `EnvironmentRegionStats` record class.

 

**Parameters:**

 

`observations` - the value for the `observations` record component

 

`regions` - the value for the `regions` record component

 

`dirtyGroups` - the value for the `dirtyGroups` record component

  

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

 

### observations

  

```java
public int observations()
```

 

Returns the value of the `observations` record component.

 

**Returns:**

 

the value of the `observations` record component

 

### regions

  

```java
public int regions()
```

 

Returns the value of the `regions` record component.

 

**Returns:**

 

the value of the `regions` record component

 

### dirtyGroups

  

```java
public int dirtyGroups()
```

 

Returns the value of the `dirtyGroups` record component.

 

**Returns:**

 

the value of the `dirtyGroups` record component
