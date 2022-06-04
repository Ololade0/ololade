package Practice;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;
        while (gradeCounter <= 10) {
            System.out.print("Enter the next grade");
            int grade = input.nextInt();
            total = grade + total;
            gradeCounter = gradeCounter + 1;
        }
        int average = total / 10;
        System.out.printf("%nTotal of ten grade %d%n", total);
        System.out.printf("Class avaerage is %d%n", average);

    }
}
