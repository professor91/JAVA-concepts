public class k_methods{
    
    //method overloading
// {
    //method with paramenters
    static void mymethod(String number, int num){
        System.out.println(number + " " + num + " method executed successfully.");
    }

    //method with "return" statement
    static int mymethod(int num){
        return num;
    }

// }

    public static void main(String[] args) {
        String num1 = "first";
        int num2 = 1;
        mymethod(num1, num2);

        System.out.println("The number that I received in the parameter is: " + mymethod(num2));
    }
}