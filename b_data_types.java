public class b_data_types {
    public static void main(String[] args){
        
        String name = "Keshav";
        int integer = 45;
        float decimal = 46.54f;
        char character = 'k';
        boolean value = true;
        
        final int constant_value = 47;

        System.out.println(name);
        System.out.println(integer);
        System.out.println(decimal);
        System.out.println(value);
        System.out.println(character);
        System.out.println(constant_value);

    }
}


// Data Type        Size 	    Description
// byte 	        1 byte 	    Stores whole numbers from -128 to 127
// short 	        2 bytes 	Stores whole numbers from -32,768 to 32,767
// int 	            4 bytes 	Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long 	        8 bytes 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float 	        4 bytes 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double 	        8 bytes 	Stores fractional numbers. Sufficient for storing 15 decimal digits
// boolean 	        1 bit 	    Stores true or false values
// char 	        2 bytes 	Stores a single character/letter or ASCII values