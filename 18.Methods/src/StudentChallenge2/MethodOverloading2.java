package StudentChallenge2;

public class MethodOverloading2 {
    static int reverse(int n) {
        int rev=0;
        while(n>0) {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    static int [] reverse(int A[]) {
        int B[]=new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        return B;
    }
    public static void main(String[] args) {
        // Reverse an integer
        int reversedNumber = reverse(786);
        System.out.println("Reversed number: " + reversedNumber);
        // Reverse an array of integers
        int[] array = {7, 8, 6};
        int[] reversedArray = reverse(array);
        System.out.print("Reversed array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
