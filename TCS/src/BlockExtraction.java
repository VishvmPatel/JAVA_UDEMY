import java.util.*;

public class BlockExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrix
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Input matrix
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Input block to pick
        int K = scanner.nextInt();

        // Set to keep track of blocks to be removed
        Set<Integer> blocksToRemove = new HashSet<>();

        // Traverse the matrix column by column
        for (int col = 0; col < M; col++) {
            boolean foundK = false;

            for (int row = 0; row < N; row++) {
                int block = matrix[row][col];

                if (block == K) {
                    foundK = true; // Mark that we've reached block K
                } else if (!foundK) {
                    // Add blocks above K to the set
                    blocksToRemove.add(block);
                } else {
                    // Stop processing once K is found in the column
                    break;
                }
            }
        }

        // Ensure block K is not mistakenly included
        blocksToRemove.remove(K);

        // Output the number of blocks to remove
        System.out.println(blocksToRemove.size());
    }
}
