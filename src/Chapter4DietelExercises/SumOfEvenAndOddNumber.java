package Chapter4DietelExercises;

import java.util.Scanner;

public class SumOfEvenAndOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int total = 0;
        while (count < 10) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            count++;

            if (number % 2 == 0){
                 sum = sum + number;
            }

            if(number % 2 != 0){
              total = total + number;
            }

        }
        System.out.println("The sum of even number is " +sum);
        System.out.println("The total of odd number is " + total);
    }
}
