package CodeWar;

import java.util.Scanner;

public class SumSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int square = 2;

        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();


        System.out.println("Enter third number: ");
        int thirdNumber = input.nextInt();

        System.out.println("Enter fourth number: ");
        int fourthNumber = input.nextInt();

        int squareFirstNumber = firstNumber * firstNumber;
       // System.out.println("" + squareFirstNumber);

        int squareSecondNumber = secondNumber * secondNumber;
       // System.out.println("" + squareSecondNumber);

        int squareThirdNumber = thirdNumber * thirdNumber;
       // System.out.println("" + squareFirstNumber);

        int squareFourthNumber = fourthNumber * fourthNumber;

        int sum = squareFirstNumber + squareSecondNumber + squareThirdNumber + squareFourthNumber;
        System.out.println("The sum is "+ sum);
    }


}
