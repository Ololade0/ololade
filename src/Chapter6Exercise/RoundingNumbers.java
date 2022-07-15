package Chapter6Exercise;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();


        System.out.println("Enter third number: ");
        double thirdNumber = scanner.nextDouble();

        System.out.println("Enter fourth number: ");
        double fourthNumber = scanner.nextDouble();

        System.out.println("Enter fifth number: ");
        double fifthNumber = scanner.nextDouble();

     double firstFloorNumber =  Math.floor(firstNumber);
        System.out.println("The original number is " + firstNumber);
        System.out.println("The rounded number is " + firstFloorNumber);



        double secondFloorNumber =  Math.floor(secondNumber);
        System.out.println("The original number is " + secondNumber);
        System.out.println("The rounded number is " + secondFloorNumber);


        double thirdFloorNumber =  Math.floor(thirdNumber);
        System.out.println("The original number is " + thirdNumber);
        System.out.println("The rounded number is " + thirdFloorNumber);


        double fourthFloorNumber =  Math.floor(fourthNumber);
        System.out.println("The original number is " + fourthNumber);
        System.out.println("The rounded number is " + fourthFloorNumber);


        double fifthFloorNumber =  Math.floor(fifthNumber);
        System.out.println("The original number is " + fifthNumber);
        System.out.println("The rounded number is " + fifthFloorNumber);


    }
    }



