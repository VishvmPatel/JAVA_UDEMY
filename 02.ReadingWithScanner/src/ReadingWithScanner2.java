import java.util.*;
public class ReadingWithScanner2 {
    public static void main(String[] args) {
        //This code will take a binary input and provide a decimal output.
        Scanner sc = new Scanner(System.in);
        sc.useRadix(2);
        int x = sc.nextInt();
        System.out.println(x);
    }
}
