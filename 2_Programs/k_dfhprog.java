import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class k_dfhprog{
    public static void main(String[] args) {
        
        File finr = new File("g_patterns.java");
        
        //reading from the file
        try {
            Scanner reader = new Scanner(finr);

            while(reader.hasNextLine())
            {
                String data = reader.nextLine();

                try{
                    data.substring(0, 2);
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("error");
                    continue;
                }
                finally{
                    if(data.substring(0, 2) == "//"){
                        System.out.println(data);
                    }
                }
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println(e + "here");
            e.printStackTrace();
        }
    }
}