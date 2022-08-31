package Chapter6DietelExercise;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter an integer");
        int firstInteger = scanner.nextInt();


        System.out.println("Enter an integer");
        int secondInteger = scanner.nextInt();


        System.out.println("Enter an integer");
        int thirdInteger = scanner.nextInt();


        System.out.println("Enter an integer");
        int fourthInteger = scanner.nextInt();
        System.out.println("The sum is " + sum(firstInteger,secondInteger,thirdInteger,fourthInteger));

    }



    public static int sum(int firstInteger, int secondInteger, int thirdInteger, int fourthInteger){
        return firstInteger + secondInteger + thirdInteger + fourthInteger;

    }
}
