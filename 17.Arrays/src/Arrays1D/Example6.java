package Arrays1D;

public class Example6 {
    public static void main(String[] args) {
        int B[] = {2,4,6,8,10};
        for(int i = 0; i<B.length ;i++){
            System.out.println(B[i]++);
        }
        for (int x : B){
            System.out.println(x);
        }
    }
}
