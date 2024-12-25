public class ExceptionClassMethods {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); // Invalid number
        } catch (NumberFormatException e) {
            System.out.println("Error Message: " + e.getMessage()); // Specific message
            System.out.println("Exception toString: " + e.toString()); // Class + message
            e.printStackTrace(); // Full stack trace for debugging
        }
    }
}
