package StudentChallenge5;

public class Pattern4 {
    public static void main(String[] args) {
        int count = 0 ;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print(++count +" ");
            }
            System.out.println();
        }
    }
}
/*
Output:

1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

 */
