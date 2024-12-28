package ControlFlowOfAProgram;

public class ExceptionHandlingFlowsExample {
    public static void main(String[] args) {
        try{
            int result = 10/0 ;
            System.out.println("Result: "+result);
        }catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by zero.");
        }finally{
            System.out.println("Execution Completed.");
        }
    }
}
