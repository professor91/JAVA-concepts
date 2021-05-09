public class e_strings {
    public static void main(String[] args) {
        String txt = "Hello String:";
        String txt2 = "Hello";
        
        System.out.println(txt + " " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("String"));
        System.out.println(txt.concat(txt2));
        //special characters
        System.out.println("\'  \"  \\");

        int num1 = 20;
        String num2 = "10";
        String final_num = num2 + num1;

        System.out.println(final_num);
    }
}


//More Special characters

// \n 	New Line 	
// \r 	Carriage Return 	
// \t 	Tab 	
// \b 	Backspace 	
// \f 	Form Feed