package Chapter6DietelExercise;

import java.util.Scanner;

public class isDivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 10) {
            System.out.println("Enter an integer");
            int integer = scanner.nextInt();
            count++;


            System.out.println("" + Divisible(integer));

        }
    }

    public static boolean Divisible(int integer){
        return integer % 5 == 0;

    }
}
