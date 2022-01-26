public class k2_variable_length_args {
    
    // '...' tells compiler about variable arguments
    public static void method(int ...v){
        System.out.println("Number of args: " + v.length);

        for(int i : v){
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        method(2,3,8);
    }
}
