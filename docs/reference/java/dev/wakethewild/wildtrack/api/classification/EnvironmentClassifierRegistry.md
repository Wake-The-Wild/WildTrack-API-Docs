# EnvironmentClassifierRegistry

`dev.wakethewild.wildtrack.api.classification.EnvironmentClassifierRegistry`

```java
public interface EnvironmentClassifierRegistry
```

 

Bounded namespaced extension point for semantic environment classifiers.

## Method Details

 

### register

  

```java
void register(EnvironmentClassifier classifier)
```

 

### find

  

```java
Optional<EnvironmentClassifier> find(net.minecraft.resources.Identifier id)
```

 

### classifiers

  

```java
List<EnvironmentClassifier> classifiers()
```

 

### unregister

  

```java
boolean unregister(EnvironmentClassifier classifier)
```

 

### size

  

```java
int size()
```

 

### capacity

  

```java
int capacity()
```
