import java.io.*;
public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
