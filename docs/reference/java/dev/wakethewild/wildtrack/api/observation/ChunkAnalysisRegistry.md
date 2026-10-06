# ChunkAnalysisRegistry

`dev.wakethewild.wildtrack.api.observation.ChunkAnalysisRegistry`

```java
public interface ChunkAnalysisRegistry
```

 

Startup-time registration for loaded-chunk analyzers.

## Method Details

 

### register

  

```java
LocationPublisher register(ProviderDescriptor descriptor, ChunkAnalysisProvider analyzer)
```

 

Atomically registers provider ownership and its analyzer.

 

### stats

  

```java
AnalysisSchedulerStats stats()
```
