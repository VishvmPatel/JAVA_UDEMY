public class FlagsAndWidthPrinting {
    public static void main(String[] args) {
        int a = 10;//a=-10
        System.out.printf("%5d \n", a); //This represents width so 10 gets represents in total 5 places.
        System.out.printf("%05d \n", a);//Now here the 0 before 5 is known as flag so the blank spaces are filled by 0.

        float b = 123.45f;//3.45f
        System.out.printf("%6.2f", b);
        String str = "Java";
        System.out.printf("%20s", str);
    }
}

