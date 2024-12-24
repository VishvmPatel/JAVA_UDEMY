public class NestedCatchBlock {
    public static void main(String[] args) {
        int A[] = {30, 20, 10, 40, 0}; // Array with 5 elements

        try {
            // Outer try block for arithmetic exception
            int c = A[0] / A[4]; // Division by zero
            System.out.println("Division is " + c);

            try {
                // Inner try block for array index out-of-bounds exception
                System.out.println(A[5]); // Attempting to access invalid index
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is invalid. Array size exceeded.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0.");
        }

        System.out.println("Program execution completed. Bye!");
    }
}
