public class l_class {
    //static method
    static void method_1()
    {
        System.out.println("A static method can be called just like that, no object is required");
    }
    
    //non-static method
    public void method_2() 
    {
        System.out.println("To call a non-static method we need objects");
    }

    //non-static constructor
    public l_class()
    {
        System.out.println("This is a non-static constructor of the class");
    }
    //constructor/destructor of a class cannot be static they are always non-static (either public, private or protected)

    public static void main(String[] args) 
    {   
        //calling a static method
        method_1();
        
        //declaring an object of class "class_10" to call a non-static method
        l_class obj = new l_class();
        obj.method_2();
    }
}

//Access Modifiers

//For classes               - public / (default - only access by classes of the same package)
//For attributes / methods  - public / private / protected / default

//Non-Access Modifiers

//For classes
    //final     -   these classes cannot be inherited
    //abstract  -   these classes can only be inherited, cannot create objects of these classes

//For attributes / methods
    //final	        -   cannot be overridden/modified   (works like const)
    //static	    -   no need of object to call these methods
    //abstract	    -   (abstract class method only) abstract methods are like virtual functions
    //transient	    -  Attributes and methods are skipped when serializing the object containing them
    //synchronized	-  Methods can only be accessed by one thread at a time
    //volatile      -   (attribute only) value of these attributes is not cached thread-locally





    //we have two classes and both have static method with same name- then how we call them