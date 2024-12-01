package Arrays1D;

public class Example4 {
    public static void main(String[] args) {
        int B[]= {2,4,6,8,10};
        for(int x :B){
            System.out.println(x++); //This means by changing the value of x we cannot change the elements of the array
        }
    }
}
