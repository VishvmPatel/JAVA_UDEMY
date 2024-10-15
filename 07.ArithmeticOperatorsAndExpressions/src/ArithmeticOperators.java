public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 14, b = 5;
        int c = a/b;
        int d = a%b;   //MOD Operation gives remainder.

        float e = (float)a/b;   //Type Casting the expression so that we get result in float data type.
        float f = (float)a%b;
        int add = a+b;
        int sub = a-b;
        int mul = a*b;

        System.out.println("The addition of the two numbers is: " + add);
        System.out.println("The subtraction of the two numbers is: " +sub);
        System.out.println("The multiplication of the two numbers is: " +mul);
        System.out.println("The division of the two numbers is: " +c);
        System.out.println("The remainder(Modulus) of the two numbers is: " +d);
        System.out.println("The division in float type of the two numbers is: " +e);
        System.out.println("The remainder(Modulus) in float type of the two numbers is: " +f);
    }
}
