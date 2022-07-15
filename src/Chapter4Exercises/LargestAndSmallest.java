package Chapter4Exercises;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter numbers");
        int number = input.nextInt();
        int largest = number;
        int smallest = number;



        while (count <= 9) {
            System.out.println("Enter numbers");
             number = input.nextInt();


            if (number > largest) {
                largest = number;
            }
            else if (number < smallest) {
                smallest = number;
            }
            count++;


        }

        System.out.println("The largest is " + largest);
        System.out.println("The smallest is " + smallest);

    }
}

