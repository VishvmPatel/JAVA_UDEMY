package ControlFlowOfAProgram;

public class MethodCallsExample {
    public static void main(String[] args) {
        System.out.println("Start");
        greet();
        System.out.println("End");
    }
    static void greet(){
        System.out.println("Hello, Welcome!");
    }
}
