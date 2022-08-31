package Chapter2DietelExercise;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int firstInteger = scanner.nextInt();


        System.out.println("Enter the second integer: ");
        int secondInteger = scanner.nextInt();

        int tripled = firstInteger * firstInteger * firstInteger;
        System.out.println("The triple is " + tripled);
        int doubled = secondInteger * secondInteger;
        System.out.println("The double is " + doubled);
        if (tripled % doubled == 0){
            System.out.println("it is multiple");
        }
        else {
            System.out.println("It is not multiple");
        }


    }
}
