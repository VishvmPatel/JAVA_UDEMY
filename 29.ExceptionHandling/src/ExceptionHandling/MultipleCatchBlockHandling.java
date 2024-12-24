package ExceptionHandling;

public class MultipleCatchBlockHandling {
    public static void main(String[] args) {
        try{
            int[] numbers = {1,2};
            System.out.println(numbers[5]); //Throws: ArrayIndexOutofBoundsException
            int result = 10/0 ; //Throws: ArithmeticException
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception caught.");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds Exception caught."); // In the out only this shows
        } // as this is the first error that occurs and the program stops there itself.
    }
}
