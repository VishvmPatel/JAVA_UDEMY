package StringObjects;

public class CreatingStringObjects {
    public static void main(String[] args) {
        String str1="Java Program";
        System.out.println(str1);

        String str2=new String("JAVA");
        System.out.println(str2);

        char c[]={'H','e','l','l','o'};
        String str3=new String(c);
        System.out.println(str3);
        String str4=new String(c,1,3);
        System.out.println(str4);

        byte b[]={65,66,67,68};
        String str5=new String(b);
        System.out.println(str5);
        String str6=new String(b,1,2);
        System.out.println(str6);

        String str7="Java";
        String str8=new String("Java");
        System.out.println(str7==str8);
    }
}
