# Interface Segregation

## Violation of ISP

Classes that depend on interfaces should not be forced to implement methods they do not need.

```java
// Interface for worker
interface Worker {
    void work();
    void eat();
}

// Class for Robot worker
class Robot implements Worker {
    public void work() {
        // Robots can work
        System.out.println("Robot is working");
    }

    public void eat() {
        // Robots cannot eat, but this method is required by Worker interface
        System.out.println("Robot cannot eat");
    }
}

// Class for Human worker
class Human implements Worker {
    public void work() {
        // Humans can work
        System.out.println("Human is working");
    }

    public void eat() {
        // Humans can eat
        System.out.println("Human is eating");
    }
}
```


## Following ISP

```java
// Interface for worker
interface Worker {
    void work();
}

// Interface for worker that can eat
interface Eater {
    void eat();
}

// Class for Robot worker
class Robot implements Worker {
    public void work() {
        // Robots can work
        System.out.println("Robot is working");
    }
}

// Class for Human worker
class Human implements Worker, Eater {
    public void work() {
        // Humans can work
        System.out.println("Human is working");
    }

    public void eat() {
        // Humans can eat
        System.out.println("Human is eating");
    }
}
```