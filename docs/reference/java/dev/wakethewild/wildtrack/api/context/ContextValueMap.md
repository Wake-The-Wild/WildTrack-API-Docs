# ContextValueMap

`dev.wakethewild.wildtrack.api.context.ContextValueMap`

```java
public final class ContextValueMap extends Object
```

 

Immutable encoded extension values decoded only through their registered typed keys.

## Field Details

 

### MAXIMUM_ENTRIES

  

```java
public static final int MAXIMUM_ENTRIES
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

 

### MAXIMUM_TOTAL_BYTES

  

```java
public static final int MAXIMUM_TOTAL_BYTES
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

  

## Method Details

 

### empty

  

```java
public static ContextValueMap empty()
```

 

### builder

  

```java
public static ContextValueMap.Builder builder(ContextKeyRegistry registry)
```

 

### size

  

```java
public int size()
```

 

### totalEncodedBytes

  

```java
public int totalEncodedBytes()
```

 

### contains

  

```java
public boolean contains(ContextKey<?> key)
```

 

### get

  

```java
public <T> Optional<T> get(ContextKey<T> key, ContextKeyRegistry registry)
```

 

### encoded

  

```java
public Optional<byte[]> encoded(net.minecraft.resources.Identifier id)
```

 

### encodedEntries

  

```java
public Map<net.minecraft.resources.Identifier, byte[]> encodedEntries()
```
