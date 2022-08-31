package Chapter2DietelExercise;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int firstInteger = scanner.nextInt();

        if(firstInteger % 3 == 0){
            System.out.println("It is divisible by 3");
        }

        else{
            System.out.println("It is not divisible by 3");
        }
    }
}
