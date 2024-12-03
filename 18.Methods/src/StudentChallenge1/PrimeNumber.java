package StudentChallenge1;

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n) {
        for(int i=2;i<n/2;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("The number "+n+" is a prime number.");
        }
        else {
            System.out.println("The number "+n+" is not a prime number.");
        }
    }
}
