package Chapter4Exercises;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = input.nextInt();


        System.out.println("Enter balance at the beginning of the month: ");
        int beginningBalance = input.nextInt();

        System.out.println("Enter total of all items charged : ");
        int totatlItems = input.nextInt();

        System.out.println("Enter total of all credits applied: ");
        int totalCredits = input.nextInt();

        System.out.println("Enter allowed credit limit: ");
        int creditLimits = input.nextInt();


        int newBalance = beginningBalance + totatlItems - totalCredits;
        System.out.println("The new balance is " + newBalance);

        if(newBalance > creditLimits ){
            System.out.println("credit limit is  exceeded");

        }

        else {
            System.out.println("Credit limit is not exceeded");
        }




    }
}
