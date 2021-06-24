// Bitwise operators are used to perform operations on the bits
// 1 byte = 8 bits

public class c2_bitwise {

    public static void main(String[] args) {
    
        System.out.println("Bitwise urany NOT   - " + ~12);         // 13
        System.out.println("Bitwise AND         - " + (12 & 13));   // 12
        System.out.println("Bitwise OR          - " + (12 | 13));   // 13
        System.out.println("Bitwise XOR         - " + (12 ^ 13));   // 1
        System.out.println("Bitwise left shift  - " + (10 << 2));   // 40
        System.out.println("Bitwise right shift - " + (10 >> 2));   // 2
        System.out.println("Bitwise shift right zero fill - " + (10 >>> 2));   // 2

    }
}

// Bitwise Assignment operators

// &=       x &= 3      x = x & 3
// |= 	    x |= 3 	    x = x | 3 	
// ^= 	    x ^= 3 	    x = x ^ 3 	
// >>= 	    x >>= 3 	x = x >> 3 	
// <<= 	    x <<= 3 	x = x << 3
