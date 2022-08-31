package Chapter4DietelExercises;

import java.util.Scanner;

public class ReadingUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        //int firstInteger;
        //  int secondInteger;

        System.out.println("Enter integer: ");
        int firstInteger = input.nextInt();

        while (firstInteger != 0) {
            while (firstInteger != 0) {
                System.out.println("Enter integer: ");
                int secondInteger = input.nextInt();

                total = total + secondInteger;
                if (total >= firstInteger) {
                    System.out.println("sum of all integer is greater");
                }
                firstInteger++;
            }
            firstInteger++;
        }
    }
}
