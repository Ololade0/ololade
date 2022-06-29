package Chapter5Exercise;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximum = 0;
        int minimum = 0;
       // int count = 0;
        for (int count = 0; count <=10; count++) {
            System.out.println("Enter an integer");
            int integer = input.nextInt();
           // maximum = maximum + integer;
            if(maximum > integer ){
                maximum = integer;
            }

            System.out.println("" + maximum);

        }
    }
}