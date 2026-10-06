# RuntimeObservationService

`dev.wakethewild.wildtrack.api.runtime.RuntimeObservationService`

```java
public interface RuntimeObservationService
```

 

Controls temporary analysis coverage without loading or generating chunks.

## Method Details

 

### limits

  

```java
RuntimeObservationLimits limits()
```

 

### request

  

```java
RuntimeObservationLease request(RuntimeObservationDemand demand)
```

 

### renew

  

```java
Optional<RuntimeObservationLease> renew(UUID leaseId, int durationTicks)
```

 

### lease

  

```java
Optional<RuntimeObservationLease> lease(UUID leaseId)
```

 

### cancel

  

```java
boolean cancel(UUID leaseId)
```
