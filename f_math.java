public class f_math {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        float c = -4.7f;

        System.out.println("Max is: " + Math.max(a, b));
        System.out.println("Min is: " + Math.min(a, b));
        System.out.println("Square is: " + Math.sqrt(a));
        System.out.println("ABS is: " + Math.abs(c));        //returns absolute positive value
        System.out.println("Generate random numbers (default): " + Math.random());
        System.out.println("Generate random numbers: " + (int)Math.random() * 20);
        System.out.println("Generate random numbers: " + (int)(Math.random() * 20));
    }
}
