package ExceptionHandling;

public class FinallyBlockHandling {
    public static void main(String[] args) {
        try{
            int result = 10/0 ;
            System.out.println(result); //Throws ArithmeticException
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: Division by zero.");
        }
        finally{
            System.out.println("Finally Block Executed.");
        }
    }
}
