//test

import java.util.Scanner;

public class g_patterns {
    
    //1 star pyramid
    static void pyramid(int n)
    {
        for(int i = 1; i < n + 1; i++)				//loop for rows
        {
            for(int j = 0; j < n - i; j++)			//loop for space	
            {
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i - 1; k++)		//loop for *
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    
    }
    //2 star pyramid left
    static void left_triangle(int n)
    {
        int i,j;    

        for(i = 0; i < n; i++)          //loop for the rows
        {
            for(j = 0; j < i + 1; j++)  //loop for the columns
                System.out.print("*");               //printing the '*'
            System.out.print("\n");        
        }    
    }
    //3 star pyramid right
    static void right_triangle(int n)
    {    
        for(int i = 0; i < n ; i++)             //loop for the rows
        {
            for(int j = n - i; j >= 0; j--)     //loop for the columns
                System.out.print(" ");          //printing gap
            for(int k = 0; k <= i; k++)
                System.out.print("*");          //printing '*'
            System.out.print("\n");        
        }
    }
    //4 star diamond
    static void diamond(int n)
    {    
        for(int i = 1; i < n + 1; i++)			//loop for rows
        {
            int mid = (n/2) + 1;
            
            if(i < mid + 1)							//printing till mid
            {
                for(int j = 0; j < n - i; j++)			//loop for space	
                {
                    System.out.print(" ");
                }
                for(int k = 0; k < 2*i - 1; k++)		//loop for upper * pattern
                {
                    System.out.print("*");
                }
            }
            else									//printing rest pattern till last
            {
                for(int j = 0; j < i - 1; j++)				//loop for space	
                {
                    System.out.print(" ");
                }
                for(int k = 0; k < 2*(n - i) + 1 ; k++)		//loop for lower * pattern
                    System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    //5 number pyramid
    static void num_pyramid(int n)
    {	
        for(int i = 1; i <= n; i++)			//loop for rows
        {	
            for(int j = 1; j <= n - i; j++)		//loop for space	
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++)			//loop for printing left half of the pattern
            {
                System.out.print(k);
            }
            for(int m = i - 1; m >= 1; m--)		//loop for printing right half of the pattern
            {
                System.out.print(m);
            }
    
            System.out.print("\n");
        }
    }
    //6 picaso triangle
    static void picaso(int n)
    {    
        int coef = 1;
	
        for (int i = 0; i < n; i++)
        {
            for(int k = 1; k <= n - i - 1; k++)
                System.out.print(" ");
            
            for (int j = 0; j <= i; j++)
            {
                if (j==0 || i==0)
                    coef = 1;
            
                else
                    coef = (coef*(i-j+1))/j;
                
                System.out.print(" " + coef);
            }
            System.out.print("\n");
        }
    }
    //7 alphabet pattern
    static void alpha_pattern(char ch)
    {
        int med, n, n1, n2;
    
        ch = Character.toUpperCase(ch);
        n = (int)ch;
        med = (65 + n)/2;
        
        n1 = med;
        n2 = med + 1;
        
        for (int i = 0; i < (n-med) + 1; i++)
        {
            for(int j = 65; j <= n1 - i; j++)
                System.out.print((char)j);
                
            for(int k = 1; k <= 2*i-1; k++)
                System.out.print(" ");
        
            for (int l = n2+i; l<=n; l++)
            {
                System.out.print((char)l);
                n2 = med;
            }
            System.out.print("\n");
        }    
    }
    
    
    public static void main(String[] args) {
        char ch;
        int rows, choice;
        System.out.print("\n1. Pyramid\n2. Left Triangle\n3. Right Triangle\n4. Diamond\n5. Number Pyramid\n6. Picasso Triangle\n7. Alphabet Pattern");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        choice = read.nextInt();


        switch(choice)
        {
            case 1  :   System.out.print("\nEnter the number of rows: ");
                        rows = read.nextInt();
                        pyramid(rows);              //calling function_1
                        break;
            
            case 2  :   System.out.print("\nEnter the number of rows: ");
                        rows = read.nextInt();
                        left_triangle(rows);        //calling function_2
                        break;
            
            case 3  :   System.out.print("\nEnter the number of rows: ");
                        rows = read.nextInt();
                        right_triangle(rows);        //calling function_3
                        break;

            case 4  :   System.out.print("\nEnter the number of rows: ");
                        rows = read.nextInt();
                        if(rows%2 == 0)
                        {
                            System.out.print("\nRow should be positive odd number more than one.");
                            System.out.print("\nEnter the number of rows: ");
                            rows = read.nextInt();
                        }
                        diamond(rows);        //calling function_4
                        break;

            case 5  :   System.out.print("\nEnter the number of rows: ");
                        rows = read.nextInt();
                        num_pyramid(rows);    //calling function_5
                        break;

            case 6  :   System.out.print("\nEnter the number of rows: ");
                        rows = read.nextInt();
                        if(rows%2 == 0)
                        {
                            System.out.print("\nRow should be positive odd number more than one.");
                            System.out.print("\nEnter the number of rows: ");
                            rows = read.nextInt();
                        }
                        picaso(rows);
                        break;

            case 7  :   System.out.print("\nEnter the character: ");
                        ch = read.next().charAt(0);
                        if(Character.toUpperCase(ch) % 2 == 0)
                        {
                            System.out.print("\nCharacter should be the one which comes at odd position.");
                            System.out.print("\nEnter the character: ");
                            ch = read.next().charAt(0);           
                        }
                        alpha_pattern(ch);
                        break;
                        
            default :   System.out.print("\nWrong choice!!!");
        }
        read.close();
    }    
}
