# ObservationOutput

`dev.wakethewild.wildtrack.api.observation.ObservationOutput`

```java
public interface ObservationOutput
```

 

Worker-safe collector scoped to the provider currently being analyzed.

## Method Details

 

### publish

  

```java
void publish(LocationObservation observation)
```

 

### invalidate

  

```java
void invalidate(LocationId id)
```
