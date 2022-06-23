package CodeWar;

import java.util.Scanner;
public class BetterThanAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum = 0;
        int average = 0;


        System.out.println("Enter my score");
        int myScore = input.nextInt();

        int[] scores = {10, 90, 10, 40, 50, 20, 10, 40, 30, 20};

        for (int i = 0; i < scores.length ; i++) {
            sum+=scores[i] ;
        }

        average = sum / scores.length;

        System.out.println("The sum is "+ sum);
        System.out.println("The average is " + average);


        if(myScore > average){
            System.out.println("It is True, i am better than the average student");
        }

        else {
            System.out.println("It is False, i am not better than the average student");
        }
    }
}
