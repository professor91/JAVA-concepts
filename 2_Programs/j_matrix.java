import java.util.Scanner;

public class j_matrix {
    
    private int rows, column;
    private int matrix[][] = new int[100][100];

    //constructor
    public i_matrix(int r, int c)
    {
        rows= r;
        column= c;
    }
    
    //function to read matrix
    public void read_matrix()
    {
        System.out.println("Enter the elements of the matrix:");
        Scanner read = new Scanner(System.in);

        for(int i = 0; i < rows; i++)
        {
            for(int  j = 0; j < column; j++)
            {
                matrix[i][j]= read.nextInt();
            } 
        }
       // read.close();
    }

    //function to add two matrices
    public i_matrix add(i_matrix mat2)
    {
        mat2= new i_matrix(rows, column);
        //matrix stroing result
        i_matrix result= new i_matrix(rows, column);

        for(int i= 0; i< rows; i++)
        {
            for(int j= 0; j< column; j++)
            {
                result.matrix[i][j]= matrix[i][j] + mat2.matrix[i][j];
            }
            System.out.print("\n");
        }
    return result;
    }

    //function to check condition for multiplity of two matrices
    public boolean check_multiply_condition(int a)
    {
        if(rows == a)
            return true;
        return false;
    }
    
    //function to multiply two matrices
    public i_matrix multiply(i_matrix mat2)
    {
        //matrix stroing result
        i_matrix result= new i_matrix(rows, mat2.column);

        System.out.println("Resultant Matrix is:");

        if(column != mat2.rows)
        {
            System.out.print("\nColumn of first and row of second are not same.");
            System.exit(100);
        }

        int sum;
    
        for(int i = 0; i < rows; i++)
        {   
            for(int j = 0; j < mat2.column; j++)
            {
                sum = 0;
                for(int k = 0; k < rows; k++)
                    sum += matrix[i][k] + mat2.matrix[j][k];
                
                result.matrix[i][j] = sum;
            }
        }
    return result;
    }
    
    //function to compute transpose of two matrices
    public i_matrix transpose()
    {
        //matrix storing result
        i_matrix result= new i_matrix(rows, column);
        
    
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < column; j++)
                result.matrix[j][i] = matrix[i][j];  //taking transpose of the matrix
        
    return result;
    
    }

    public void show(int a, int b)
    {
        for(int i= 0; i< a; i++)
        {
            for(int j= 0; j< b; j++)
                System.out.print(matrix[i][j]);
            System.out.print("\n");
        }
    }

    
    public static void main(String[] args) {       

        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = read.nextInt();
        System.out.print("Enter number of columns: ");
        int col = read.nextInt();
        
        //initializing 1st matrix
        i_matrix mat= new i_matrix(rows, col);
        mat.read_matrix();
        
        //menu
        System.out.println("1. Add two matrices\n2. Multiply Two Matrices\n3. Print transpose of the matrix");
        int choice = read.nextInt();
        

        switch(choice)
        {
            case 1  :{  
                        i_matrix mat2= new i_matrix(rows, col);
                        mat2.read_matrix();
                        //resultant matrix
                        i_matrix result= new i_matrix(rows, col);
                        //function calling
                        result= mat.add(mat2);
                        result.show(rows, col);
                        break;
                    }

            case 2  :{
                        i_matrix mat2= new i_matrix(rows, col);
                        mat2.read_matrix();
                        //resultant matrix
                        i_matrix result= new i_matrix(rows, col);
                        //function called
                        result= mat.multiply(mat2);
                        result.show(rows, col);
                        break;
                    }

            case 3  :{
                        i_matrix result= new i_matrix(rows, col);
                        //function called
                        result= mat.transpose();
                        result.show(rows, col);
                        break;
                    }
            
            default :   System.out.println("Wrong Choice!");                        
        }
        read.close();
    }
}
// Exception in thread "main" java.util.NoSuchElementException
