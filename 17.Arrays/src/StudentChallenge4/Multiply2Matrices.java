package StudentChallenge4;

public class Multiply2Matrices {
    public static void main(String[] args) {
        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
        int C[][] = new int[3][3];

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                C[i][j]=0;
                for(int k=0;k<3;k++) {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }

        for(int x[]:C) {
            for(int y:x) {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
