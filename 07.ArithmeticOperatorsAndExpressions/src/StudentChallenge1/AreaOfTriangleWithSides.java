package StudentChallenge1;

import java.util.*;
public class AreaOfTriangleWithSides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double S,area;
        System.out.println("Enter 3 sides of Triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        S = (a+b+c)/2;
        area = Math.sqrt((S*(S-a)*(S-b)*(S-c)));
        System.out.println("Area of Triangle is : "+ area);
    }
}
