// outer class
class outer{
    int a= 6;

    // inner class or nested class
    class inner{
        int j = 4;
    }
}

public class l3_inner_class {
    public static void main(String[] args) {
        
        outer obj1= new outer();
        // declaring inner class object
        outer.inner obj2= obj1.new inner();

        System.out.println(obj2.j);
    }
}
