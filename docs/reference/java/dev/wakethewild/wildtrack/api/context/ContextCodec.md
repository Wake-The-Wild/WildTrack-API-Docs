# ContextCodec

`dev.wakethewild.wildtrack.api.context.ContextCodec`

```java
public interface ContextCodec<T>
```

 

Bounded binary codec supplied by the owner of a context key.

## Method Details

 

### encode

  

```java
byte[] encode(T value)
```

 

### decode

  

```java
T decode(byte[] encoded)
```
