public class StoringLiteralsInDifferentFormat {
    public static void main(String[] args) {
        byte d = 10;     //storing 10 in decimal format
        byte b =0b1010;  //storing 10 in binary format
        byte o = 012;    //storing 10 in octal format
        byte h = 0xA;    //storing 10 in hexadecimal format
        System.out.println(d);
        System.out.println(b);
        System.out.println(o);
        System.out.println(h);
    }
}
