# LocationPublisher

`dev.wakethewild.wildtrack.api.provider.LocationPublisher`

```java
public interface LocationPublisher
```

 

Provider-scoped write capability. Calls are accepted only on the logical server thread unless a future method explicitly documents otherwise.

## Method Details

 

### provider

  

```java
ProviderId provider()
```

 

### upsert

  

```java
void upsert(LocationObservation observation)
```

 

### merge

  

```java
void merge(LocationObservation canonical, Set<LocationId> replacedIds)
```

 

Atomically publishes the merged canonical observation and retires the replaced locations as permanent aliases of its ID.

 

### remove

  

```java
boolean remove(LocationId id)
```

 

### invalidate

  

```java
void invalidate(LocationId id)
```
