public class WrapperClassExample {
    public static void main(String[] args) {
        // Using Integer wrapper class
        Integer i = Integer.valueOf(10); // Explicit usage of valueOf
        Integer b = 10; // Autoboxing

        // Using Byte wrapper class
        Byte c = Byte.valueOf((byte) 15); // Explicit casting to byte
        Byte d = Byte.valueOf("15"); // Using valueOf with String

        // Using Short wrapper class
        Short f = Short.valueOf("123"); // Creating Short using valueOf

        // Using Float wrapper class
        Float g = Float.valueOf(12.3f); // Using valueOf with float
        Float h = Float.valueOf("123.5"); // Using valueOf with String
        float x = h.floatValue(); // Retrieving primitive float from Float
        float y = h; // Unboxing (automatic conversion)

        // Using Double wrapper class
        Double j = Double.valueOf(123.456); // Using valueOf with double

        // Using Character wrapper class
        Character k = Character.valueOf('A'); // Using valueOf with char

        // Using Boolean wrapper class
        Boolean l = Boolean.valueOf("true"); // Using valueOf with String

        // Using Byte wrapper class with primitive byte
        byte bb = 15;
        Byte e = Byte.valueOf(bb); // Wrapping a primitive byte

        // Demonstrating autoboxing and unboxing with Integer
        int m = 10;
        Integer n = m; // Autoboxing (automatic conversion to Integer)
        int p = n; // Unboxing (automatic conversion to int)

        // Printing values to verify correctness
        System.out.println("Integer: " + i);
        System.out.println("Byte (c): " + c);
        System.out.println("Byte (d): " + d);
        System.out.println("Short: " + f);
        System.out.println("Float (g): " + g);
        System.out.println("Float (h): " + h);
        System.out.println("Double: " + j);
        System.out.println("Character: " + k);
        System.out.println("Boolean: " + l);
        System.out.println("Byte from primitive: " + e);
        System.out.println("Unboxed float (x): " + x);
        System.out.println("Unboxed float (y): " + y);
        System.out.println("Autoboxed Integer: " + n);
        System.out.println("Unboxed int: " + p);
    }
}
