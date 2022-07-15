package Chapter4Exercises;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        int counter = 1;
        int largest = 0;
        int secondLargest = 0;
        while (counter <= 10) {
            System.out.println("Enter a values: ");
          int  number = scanner.nextInt();
            counter++;


        if (number > largest) {
            largest = secondLargest;
            secondLargest = number;
            }
        }
        System.out.println("The  largest is " + secondLargest);
        System.out.println("The second largest is " + largest);

    }
}
