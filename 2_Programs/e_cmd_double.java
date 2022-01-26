public class e_cmd_double {
    public static void main(String[] args) {
        if(args.length > 1)
        {
            System.out.println("Please enter only 1 number.");
            return;
        }
        
        try{
            Integer.parseInt(args[0]);
        }
        catch(NumberFormatException ex){
            System.out.println("Please enter a number");
        }
        
        System.out.println("Double of the number is: " + Integer.parseInt(args[0]) * 2);
    }
}
