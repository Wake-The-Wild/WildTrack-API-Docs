# StorageDataPayload

`dev.wakethewild.wildtrack.api.storage.StorageDataPayload`

```java
public final class StorageDataPayload extends Object
```

 

Immutable encoded value suitable for inclusion in a durable record.

## Constructor Details

 

### StorageDataPayload

  

```java
public StorageDataPayload(net.minecraft.resources.Identifier key, int version, byte[] bytes)
```

  

## Method Details

 

### key

  

```java
public net.minecraft.resources.Identifier key()
```

 

### version

  

```java
public int version()
```

 

### bytes

  

```java
public byte[] bytes()
```

 

### size

  

```java
public int size()
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
