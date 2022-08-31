package Chapter2DietelExercise;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int secondInteger = scanner.nextInt();

        System.out.println("Enter the third integer: ");
        int thirdInteger = scanner.nextInt();

        System.out.println("Enter the fourth integer: ");
        int fourthInteger = scanner.nextInt();

        System.out.println("Enter the fifth integer: ");
        int fifthInteger = scanner.nextInt();

        if( firstInteger > secondInteger && firstInteger > thirdInteger  && firstInteger > fourthInteger && firstInteger > fifthInteger){
            System.out.println("First integer is the largest which is: " + firstInteger);
        }
        if(secondInteger > firstInteger && secondInteger > thirdInteger && secondInteger > fourthInteger && secondInteger > fifthInteger){
            System.out.println("Second integer is the largest which is: " + secondInteger);
        }
        if(thirdInteger > firstInteger && thirdInteger > secondInteger && thirdInteger > fourthInteger && thirdInteger > fifthInteger){
            System.out.println("Third integer is the largest which is: " + thirdInteger);
        }
        if(fourthInteger > firstInteger && fourthInteger > secondInteger && fourthInteger > thirdInteger && fourthInteger > fifthInteger){
            System.out.println("Fourth integer is the largest which is: " + fourthInteger);
        }
        if(fifthInteger > firstInteger && fifthInteger > secondInteger && fifthInteger > thirdInteger && fifthInteger > fourthInteger){
            System.out.println("Fifth integer is the largest which is: " + fifthInteger);
        }

        if( firstInteger < secondInteger && firstInteger < thirdInteger  && firstInteger < fourthInteger && firstInteger < fifthInteger){
            System.out.println("First integer is the smallest which is: " + firstInteger);
        }


        if(secondInteger < firstInteger && secondInteger < thirdInteger && secondInteger < fourthInteger && secondInteger < fifthInteger){
            System.out.println("Second integer is the smallest which is: " + secondInteger);
        }
        if(thirdInteger < firstInteger && thirdInteger < secondInteger && thirdInteger < fourthInteger && thirdInteger < fifthInteger){
            System.out.println("Third integer is the smallest which is: " + thirdInteger);
        }

        if(fourthInteger < firstInteger && fourthInteger < secondInteger && fourthInteger < thirdInteger && fourthInteger < fifthInteger){
            System.out.println("Fourth integer is the smallest which is: " + fourthInteger);
        }

        if(fifthInteger < firstInteger && fifthInteger < secondInteger && fifthInteger < thirdInteger && fifthInteger < fourthInteger){
            System.out.println("Fifth integer is the smallest which is: " + fifthInteger);
        }











    }
}
