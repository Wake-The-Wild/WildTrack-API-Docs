# LocationProviderRegistry

`dev.wakethewild.wildtrack.api.provider.LocationProviderRegistry`

```java
public interface LocationProviderRegistry
```

 

Startup-time registration for provider-scoped publishers.

## Method Details

 

### register

  

```java
LocationPublisher register(ProviderDescriptor descriptor)
```

 

Fails when the provider ID is already registered.

 

### registerCoverageObserver

  

```java
default void registerCoverageObserver(ProviderId provider, LocationCoverageObserver observer)
```

 

Optional source observer for a registered provider; one observer per provider.
