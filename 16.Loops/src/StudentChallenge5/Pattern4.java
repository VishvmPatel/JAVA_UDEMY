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
