package StudentChallenge5;
//Pattern 4 in a proper format within a perfect box structure.
public class Pattern5 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1 ; i <=5 ; i++){
            for (int j = 1; j<=5 ; j++){
                ++count ;
                System.out.format("%02d ",count);
            }
            System.out.println();
        }
    }
}
/*
Output:

01 02 03 04 05
06 07 08 09 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

 */