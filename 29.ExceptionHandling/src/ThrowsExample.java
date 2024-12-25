import java.io.*;
public class ThrowsExample {
    public static void main(String[] args) throws IOException {
        readFile();
    }
    static void readFile() throws IOException {
        FileReader file = new FileReader("nonexistent.txt");
    }
}
