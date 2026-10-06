# MetadataMap

`dev.wakethewild.wildtrack.api.metadata.MetadataMap`

**All Implemented Interfaces:**

 

`MetadataView`

   

```java
public final class MetadataMap extends Object implements MetadataView
```

 

Immutable in-memory implementation of [`MetadataView`](MetadataView.md).

## Method Details

 

### empty

  

```java
public static MetadataMap empty()
```

 

### builder

  

```java
public static MetadataMap.Builder builder()
```

 

### get

  

```java
public <T> Optional<T> get(MetadataKey<T> key)
```

 

**Specified by:**

 

`get` in interface `MetadataView`

 

### keys

  

```java
public Set<MetadataKey<?>> keys()
```

 

**Specified by:**

 

`keys` in interface `MetadataView`
