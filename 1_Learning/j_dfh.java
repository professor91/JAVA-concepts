import java.io.File;

//module with IO (input/output) Errors
import java.io.IOException;

//module to write in files 
import java.io.FileWriter;

//module for FileNotFound Errors
import java.io.FileNotFoundException;

//module to read files
import java.util.Scanner;

public class j_dfh{
    public static void main(String[] args) {
        
        File fin = new File("file.txt");
        //cannot do file handeling with try-catch

        //making new file
        try {
            if(fin.createNewFile())
                System.out.println("file made");    
            else
                System.out.println("error in making file");
        }
        catch (IOException e) {
            System.out.println(e);
        }
        
        System.out.println("Read? " + fin.canRead());
        System.out.println("Write? " + fin.canWrite());
        System.out.println("Name of file is: " + fin.getName());
        System.out.println("Absolute Path of file is: " + fin.getAbsolutePath());
        System.out.println("Length of file is: " + fin.length());
        System.out.println("All files in the directory is: " + fin.list());        
        
        //writing in a file
        try {
            FileWriter finw = new FileWriter("file.txt");
            finw.write("Hello writing in file.");
            finw.close();
            System.out.println("Successfully wrote in file.");
        } 
        catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        //reading from the file
        try {
            File finr = new File("file.txt");
            Scanner reader = new Scanner(finr);
            while(reader.hasNextLine())
            {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        //deleting the file
        File find = new File("file.txt");
        if(find.delete())
            System.out.println("File deleted successfully");
        else
            System.out.println("Couldn't delete the file");
    }
}

//In JAVA we make an object pointing towards the file and there is no "open" function unlike C++
//that's why make new objects to access file in read/write mode and give the name of file you wanna open

// createNewFile()	    Boolean	    Creates an empty file
// canRead()	        Boolean	    Tests whether the file is readable or not
// canWrite()	        Boolean	    Tests whether the file is writable or not
// exists()	            Boolean	    Tests whether the file exists
// getName()	        String	    Returns the name of the file
// getAbsolutePath()	String	    Returns the absolute pathname of the file
// length()	            Long	    Returns the size of the file in bytes
// list()	            String[]	Returns an array of the files in the directory
// mkdir()	            Boolean	    Creates a directory
// delete()	            Boolean	    Deletes a file
