package StudentChallenge1;

public class Date {
    public static void main(String[] args) {
        String str1 = "01/12/2013";
        System.out.println(str1.matches("([0-2][0-9]|[3][01])/([0][1-9]|[1][0-2])/[0-9]{4}"));
    }
}
