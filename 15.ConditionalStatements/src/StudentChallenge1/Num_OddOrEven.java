package StudentChallenge1;
import java.util.Scanner;

public class Num_OddOrEven {
    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("It is a Even Number");
        }
        else
        {
            System.out.println("It is a Odd Number");
        }
    }
}