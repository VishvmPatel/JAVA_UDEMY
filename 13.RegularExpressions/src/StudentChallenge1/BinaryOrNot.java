package StudentChallenge1;

public class BinaryOrNot {
    public static void main(String[] args) {
        int b=100110010;

        String str=String.valueOf(b);

        System.out.println(str.matches("[01]+"));
    }
}
