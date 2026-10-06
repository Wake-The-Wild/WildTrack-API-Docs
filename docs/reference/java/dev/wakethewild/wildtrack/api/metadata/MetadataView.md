# MetadataView

`dev.wakethewild.wildtrack.api.metadata.MetadataView`

**All Known Implementing Classes:**

 

`MetadataMap`

   

```java
public interface MetadataView
```

 

Immutable typed view of metadata attached to an API result.

## Method Details

 

### get

  

```java
<T> Optional<T> get(MetadataKey<T> key)
```

 

### keys

  

```java
Set<MetadataKey<?>> keys()
```
