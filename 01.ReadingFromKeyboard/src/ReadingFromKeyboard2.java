import java.util.*;
import java.lang.*;

public class ReadingFromKeyboard2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String name;
        System.out.print("May I know your Name ");
        name= s.nextLine();
        System.out.println("Welcome Mr/Miss "+name);
    }
}
