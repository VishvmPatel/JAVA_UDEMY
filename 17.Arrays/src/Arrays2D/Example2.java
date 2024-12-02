package Arrays2D;

//SIMILAR BASIC CODE FOR 2D ARRAYS BUT WITH THE HELP OF FOR-EACH LOOP

public class Example2 {
    public static void main(String[] args) {
        int A[][] = new int[3][4];
        for(int[] x:A){
            for (int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
