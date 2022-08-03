package Chapter2;

import java.util.Scanner;

public class Diameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pie = 3.14159;

        System.out.println("Enter the radius of a circle: ");
        int radius = scanner.nextInt();

        double diameter = radius * 2;
        System.out.println("The circle diameter is " + diameter);

        double circumference = 2 * pie * radius;
        System.out.println("The circumference is " + circumference);

        double area = pie * (radius * radius);
        System.out.println("The area is " + area);
    }

}
