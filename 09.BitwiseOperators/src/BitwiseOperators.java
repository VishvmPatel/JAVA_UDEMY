public class BitwiseOperators {
    public static void main(String[] args) {
        int x=10, y=6,z;
        z=x&y; //x AND y
        System.out.println(z);


        int a=0b1010, b=0b0110,c,f;
        c=a|b; //a OR b
        f=a^b; //a XOR b
        System.out.println(c);
        System.out.println(f);

        int d=0b1000;
        int e,g,h,i;
        e=d<<1; //left shift by 1
        g=d<<2; //left shift by 2
        h=d>>1; //right shift by 1
        i=x>>2; //right shift by 2
        System.out.println(e);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);


        int j=-0b1010; //try with + and -
        int k,l;
        k=j>>1;
        l=~j;
        System.out.println(String.format("%s",Integer.toBinaryString(j)));
        System.out.println(String.format("%s",Integer.toBinaryString(k)));
        System.out.println(String.format("%s",Integer.toBinaryString(l)));
    }
}
