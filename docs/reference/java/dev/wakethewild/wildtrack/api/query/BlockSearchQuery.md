# BlockSearchQuery

`dev.wakethewild.wildtrack.api.query.BlockSearchQuery`

```java
public record BlockSearchQuery(
    net.minecraft.core.BlockPos minimum,
    net.minecraft.core.BlockPos maximum,
    int candidateBudget,
    int readBudget,
    BlockPattern pattern
)
```

 

Inclusive block bounds. First-match ordering is Y, then X, then Z, each ascending.

## Constructor Details

 

### BlockSearchQuery

  

```java
public BlockSearchQuery(
    net.minecraft.core.BlockPos minimum,
    net.minecraft.core.BlockPos maximum,
    int candidateBudget,
    int readBudget,
    BlockPattern pattern
)
```

 

Creates an instance of a `BlockSearchQuery` record class.

 

**Parameters:**

 

`minimum` - the value for the `minimum` record component

 

`maximum` - the value for the `maximum` record component

 

`candidateBudget` - the value for the `candidateBudget` record component

 

`readBudget` - the value for the `readBudget` record component

 

`pattern` - the value for the `pattern` record component

  

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

 

### minimum

  

```java
public net.minecraft.core.BlockPos minimum()
```

 

Returns the value of the `minimum` record component.

 

**Returns:**

 

the value of the `minimum` record component

 

### maximum

  

```java
public net.minecraft.core.BlockPos maximum()
```

 

Returns the value of the `maximum` record component.

 

**Returns:**

 

the value of the `maximum` record component

 

### candidateBudget

  

```java
public int candidateBudget()
```

 

Returns the value of the `candidateBudget` record component.

 

**Returns:**

 

the value of the `candidateBudget` record component

 

### readBudget

  

```java
public int readBudget()
```

 

Returns the value of the `readBudget` record component.

 

**Returns:**

 

the value of the `readBudget` record component

 

### pattern

  

```java
public BlockPattern pattern()
```

 

Returns the value of the `pattern` record component.

 

**Returns:**

 

the value of the `pattern` record component
