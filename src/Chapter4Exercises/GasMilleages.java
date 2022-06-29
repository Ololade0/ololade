package Chapter4Exercises;

import java.util.Scanner;

public class GasMilleages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
     //   int milesDriven = 0;
        int milesPerGallon = 0;

        System.out.println("Enter miles driven: ");
      int  milesDriven = input.nextInt();
        while (milesDriven != -1) ;
        System.out.println("Enter gallon used: ");
        int gallonUsed = input.nextInt();
        milesPerGallon = (int) (milesDriven / gallonUsed * 4.544);

        count++;


        System.out.println("" + milesPerGallon);
    }





    }

