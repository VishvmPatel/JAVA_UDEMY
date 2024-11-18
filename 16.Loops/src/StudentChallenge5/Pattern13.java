package StudentChallenge5;

public class Pattern13 {
    public static void main(String[] args) {
        int rows = 5; // Number of lines in the pattern
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
/*
Output:

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

 */