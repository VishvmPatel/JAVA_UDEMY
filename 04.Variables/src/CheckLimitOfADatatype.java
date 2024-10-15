public class CheckLimitOfADatatype {
    public static void main(String[] args) {
        //byte b = 130;   This will give an error as in byte type we can only store to a value up to 127.
        byte b = 127;
        int c = 130;
        System.out.println(b);
        System.out.println(c);
    }
}
