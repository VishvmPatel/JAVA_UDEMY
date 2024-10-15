public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        float a=3.5f;
        char b='A';
        byte c=5;

        int x=5;
        ++x;  //++x
        System.out.println(x);

        int d=5,e;
        e=d++; //d++
        System.out.println(d+" "+e);

        int f=5,g=4,z;
        z=2 * f++ + 3 * ++g;
        System.out.println(z);

    }
}
