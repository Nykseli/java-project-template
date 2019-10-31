# Java Project Template Example

## Running the projects

Unix
```
./run.sh
```

## Adding new class

All the classes needs to be under src/main/java

### Adding class directly under src/main/java

```java
// UnderJava.java

// Note package name
package main.java;

public class UnderJava {
    public void printer() {
        System.out.println("Just printing");
    }
}
```

### Adding class under src/main/java/epackage

```java
// UnderEpackage.java

// Note package name
package main.java.epackage;

public class UnderEpackage {
    public void printer() {
        System.out.println("Just printing");
    }
}
```

### Adding class under new sub directory

Create file
```bash
mkdir src/main/java/newdir
```
Add code
```java
// UnderNewDir.java

// Note package name
package main.java.newdir;

public class UnderNewDir {
    public void printer() {
        System.out.println("Just printing");
    }
}
```
