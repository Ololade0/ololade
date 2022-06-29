package CodeWar;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("Even");
        }

        else {
            System.out.println("Odd Number");
        }
    }
}
