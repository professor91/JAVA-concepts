import java.util.Scanner;

public class f_decimaltobinary {
    public static void main(String[] args) {
        int decnum;
        int[] binary = new int[32];


        System.out.print("Enter the decimal number: ");
        Scanner read = new Scanner(System.in);
        decnum = read.nextInt();
        read.close();
        
        int i = 0;
        while(decnum > 0)
        {
            binary[i] = decnum%2;
            decnum = decnum/2;
            i++;
        }

        System.out.print("Binary for is: ");
        for(int j = i - 1; j > -1; j--)
            System.out.print(binary[j] + " ");
    }
}
