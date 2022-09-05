package Chapter2DietelExercises;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int secondInteger = scanner.nextInt();


        int firstIntegerSquare = firstInteger * firstInteger;
        System.out.println("The square of first integer is: " + firstIntegerSquare);


        int secondIntegerSquare = secondInteger * secondInteger;
        System.out.println("The square of second integer is: " + secondIntegerSquare);

        int sum = firstIntegerSquare + secondIntegerSquare;
        System.out.println("The sum of the square is: " + sum);

        int difference = firstIntegerSquare - secondIntegerSquare;
        System.out.println("The difference is: " + difference);



    }
}
