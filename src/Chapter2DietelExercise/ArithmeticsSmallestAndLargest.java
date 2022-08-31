package Chapter2DietelExercise;

import java.util.Scanner;

public class ArithmeticsSmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int secondInteger = scanner.nextInt();

        System.out.println("Enter the Third integer: ");
        int thirdInteger = scanner.nextInt();

        int sum = firstInteger + secondInteger + thirdInteger;
        System.out.println("The sum of the integer is:" + sum);

        int average = sum / 3;
        System.out.println("The average is: " + average);

        int product = firstInteger * secondInteger * thirdInteger;
        System.out.println("The product is " + product);

        if(firstInteger > secondInteger && firstInteger > thirdInteger){
            System.out.println("First integer is the largest which is: " + firstInteger);
        }


        if(secondInteger > firstInteger && secondInteger > thirdInteger){
            System.out.println("second integer is the largest which is: " + secondInteger);
        }

        if(thirdInteger > firstInteger && thirdInteger > secondInteger){
            System.out.println("Third integer is the largest which is: " + thirdInteger);
        }

        if(firstInteger < secondInteger && firstInteger < thirdInteger){
            System.out.println("First integer is the smallest which is: " + firstInteger);
        }


        if(secondInteger < firstInteger && secondInteger < thirdInteger){
            System.out.println("second integer is the smallest which is: " + secondInteger);
        }

        if(thirdInteger < firstInteger && thirdInteger < secondInteger){
            System.out.println("Third integer is the smallest which is: " + thirdInteger);
        }

    }

}

