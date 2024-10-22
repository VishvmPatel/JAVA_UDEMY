package StudentChallenge1;
import java.util.Scanner;
public class YoungOrOld {
    public static void main(String[] args)
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age ");
        age=sc.nextInt();
        if(age>=14 && age<=55)
        {
            System.out.println("You are Young");
        }
        else
        {
            System.out.println("you are Not Young");
        }
    }
}
