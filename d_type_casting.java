public class d_type_casting {
    public static void main(String[] args){
        int auto = 57;
        double auto_casted_value = auto;            //automatically casted int to double

        System.out.println(auto_casted_value);

        byte manual_casted_value = (byte)auto_casted_value;

        System.out.println(manual_casted_value);    //manually casted double to byte
    }
}


//Widening casting (automatically) - converting smaller size to larger size 
        //byte -> short -> char -> int -> long -> float -> double

//Narrowing casting (manually) - converting larger size to smaller size
        //double -> float -> long -> int -> char -> short -> byte 


