package StudentChallenge1;

import java.util.Scanner;
public class AreaWithHeightandBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height: ");
        float height = sc.nextFloat();
        System.out.println("Enter Base: ");
        float base = sc.nextFloat();

        float Area = (height*base)/2;
        System.out.println("The Area of the Triangle is: "+Area);

    }
}
