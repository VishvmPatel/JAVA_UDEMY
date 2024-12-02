import java.util.Scanner;

public class MaxOfTwoElements {
    static int max (int x , int y){
        if (x>y){
            return x;
        }
        else
            return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = max(a,b);
        System.out.println("The maximum from the 2 is :"+ c);
    }
}
