package Chapter6Exercise;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        isLeapYear(year);
    }

    private static boolean isLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("It is a leap year");
        }

        else {
            System.out.println("It is not a leap year");
        }
        return true;

    }
}
