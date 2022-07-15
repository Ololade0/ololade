package Pratice;

import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] array1 = new int [25];
//
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = i * 10;
//           // System.out.println("Element of index "  + i + " , result is " + array1[i]);
//        }
//        printArray(array1);
//    }
//
//    public static void printArray(int[] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element is " + i + ", " +
//                    "value is "+ array[i]);
//
//        }


        int[] myArray = getIntegers(5);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("The element is " + i + "the value of " + myArray[i]);

        }
      //  System.out.println();
    }
    public static int[] getIntegers(int numbers) {
        System.out.println("Enter number " + numbers);
        int[] values = new int[numbers];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }
        return values;
    }

    }

