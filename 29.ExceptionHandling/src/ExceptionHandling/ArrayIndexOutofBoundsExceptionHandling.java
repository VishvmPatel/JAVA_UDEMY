package ExceptionHandling;

public class ArrayIndexOutofBoundsExceptionHandling {
    public static void main(String[] args) {
        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: Index is out of bounds.");
        }
    }
}
