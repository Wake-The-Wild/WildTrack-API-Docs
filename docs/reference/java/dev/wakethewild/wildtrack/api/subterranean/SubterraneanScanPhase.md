# SubterraneanScanPhase

`dev.wakethewild.wildtrack.api.subterranean.SubterraneanScanPhase`

**All Implemented Interfaces:**

 

`Serializable, Comparable<SubterraneanScanPhase>, Constable`

   

```java
public enum SubterraneanScanPhase
```

 

Lifecycle of authoritative below-surface data for one chunk revision.

## Enum Constant Details

 

### UNKNOWN

  

```java
public static final SubterraneanScanPhase UNKNOWN
```

 

The chunk has no retained profile or scheduled observation.

 

### QUEUED

  

```java
public static final SubterraneanScanPhase QUEUED
```

 

Observation is scheduled but has not captured a layer yet.

 

### CAPTURING

  

```java
public static final SubterraneanScanPhase CAPTURING
```

 

World data is being copied into a bounded immutable volume.

 

### ANALYZING

  

```java
public static final SubterraneanScanPhase ANALYZING
```

 

The immutable volume is complete and is being analyzed off-thread.

 

### AVAILABLE

  

```java
public static final SubterraneanScanPhase AVAILABLE
```

 

An authoritative profile is available through [`SubterraneanService.query(SubterraneanQuery)`](SubterraneanService.md).

  

## Method Details

 

### values

  

```java
public static SubterraneanScanPhase[] values()
```

 

Returns an array containing the constants of this enum class, in the order they are declared.

 

**Returns:**

 

an array containing the constants of this enum class, in the order they are declared

 

### valueOf

  

```java
public static SubterraneanScanPhase valueOf(String name)
```

 

Returns the enum constant of this class with the specified name. The string must match exactly an identifier used to declare an enum constant in this class. (Extraneous whitespace characters are not permitted.)

 

**Parameters:**

 

`name` - the name of the enum constant to be returned.

 

**Returns:**

 

the enum constant with the specified name

 

**Throws:**

 

`IllegalArgumentException` - if this enum class has no constant with the specified name

 

`NullPointerException` - if the argument is null
