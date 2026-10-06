# StorageDataRegistry

`dev.wakethewild.wildtrack.api.storage.StorageDataRegistry`

```java
public interface StorageDataRegistry
```

 

Registry and bounded codec boundary for durable third-party data.

## Field Details

 

### MAXIMUM_ENCODED_BYTES

  

```java
static final int MAXIMUM_ENCODED_BYTES
```

 

**See Also:**

 

- [Constant values](../../../../../../constants.md)

  

## Method Details

 

### register

  

```java
<T> StorageDataRegistration register(
    StorageDataKey<T> key,
    int currentVersion,
    StorageDataCodec<T> codec,
    int maximumEncodedBytes
)
```

 

### find

  

```java
Optional<StorageDataRegistration> find(net.minecraft.resources.Identifier id)
```

 

### registrations

  

```java
List<StorageDataRegistration> registrations()
```

 

### encode

  

```java
<T> StorageDataPayload encode(StorageDataKey<T> key, T value)
```

 

### decode

  

```java
<T> T decode(StorageDataKey<T> key, StorageDataPayload payload)
```
