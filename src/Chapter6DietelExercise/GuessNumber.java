package Chapter6DietelExercise;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int guessNumber = 900;
        System.out.println("Guess a number between 1 to 1000: ");
        int number = input.nextInt();
        if (number != guessNumber) {
            System.out.println("Wrong guess, kindly enter the next guess");
        }
        while (number != guessNumber) {
            System.out.println("Enter the next guess a number between 1 to 1000: ");
            int guess = input.nextInt();

            if (guess > guessNumber) {
                System.out.println("Too high, try again");
            } else if (guess < guessNumber) {
                System.out.println("Too low, try again");
            }

            if (guess == guessNumber) {
                System.out.println("Congratulations, you guessed the number");
                System.out.println("Enter number to play again");
                int again = input.nextInt();
//////////////////////////////////////////////////////////////////////////////////////////////
                if (again > guessNumber) {
                    System.out.println("Too high, try again");
                } else if (again < guessNumber) {
                    System.out.println("Too low, try again");
                }

                if (again == guessNumber) {
                    System.out.println("Congratulations, " +
                            "you guessed the number");
                    count++;

                } else {
                    System.exit(0);
                   // count++;
                }
            }
        }
    }
}


//



