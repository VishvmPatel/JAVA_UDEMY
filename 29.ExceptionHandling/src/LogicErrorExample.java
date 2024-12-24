public class LogicErrorExample{
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println(a + b * 2); // Logic Error: If expecting (a + b) * 2, this is incorrect
        System.out.println((a+b)*2); // What the logic should be
    }
}
