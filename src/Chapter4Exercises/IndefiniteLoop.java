package Chapter4Exercises;

import java.util.Scanner;

public class IndefiniteLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int largest = 0;
        int smallest = 1;

        //while (count <= 3) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
         //   count++;

            if (number > largest) {
                largest = number;
            }
            if ((number < smallest)) {
                smallest = number;
            }
        }
            System.out.println("The largest is " + largest);
            System.out.println("The smallest is "+ smallest);




    }
}
