package StudentChallenge1;
import java.util.Scanner;
public class SearchingAKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        System.out.println("Enter a Key: ");
        int key = sc.nextInt();
        for(int i = 0;i<A.length;i++){
            if(key == A[i]){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}
