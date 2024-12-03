package StudentChallenge1;

import java.util.Scanner;

public class GCDof2Numbers {
    static int gcd(int m, int n) {
        while(m!=n) {
            if(m>n){
                m=m-n;
            }
            else {
                n=n-m;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The Greatest Common Divisor is: "+ gcd(a,b));
    }
}
