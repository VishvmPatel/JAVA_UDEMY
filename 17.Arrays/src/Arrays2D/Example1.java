package Arrays2D;

public class Example1 {
    public static void main(String args[])
    {
        int A[][] = new int[3][4];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
