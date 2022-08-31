package Chapter4DietelExercises;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int integer = 0;

        while (integer >= count) {
            System.out.print("Enter an integer: ");
            integer = input.nextInt();
            if(integer == 1 || integer == 2){
                break;
            }



        }

    }
}





