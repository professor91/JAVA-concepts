// an abstract class with abstract method
abstract class A{
    // cannot have variables of abstract type
    abstract void show();
}

// a public class   -   extending abstract class A
class B extends A{
    // const variable
    final int a = 6;
    private int b = 1;
    protected int c = 2;

    // constructor
    B(){
        System.out.println("In constructor of class B");
    }

    void show(){
        System.out.println("This is an abstract method");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    final void func(){
        System.out.println("In final function");
    }
}

//a public class    -   extending class B
class C extends B{
    // constructor
    C(){
        System.out.println("In constructor of class C");
    }

    // b is not inherited as it is private
    void print(){
        System.out.println("a: " + a);
        System.out.println("c: " + c);        
    }

    //cannot override final function 
    // void func(){
    // }
}


public class l1_class {

    public static void main(String[] args) {
        // abstract classes cannot have instances
        // A objA = new A();
        
        B objB = new B();
        objB.show();
        
        System.out.println("Value a: " + objB.a);
        System.out.println("Value c: " + objB.c);
        
        C objC = new C();

        objC.print();
    }
}

//Access Modifiers

//For classes               - public / (default - only access by classes of the same package)
//For attributes / methods  - public / private / protected / default

//By default the access specifier of a class is "private"

//Non-Access Modifiers

//For classes
    //final     -   these classes cannot be inherited
    //abstract  -   these classes can only be inherited, cannot create objects of these classes

//For attributes / methods
    //final	        -   cannot be overridden/modified   (works like const)
    //static	    -   no need of object to call these methods
    //abstract	    -   (abstract class only) abstract methods are like virtual functions

    //transient	    -  Attributes and methods are skipped when serializing the object containing them
    //synchronized	-  Methods can only be accessed by one thread at a time
    //volatile      -  (attribute only) value of these attributes is not cached thread-locally
