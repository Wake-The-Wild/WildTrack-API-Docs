# SparseBoundaryOpening

`dev.wakethewild.wildtrack.api.subterranean.SparseBoundaryOpening`

```java
public final class SparseBoundaryOpening extends Object
```

 

Sparse cells where one local void component reaches a horizontal chunk face.

## Constructor Details

 

### SparseBoundaryOpening

  

```java
public SparseBoundaryOpening(int minimumY, int maximumYExclusive, int[] cells)
```

  

## Method Details

 

### empty

  

```java
public static SparseBoundaryOpening empty(int minimumY, int maximumYExclusive)
```

 

### minimumY

  

```java
public int minimumY()
```

 

### maximumYExclusive

  

```java
public int maximumYExclusive()
```

 

### cells

  

```java
public int[] cells()
```

 

### size

  

```java
public int size()
```

 

### overlapCount

  

```java
public int overlapCount(SparseBoundaryOpening adjacent)
```

 

### equals

  

```java
public boolean equals(Object other)
```

 

**Overrides:**

 

`equals` in class `Object`

 

### hashCode

  

```java
public int hashCode()
```

 

**Overrides:**

 

`hashCode` in class `Object`
