# PlacementService

`dev.wakethewild.wildtrack.api.placement.PlacementService`

```java
public interface PlacementService
```

 

Read-only placement facade over already-known WildTrack snapshots.

## Method Details

 

### query

  

```java
PlacementContext query(PlacementQuery query)
```

 

### evaluate

  

```java
default ConditionEvaluation evaluate(PlacementQuery query, Condition<PlacementContext> condition)
```

 

### decide

  

```java
default PlacementDecision decide(
    PlacementQuery query,
    Condition<PlacementContext> condition,
    UnknownPlacementPolicy unknownPolicy
)
```

 

### evaluateBatch

  

```java
default PlacementBatchResult evaluateBatch(
    List<PlacementQuery> candidates,
    Condition<PlacementContext> condition,
    int maximumEvaluations
)
```

 

Evaluates candidates in input order without exceeding the caller's work budget.

 

### assessBatch

  

```java
default PlacementAssessmentBatch assessBatch(
    List<PlacementQuery> candidates,
    Condition<PlacementContext> condition,
    PlacementPreference preference,
    UnknownPlacementPolicy unknownPolicy,
    int maximumEvaluations
)
```

 

Evaluates hard requirements and soft preferences once per candidate within a fixed budget.

 

### assessBatch

  

```java
default PlacementAssessmentBatch assessBatch(
    List<PlacementQuery> candidates,
    PlacementRule rule,
    int maximumEvaluations
)
```
