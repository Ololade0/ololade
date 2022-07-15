package Chapter4Exercises;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest = 0;
        while (counter <= 10) {
            System.out.println("Enter an integer:");
            int number = input.nextInt();
            counter++;
            if (number > largest) {
                largest = number;

            }
        }
        System.out.println("The largest is " + largest);
    }
    }

