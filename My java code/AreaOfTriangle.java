import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();


        double side1 = Math.abs(x1 - y1);
        double side2 = Math.abs(x2 - y2);
        double side3 = Math.abs(x3 - y3);



        double s = (side1 + side2 + side3)/2;
        double area = Math.abs(s * ((s - side1) * (s - side2) * (s - side3)));
        double Area = Math.sqrt(area);
     System.out.printf("The area of the triangle is %.1f", Area);


    }
}