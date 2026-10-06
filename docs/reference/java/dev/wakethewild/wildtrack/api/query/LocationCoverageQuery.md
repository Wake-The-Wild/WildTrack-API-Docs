# LocationCoverageQuery

`dev.wakethewild.wildtrack.api.query.LocationCoverageQuery`

```java
public record LocationCoverageQuery(
    ProviderId provider,
    int minChunkX,
    int minChunkZ,
    int maxChunkX,
    int maxChunkZ,
    int chunkBudget,
    int referenceBudget
)
```

 

Requests current source coverage for an inclusive rectangle of chunk columns.

## Constructor Details

 

### LocationCoverageQuery

  

```java
public LocationCoverageQuery(
    ProviderId provider,
    int minChunkX,
    int minChunkZ,
    int maxChunkX,
    int maxChunkZ,
    int chunkBudget,
    int referenceBudget
)
```

 

Creates an instance of a `LocationCoverageQuery` record class.

 

**Parameters:**

 

`provider` - the value for the `provider` record component

 

`minChunkX` - the value for the `minChunkX` record component

 

`minChunkZ` - the value for the `minChunkZ` record component

 

`maxChunkX` - the value for the `maxChunkX` record component

 

`maxChunkZ` - the value for the `maxChunkZ` record component

 

`chunkBudget` - the value for the `chunkBudget` record component

 

`referenceBudget` - the value for the `referenceBudget` record component

  

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

 

### provider

  

```java
public ProviderId provider()
```

 

Returns the value of the `provider` record component.

 

**Returns:**

 

the value of the `provider` record component

 

### minChunkX

  

```java
public int minChunkX()
```

 

Returns the value of the `minChunkX` record component.

 

**Returns:**

 

the value of the `minChunkX` record component

 

### minChunkZ

  

```java
public int minChunkZ()
```

 

Returns the value of the `minChunkZ` record component.

 

**Returns:**

 

the value of the `minChunkZ` record component

 

### maxChunkX

  

```java
public int maxChunkX()
```

 

Returns the value of the `maxChunkX` record component.

 

**Returns:**

 

the value of the `maxChunkX` record component

 

### maxChunkZ

  

```java
public int maxChunkZ()
```

 

Returns the value of the `maxChunkZ` record component.

 

**Returns:**

 

the value of the `maxChunkZ` record component

 

### chunkBudget

  

```java
public int chunkBudget()
```

 

Returns the value of the `chunkBudget` record component.

 

**Returns:**

 

the value of the `chunkBudget` record component

 

### referenceBudget

  

```java
public int referenceBudget()
```

 

Returns the value of the `referenceBudget` record component.

 

**Returns:**

 

the value of the `referenceBudget` record component
