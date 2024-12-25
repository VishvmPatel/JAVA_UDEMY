// Custom Exception Class
class NegativeDimensionException extends Exception {
    // Overriding the toString method to display a meaningful message
    public String toString() {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}
public class ThrowAndThrowsExample {
    // Method to calculate area, throws NegativeDimensionException if dimensions are negative
    static int area(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0) {
            throw new NegativeDimensionException(); // Throw custom exception
        }
        return l * b; // Calculate and return area
    }
    // Another method that calls area(), propagating the exception using throws
    static void meth1() throws NegativeDimensionException {
        System.out.println("Area is " + area(10, 5));
    }
    // Main method to execute the program
    public static void main(String[] args) {
        try {
            meth1(); // Call meth1(), which may throw NegativeDimensionException
        } catch (NegativeDimensionException e) {
            // Handle the exception and print its message
            System.out.println(e);
        }
        // Print to indicate program flow continues
        System.out.println("Program execution continues...");
    }
}
