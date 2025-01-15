public class WrapperClassExample2 {

    public static void main(String[] args) {

        // Primitive to Wrapper Conversion (Autoboxing)
        int m1 = 15;
        Integer m2 = Integer.valueOf(m1); // Explicit conversion
        Integer m3 = 15; // Autoboxing

        // Creating Integer objects with valueOf
        Integer m4 = Integer.valueOf("123"); // From string
        Integer m5 = Integer.valueOf("A7", 16); // From hexadecimal string with base 16
        Integer m6 = Integer.decode("0xA7"); // Decode hexadecimal string

        // Demonstrating parsing and byte manipulation
        System.out.println("Binary representation of 40: " + Integer.toBinaryString(40));
        System.out.println("Reversing bytes of 128 equals Integer.MIN_VALUE: " +
                (Integer.reverseBytes(128) == Integer.MIN_VALUE));

        // Equality checks and comparisons
        System.out.println("m4 equals m1: " + m4.equals(m1)); // Comparing with primitive
        System.out.println("m4 equals m5: " + m4.equals(m5)); // Comparing two wrapper objects

        // Parsing Strings to Integers
        int parsedValue = Integer.parseInt("123"); // Parses a string to int
        System.out.println("Parsed value: " + parsedValue);

        // Exploring utility methods in Integer class
        System.out.println("Max value of int: " + Integer.MAX_VALUE);
        System.out.println("Min value of int: " + Integer.MIN_VALUE);
        System.out.println("Number of leading zeros in 16: " + Integer.numberOfLeadingZeros(16));
        System.out.println("Highest one-bit position in 16: " + Integer.highestOneBit(16));

        // Demonstrating unboxing
        int m7 = m6; // Unboxing
        System.out.println("Unboxed value of m6: " + m7);

        // Working with other wrapper classes
        Double doubleValue = Double.valueOf("123.45");
        System.out.println("Double value: " + doubleValue);
        System.out.println("String representation of Double: " + Double.toString(doubleValue));

        Boolean booleanValue = Boolean.valueOf("true");
        System.out.println("Boolean value: " + booleanValue);

        Character characterValue = Character.valueOf('A');
        System.out.println("Character value: " + characterValue);

        // Demonstrating manual boxing and unboxing
        byte primitiveByte = 10;
        Byte wrappedByte = Byte.valueOf(primitiveByte); // Boxing
        byte unboxedByte = wrappedByte; // Unboxing
        System.out.println("Boxed byte: " + wrappedByte);
        System.out.println("Unboxed byte: " + unboxedByte);

        // Exploring static methods in wrapper classes
        System.out.println("Hexadecimal representation of 255: " + Integer.toHexString(255));
        System.out.println("Octal representation of 255: " + Integer.toOctalString(255));
        System.out.println("Is 255 a finite double? " + Double.isFinite(255.0));

        // Edge cases and special scenarios
        try {
            Integer invalidValue = Integer.valueOf("Invalid"); // Will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}
