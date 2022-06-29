package Chapter5Exercise;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of the base");
        int length = input.nextInt();

        //System.out.println("Enter length of the base");
        for (int row = 1; row <= length ; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.println(" * ");

            }
          for (int j = row; j <= 10; j++) {
                System.out.println(" ");
           }
            System.out.println();

        }
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row ; column++) {
                System.out.println(" ");
            }

            for (int column = row; column <= 10 ; column++) {
                System.out.println(" ");
            }
            System.out.println("*");

        }
    }
}


//for (int row = 1; row <= 10; row++) {
//        for (int column = 1; column <= row; column++) {
//        System.out.print(" * ");
//        }
//
//        for (int column = row; column <= 10; column++) {
//        System.out.print("  ");
//        }
//        System.out.println();
//        }