package StudentChallenge2;

public class RemoveSpacesAndCountWords {
    public static void main(String[] args) {
        String str="      abc     def     gh   ijk    ";
        str=str.replaceAll("\\s+", " ").trim();
        System.out.println(str);
        String words[]=str.split("\\s");
        System.out.println(words.length);
    }
}
