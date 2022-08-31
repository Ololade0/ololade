package Chapter5DietelExercise;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter an integer");
     int  integer = input.nextInt();


        int maximum = integer;
        int minimum = integer;
        int sum = 0;

        int count = 0;
        while (count <= 9) {

            System.out.println("Enter an integer");
            integer = input.nextInt();

            if (integer > maximum) {
                maximum = integer;
            }

            if (integer < minimum) {
                minimum = integer;
            }
            count++;
        }

        sum = maximum + minimum;


        System.out.println("The maximum is " + maximum);
        System.out.println("The minimum is " + minimum);
        System.out.println("The sum is " + sum);
    }
}