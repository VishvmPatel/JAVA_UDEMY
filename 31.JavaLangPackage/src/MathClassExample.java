public class MathClassExample {
    public static void main(String[] args) {
        // Absolute value
        System.out.println("Absolute (Math.abs): " + Math.abs(-123));
        System.out.println("Absolute (StrictMath.abs): " + StrictMath.abs(-123));

        // Cube root
        System.out.println("Cube Root (Math.cbrt): " + Math.cbrt(27));

        // Exact decrement
        System.out.println("Exact Decrement (Math.decrementExact): " + Math.decrementExact(-1));

        // Exponent value in floating-point representation
        System.out.println("Exponent value (Math.getExponent): " + Math.getExponent(123.45));

        // Round division
        System.out.println("Floor Division (Math.floorDiv): " + Math.floorDiv(50, 9));

        // Exponential function (e^x)
        System.out.println("e^x (Math.exp): " + Math.exp(1));
        System.out.println("e^x (StrictMath.exp): " + StrictMath.exp(1));

        // Logarithm base 10
        System.out.println("Log base 10 (Math.log10): " + Math.log10(100));

        // Maximum of two numbers
        System.out.println("Maximum (Math.max): " + Math.max(100, 50));

        // Tangent of an angle
        System.out.println("Tan (Math.tan): " + Math.tan(45 * Math.PI / 180));

        // Conversion between degrees and radians
        System.out.println("Convert to Radians (Math.toRadians): " + Math.toRadians(90));
        System.out.println("Convert to Degrees (Math.toDegrees): " + Math.toDegrees(Math.atan(1)));

        // Hyperbolic tangent and conversion to degrees
        System.out.println("Convert to Degrees (StrictMath.tanh): " + StrictMath.toDegrees(StrictMath.tanh(1)));

        // Random value
        System.out.println("Random (Math.random): " + Math.random() * 1000);

        // Power calculation
        System.out.println("Power (Math.pow): " + Math.pow(2, 3));

        // Exact product
        System.out.println("Exact Product (Math.multiplyExact): " + Math.multiplyExact(100, 200));

        // Next floating-point value
        System.out.println("Next Float Value (Math.nextAfter): " + Math.nextAfter(12.5, 11));
    }
}
