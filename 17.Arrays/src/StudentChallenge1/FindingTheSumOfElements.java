package StudentChallenge1;

public class FindingTheSumOfElements {
    public static void main(String[] args) {
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int sum = 0;
        System.out.println("The elements are");
        for(int x: A){
            System.out.print(x+" ");
            sum=sum+x;
        }
        System.out.println("\nThe sum of the elements is "+sum);
    }
}
