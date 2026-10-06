# StorageDataCodec

`dev.wakethewild.wildtrack.api.storage.StorageDataCodec`

```java
public interface StorageDataCodec<T>
```

 

Version-aware binary codec owned by the mod that defines a storage key.

## Method Details

 

### encode

  

```java
byte[] encode(T value)
```

 

### decode

  

```java
T decode(int storedVersion, byte[] encoded)
```
