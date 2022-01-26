import java.util.Scanner;

public class a_prime
{
    //check if number is prime
    static int check_prime(int n)
    {
        if(n%2 == 0)
            return 0;
        else 
            return 1;
    }

    //generate first n prime numbers
    static void generate_n_prime(int n)
    {
        int k = 0, i  = 3;
        System.out.print("\nPrime numbers: 2");
        while(k < n -1)                             //loop for number of prime numbers
        {
            if(check_prime(i) != 0)                  //if it's prime then print it
            {        
                System.out.print(", " + i);
                k++;
            }
            i++;                                    //else check for next
        }
    }

    //generate prime numbers upto n
        static void generate_prime_upto(int n)
        {
            int k = 3;
            System.out.print("\nPrime numbers: 2");      //2 is the first prime number
            
            while(k < n + 1)                             //loop to track of numbers list
            {
                if(check_prime(k) != 0)                  //if prime then print it
                {
                    System.out.print(", " + k);
                    k++;
                }
                else                                     //forget it and move on
                {
                    k++;
                }
            }
        }

    //generate n prime numbers starting from m
    static void generate_prime_from(int m, int n)
    {
        System.out.print("\nPrime numbers: ");
    if(m <= 2)
        System.out.print("2");                           //2 is the first prime number

    while(m < n + 1)                                    //loop for number of prime numbers
    {
        if(check_prime(m) != 0)                         //if prime then print it
        {
            System.out.print(", " + m);
            m++;
        }        
        else                                            //forget it and move                  
        {
            m++;
        }
    }
    }

    public static void main(String[] args) {
        int n, m;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = read.nextInt();
        System.out.print("\nEnter the value of m: ");
        m = read.nextInt();
        read.close();
        generate_n_prime(n);
        generate_prime_from(m, n);
        generate_prime_upto(n);
    }
}