# ContextKeyRegistry

`dev.wakethewild.wildtrack.api.context.ContextKeyRegistry`

```java
public interface ContextKeyRegistry
```

 

Registry and bounded codec access for typed extension context values.

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
<T> ContextKeyRegistration register(ContextKey<T> key, ContextCodec<T> codec, int maximumEncodedBytes)
```

 

### find

  

```java
Optional<ContextKeyRegistration> find(net.minecraft.resources.Identifier id)
```

 

### registrations

  

```java
List<ContextKeyRegistration> registrations()
```

 

### encode

  

```java
<T> byte[] encode(ContextKey<T> key, T value)
```

 

### decode

  

```java
<T> T decode(ContextKey<T> key, byte[] encoded)
```
