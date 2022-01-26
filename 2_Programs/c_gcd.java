import java.util.Scanner;

public class c_gcd {
    
    static int gcd(int num1, int num2)
    {
    /* 
		until both numbers are not equal
		keep subtracting the smaller from the larger
	*/

        while(num1 != num2)				
        {
            if(num1 > num2)
                num1 -= num2;
    
            else
                num2 -= num1;
        }
    
    return num1;
    }
    public static void main(String[] args) {
        int num1, num2;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1 = read.nextInt();
        System.out.print("\nEnter number 2: ");
        num2 = read.nextInt();
        
        read.close();

        System.out.println("GCD of " + num1 + " & " + num2 + "is: " + gcd(num1, num2));
    }
}
