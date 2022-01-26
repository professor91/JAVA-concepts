import java.util.Scanner;

public class b_factors_and_prime {

    static int check_prime(int n)
    {
        //loop for factors
        if(n == 2)							//2 is a prime factor
            return 1;
        for(int j = 2; j < n; j++)		
        {
            if(n % j == 0)          		//number is not prime
                return 0;
            else                    		//number is prime
                continue;
        }
    
    return 1;
    }	
    
    static void factors(int num)
    {
        System.out.print("\nFactors: 1, ");		//1 is a factor of every number
	
        //factors
        for(int i = 2; i < num; i++)				
        {	
            if(num % i == 0)
                System.out.print(i + ", ");		//printing factors
            else
                continue;
        }
        System.out.print(num);					//every number is a factor of itself
        
        System.out.print("\nPrime Facotrs: ");			
    
        //prime factors
        for(int i = 2; i < num; i++)		//loop for factors				
        {	
            if(num % i == 0)				//if i is a factor of num
                if(check_prime(i) == 0)		//check if it's prime by calling function_2 
                    continue;				//if not then go to next iteration
            else
                System.out.print(i + " ");				//else print it
        }
    
    }
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number: ");
        Scanner read = new Scanner(System.in);
        num = read.nextInt();
        read.close();
        factors(num);
    }
}
