## Builder Design Pattern

### Problem solved: 
Telescoping constructor anti-pattern

### HOW?

Using a builder class to support complex class object creation

#### STEP 1: Create your complex class
Skip the constructor for now
```java
class A {
    private String var1;
    private String var2;
}
```
#### STEP 2: Create a builder class. 
Replicate all properties of the main complex class
```java
class ABuilder{
    private String var1;
    private String var2;
}
```
#### Step 3: Write constructor in the main class
Create a constructor in the main class to initialize all variables. 
Use Builder class - 'ABuilder' in the argument which will be our only argument.
```java
class A {
    private String var1;
    private String var2;
    
    public A(ABuilder builder){
        this.var1 = builder.getVar1();
        this.var2 = builder.getVar2();
    }
}
```
#### Step 4: Write setter methods in the builder class
Now write setter methods to set the variables & return Builder Class object
For example:
```java
public ABuilder withVar1(String var1){
    this.var1 = var1;
    return this;
}
```
Now our Builder class looks like:
```java
class ABuilder{
    private String var1;
    private String var2;
    
    public ABuilder withVar1(String var1){
        this.var1 = var1;
        return this;
    }
    public ABuilder withVar2(String var2){
        this.var2 = var2;
        return this;
    }
}
```
#### Step 5: Write build method in the Builder class
This method will return our main class object. In this case: 'class A' object

```java
class ABuilder{
    private String var1;
    private String var2;

    public ABuilder withVar1(String var1){
        this.var1 = var1;
        return this;
    }
    public ABuilder withVar2(String var2){
        this.var2 = var2;
        return this;
    }
    public A build(){
        return new A(this);
    }
}
```

#### Our design is complete now. Now let's see the usage example:

```java
class Main{
    void test(){
        A mumbai = new ABuilder()
                        .withVar1("abc")
                        .withVar2("def");
        
        System.out.println("Mumbai var1 = "+mumbai.getVar1());
    }
}
```


