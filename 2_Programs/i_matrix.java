import java.util.Scanner;

class Matrix{
    
    private int rows, column;
    private int matrix[][] = new int[100][100];

    //get private variables
    int get_row()
    {
        return rows;
    }
    int get_col()
    {
        return column;
    }
    //constructor
    public Matrix(int r, int c)
    {
        rows= r;
        column= c;
    }
    
    //function to read matrix
    public void read_matrix(Scanner read)
    {
        System.out.println("Enter the elements of the matrix:");

        for(int i = 0; i < rows; i++)
        {
            for(int  j = 0; j < column; j++)
            {
                matrix[i][j]= read.nextInt();
            } 
        }

    }

    //function to add two matrices
    public Matrix add(Matrix mat2)
    {
        mat2= new Matrix(rows, column);
        //matrix stroing result
        Matrix result= new Matrix(rows, column);

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
    public Matrix multiply(Matrix mat2)
    {
        //matrix stroing result
        Matrix result= new Matrix(rows, mat2.column);

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
    public Matrix transpose()
    {
        //matrix storing result
        Matrix result= new Matrix(rows, column);
        
    
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
}

//--------------------------------------------------------------------------------------------------------------//

public class i_matrix{
   
    public static void main(String[] args) {       

        Scanner read = new Scanner(System.in);
        int choice;
        System.out.print("Enter number of rows: ");
        int rows = read.nextInt();
        System.out.print("Enter number of columns: ");
        int col = read.nextInt();   
        
        //initializing 1st matrix
        Matrix mat= new Matrix(rows, col);
        mat.read_matrix(read);

        
        //menu
        System.out.println("1. Add two matrices\n2. Multiply Two Matrices\n3. Print transpose of the matrix");
        System.out.print(read.hasNextLine());
        choice = read.nextInt();
        

        switch(choice)
        {
            case 1  :{  
                        Matrix mat2= new Matrix(rows, col);
                        mat2.read_matrix(read);
                        //resultant matrix
                        Matrix result= new Matrix(rows, col);
                        //function calling
                        result= mat.add(mat2);
                        result.show(rows, col);
                        break;
                    }

            case 2  :{
                        Matrix mat2= new Matrix(rows, col);
                        mat2.read_matrix(read);                
                        //resultant matrix
                        Matrix result= new Matrix(rows, col);
                        //function called
                        result= mat.multiply(mat2);
                        result.show(rows, col);
                        break;
                    }

            case 3  :{
                        Matrix result= new Matrix(rows, col);
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