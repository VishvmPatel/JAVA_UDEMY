package IfElseStatements;

import java.util.Scanner;
//TO CHECK WHETHER THE GIVEN NUMBER IS POSITIVE NEGATIVE OR ZERO.
public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int x = sc.nextInt();
        if(x>0){
            System.out.println("The provided number is Positive");
        }
        else if (x==0){
            System.out.println("The provided number is Zero");
        }
        else {
            System.out.println("The provided number is Negative");
        }
    }
}
