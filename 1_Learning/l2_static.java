public class l2_static {
    
    // static variables
    static int a = 5;
    static int b;

    //static method
    static void method_1()
    {
        System.out.println("A static method can be called just like that, no object is required");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
    
    //non-static method
    public void method_2() 
    {
        System.out.println("To call a non-static method we need objects");
    }

    //non-static constructor
    public l2_static()
    {
        System.out.println("This is a non-static constructor of the class");
    }
    
    //constructor/destructor of a class cannot be static they are always non-static (either public, private or protected)

    // static block -   to perform operations to initialize static variables
    static {
        b= a + 5;
    }
    
    public static void main(String[] args) 
    {   
        //calling a static method
        method_1();
        
        //declaring an object of class "l1_class" to call a non-static method
        l2_static obj = new l2_static();
        obj.method_2();
    }
}