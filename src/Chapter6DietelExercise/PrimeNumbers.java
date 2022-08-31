package Chapter6DietelExercise;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enteer number");
        int number = scanner.nextInt();
     //   int number = 0;
        isPrime(number);




    }

    public static void isPrime(int number) {
        for (int i = 0; i < number; i++) {
        if (number % 1 == 0 && number % number == 0) {
            int result = i /  number;
            // System.out.println("It is a prime number" + i);
            System.out.println("It is a prime number" + result);

        } else {
            System.out.println("It is not a prime number");
        }
        }
       // return number(i);
    }

}
