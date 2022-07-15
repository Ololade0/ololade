package Pratice;

import java.util.Scanner;

public class ArrayChallenge {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] array = getIntegers(5);
        for (int i = 0; i < array.length; i++) {
            System.out.println("The element of index "  + array[i]);
        }
    }

        public static int[] getIntegers(int numbers){
            System.out.println("Enter number " + numbers);
            int[] values = new int[numbers];

            for (int i = 0; i < values.length; i++) {
             values[i]= scanner.nextInt();
            }

            return values;

        }
        


}
