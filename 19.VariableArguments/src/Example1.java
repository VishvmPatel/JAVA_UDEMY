public class Example1 {
    static void show(int ...A){
        for(int x : A){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(10,20,30,40,50,60,70,80,90,100);
        show(3,5,7,9,11,13,15); //CREATED AN ARRAY AND PASSED
    }
}