package Chapter2DietelExercise;

import java.util.Scanner;

public class ComparingInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int integer = scanner.nextInt();

        int square = integer * integer;
        System.out.println("The square of the number is: " + square);

        if (integer > 100 && square > 100) {
            System.out.println("The number is greater than 100");
        }
        if (integer == 100 && square == 100) {
            System.out.println("The number is equal than 100");
        }
        if (integer == 100 && square == 100) {
            System.out.println("The number is equal to 100");

        }

        if (integer != 100 && square != 100) {
            System.out.println("The number is not equal to 100");

        }
        if(integer < 100 && square < 100) {
            System.out.println("The number is less than 100");
        }

        else {
            System.out.println("The number or its square  is not up to 100");
        }

        }
    }