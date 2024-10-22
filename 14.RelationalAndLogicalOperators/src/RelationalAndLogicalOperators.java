public class RelationalAndLogicalOperators {
    public static void main(String[] args) {
        int a= 5, b=10, c=15;
        System.out.println(a<b);//Start of Relational
        System.out.println(c>b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(c>a && c>b); //Start of Logical
        System.out.println(c>a || a>b);
        System.out.println(!(a>b));
    }
}
