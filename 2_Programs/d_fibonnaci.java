import java.util.Scanner;

public class d_fibonnaci {
    
    static void fibonnaci(int n)
    {
        int previous = 0, current = 1, result = 1;

        for(int i = 0; i < n; i++)          //loop for printing the series
        {
            System.out.print(result + " ");
            /*
                logic for Fibonacci series
                current_value = (n-1)th value + (n-2)th value
            */
            result = previous + current;    
            previous = current;
            current = result;
        }
    
    }
    public static void main(String[] args) {
        int n;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = read.nextInt();
        read.close();
        fibonnaci(n);
    }
}
