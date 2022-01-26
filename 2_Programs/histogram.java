import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;

public class histogram {
    
    static void vertical_histo(File fin)
    {
        // char letter;
        int[] freq = new int[32];
    
        for(int i = 0; i < 26; i++)
            freq[i] = 0;                                
        

        try (FileReader fr = new FileReader(fin))
        {
            int content;
            while ((content = fr.read()) != -1) 
            {
                if(Character.isAlphabetic(content));
                    freq[(char)Character.toLowerCase(content) - 97]++;           //incrementing the correnponding alphabet in the frequency table
                
                System.out.print((char) content);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    
        for(int i = 0; i < 26; i++)
        {
            System.out.print((char)(i + 65) + ", " + (char)(i + 97) + " , " + freq[i] + "  | ");
    
            for(int j = 0; j < freq[i]; j++)
                System.out.print("* ");
    
            System.out.print("\n");
        }    
    }
    
    // static void horizontal_histo()
    // {

    // }

    public static void main(String[] args) {
        int choice;
    
        //opening the file
        File fin = new File("histo.txt");
        try {
            if(fin.createNewFile())
                System.out.println("File Accessed!");    
            else
                System.out.println("Error in accessing file");
        }
        catch (IOException e) {
            System.out.println(e);
        }

        // System.out.print("\nEnter the content of file: ");
        // Scanner read = new Scanner(System.in);
        String content = "that prints a table indicating the number of occurrences of each alphabet in the text";

        //writing in file
        try {
            FileWriter finw = new FileWriter("histo.txt");
            finw.write(content);
            finw.close();
            System.out.println("Successfully wrote in file.");
        } 
        catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }


        System.out.println("\n1. Vertical Histogram\t2. Horizontal Histogram");
        System.out.print("Enter your choice: ");
        Scanner read = new Scanner(System.in);
        choice = read.nextInt();
        
    
        switch(choice)
        {
            case 1  :   vertical_histo(fin);                               //calling function_2
                        break;
            
            // case 2  :   horizontal_histo();
            //             break;
    
            default :   System.out.print("\nWrong Choice!!!");
        }
        read.close();
        
    }
}

// that prints a table indicating the number of occurrences of each alphabet in the text