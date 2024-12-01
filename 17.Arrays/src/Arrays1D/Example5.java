package Arrays1D;

public class Example5 {
    public static void main(String[] args) {
        int B[] = {2,4,6,8,10};
        B[2] = 16; //This shows how to change the value of an element in an Array
        for(int x : B){
            System.out.println(x);
        }
    }
}
