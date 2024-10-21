package StudentChallenge2;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str="a!B@c#1$2%3";

        str=str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(str);
    }
}
