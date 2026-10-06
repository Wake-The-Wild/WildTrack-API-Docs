# DiscoveryPolicyRegistry

`dev.wakethewild.wildtrack.api.discovery.DiscoveryPolicyRegistry`

```java
public interface DiscoveryPolicyRegistry
```

## Method Details

 

### register

  

```java
void register(DiscoveryPolicy policy)
```

 

### unregister

  

```java
boolean unregister(net.minecraft.resources.Identifier id)
```

 

### find

  

```java
Optional<DiscoveryPolicy> find(net.minecraft.resources.Identifier id)
```

 

### policies

  

```java
List<DiscoveryPolicy> policies()
```
