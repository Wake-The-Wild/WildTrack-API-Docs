# WildTrackApi

`dev.wakethewild.wildtrack.api.WildTrackApi`

```java
public interface WildTrackApi
```

 

Public entry point for WildTrack services.

## Field Details

 

### OBJECT_SHARE_KEY

  

```java
static final String OBJECT_SHARE_KEY
```

 

**See Also:**

 

- [Constant values](../../../../../constants.md)

  

## Method Details

 

### blockSearch

  

```java
default BlockSearchService blockSearch()
```

 

Cached block pattern searches; consumers supply their own recognition rules.

 

### get

  

```java
static WildTrackApi get()
```

 

### locations

  

```java
LocationService locations()
```

 

### providers

  

```java
LocationProviderRegistry providers()
```

 

### analyzers

  

```java
ChunkAnalysisRegistry analyzers()
```

 

### terrain

  

```java
TerrainService terrain()
```

 

### environment

  

```java
EnvironmentService environment()
```

 

### surface

  

```java
SurfaceService surface()
```

 

### placement

  

```java
PlacementService placement()
```

 

### placementRules

  

```java
PlacementRuleRegistry placementRules()
```

 

### placementConditionDefinitions

  

```java
PlacementConditionDefinitionRegistry placementConditionDefinitions()
```

 

### classifications

  

```java
EnvironmentClassificationService classifications()
```

 

### environmentClassifiers

  

```java
EnvironmentClassifierRegistry environmentClassifiers()
```

 

### environmentRegions

  

```java
EnvironmentRegionService environmentRegions()
```

 

### watercourses

  

```java
WatercourseService watercourses()
```

 

### subterranean

  

```java
SubterraneanService subterranean()
```

 

### runtimeObservations

  

```java
RuntimeObservationService runtimeObservations()
```

 

### contextKeys

  

```java
ContextKeyRegistry contextKeys()
```

 

### placementContextContributors

  

```java
PlacementContextContributorRegistry placementContextContributors()
```

 

### worldgen

  

```java
WorldgenService worldgen()
```

 

### discoveries

  

```java
DiscoveryService discoveries()
```

 

### discoveryPolicies

  

```java
DiscoveryPolicyRegistry discoveryPolicies()
```

 

### storageData

  

```java
StorageDataRegistry storageData()
```
