# ChunkAnalysisProvider

`dev.wakethewild.wildtrack.api.observation.ChunkAnalysisProvider`

```java
public interface ChunkAnalysisProvider
```

 

Extension point for loaded-chunk analysis. 

The callback can run on a worker thread. Implementations may access only the supplied immutable snapshot and output collector, must honor interruption, and must not load chunks or access a live level.

## Method Details

 

### id

  

```java
ProviderId id()
```

 

### profile

  

```java
AnalysisProfile profile()
```

 

### analyze

  

```java
void analyze(ChunkObservationSnapshot snapshot, ObservationOutput output)
```
