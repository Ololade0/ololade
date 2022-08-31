package Chapter6DietelExercise;

import java.util.Scanner;

public class SquareOfAstherisks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side");
        int side = scanner.nextInt();


       squareOfAstherisks(side);


    }
    public static void squareOfAstherisks(int side) {
        for (int row = 1; row <= side; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(" * ");
            }

            for (int column = row; column <= side; column++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    }

