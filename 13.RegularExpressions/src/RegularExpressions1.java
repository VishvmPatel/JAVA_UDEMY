public class RegularExpressions1 {
    public static void main(String[] args) {
        String str1="f";
        System.out.println(str1.matches("."));

        String str2="a";//b,c
        System.out.println(str2.matches("[abc]"));

        String str3="p";//true for alphabets other than abc
        System.out.println(str3.matches("[^abc]"));

        String str4="7";//A,a7
        System.out.println(str4.matches("[a-zA-Z0-9]"));//[a-z][0-9]

        String str5="b";
        System.out.println(str5.matches("a|b"));

        String str6="b";
        System.out.println(str6.matches("\\w"));

        String str7="5";
        System.out.println(str7.matches("\\d"));

        String str8="$";
        System.out.println(str8.matches("\\D"));
    }
}
