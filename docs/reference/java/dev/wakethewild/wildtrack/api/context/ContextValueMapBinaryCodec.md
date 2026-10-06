# ContextValueMapBinaryCodec

`dev.wakethewild.wildtrack.api.context.ContextValueMapBinaryCodec`

```java
public final class ContextValueMapBinaryCodec extends Object
```

 

Deterministic versioned persistence boundary for registered extension context values.

## Method Details

 

### encode

  

```java
public static byte[] encode(ContextValueMap values)
```

 

### decode

  

```java
public static ContextValueMap decode(byte[] encoded, ContextKeyRegistry registry)
```
