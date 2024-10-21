package StudentChallenge;

public class StudentChallenge1 {
    public static void main(String[] args)
    {
        String str="programmer@gmail.com";
        String str1="programmer@hotmail.com";

        int i=str.indexOf("@");
        int l=str1.indexOf("@");
        String uname=str.substring(0,i);
        String uname1=str1.substring(0,l);
        String domain=str.substring(i+1, str.length());
        String domain1=str1.substring(l+1, str1.length());

        System.out.println("Username :"+uname);
        System.out.println("Domain :"+domain);
        System.out.println("Username :"+uname1);
        System.out.println("Domain :"+domain1);

        int j=domain.indexOf(".");
        String name=domain.substring(0, j);
        System.out.println(name.equals("gmail"));
        int k=domain1.indexOf(".");
        String name1=domain.substring(0, k);
        System.out.println(name1.equals("gmail"));
    }
}
