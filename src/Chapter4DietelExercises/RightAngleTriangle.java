package Chapter4DietelExercises;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the base of a triangle: ");
        int length = input.nextInt();

        for (int row = 1; row <= length; row++){
            for (int column = 1; column <= row; column++) {
                System.out.print("  ");
            }
            for (int column = row; column <= length ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    }
