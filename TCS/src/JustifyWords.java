import java.util.*;

public class JustifyWords {

    // Function to check if a word can fit in the current line
    public static boolean canFit(String currentLine, String word, int M) {
        if (currentLine.isEmpty()) {
            return word.length() <= M;
        } else {
            return currentLine.length() + 1 + word.length() <= M;  // +1 for the space
        }
    }

    // Backtracking function to try and place words in the lines
    public static int backtrack(List<String> words, int N, int M, int index) {
        // Base case: If we've gone through all words
        if (index == words.size()) {
            return 0;
        }

        int maxWords = 0;
        String currentLine = "";

        // Try to fit words into the current line
        for (int i = index; i < words.size(); i++) {
            if (canFit(currentLine, words.get(i), M)) {
                // If the word fits, add it to the current line
                currentLine += (currentLine.isEmpty() ? "" : " ") + words.get(i);
                // Recursively count the words that can be fit
                maxWords = Math.max(maxWords, 1 + backtrack(words, N, M, i + 1));
            }
        }

        // Also consider the scenario where we don't use the current word
        maxWords = Math.max(maxWords, backtrack(words, N, M, index + 1));

        return maxWords;
    }

    // Main function to calculate the maximum number of words
    public static int maximumWords(int K, List<String> words, int N, int M) {
        // Sort the words by length (optional optimization)
        Collections.sort(words, Comparator.comparingInt(String::length));
        return backtrack(words, N, M, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int K = Integer.parseInt(scanner.nextLine());  // number of words
        List<String> words = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            words.add(scanner.nextLine().trim());
        }

        // Read N and M
        String[] nm = scanner.nextLine().split(" ");
        int N = Integer.parseInt(nm[0]);  // number of lines
        int M = Integer.parseInt(nm[1]);  // characters per line

        // Calculate and print the result
        int result = maximumWords(K, words, N, M);
        System.out.print(result);  // Ensure no extra newline or space is added

        scanner.close();
    }
}
