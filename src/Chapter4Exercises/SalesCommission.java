package Chapter4Exercises;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        double commision = 0;
        double earnings = 0;



        System.out.println("Enter salesPersons item: ");
        double item = input.nextDouble();

        while (item != -1) {

            commision = item * 0.09 / 100;
            earnings = commision + 200;


            System.out.println("Enter salesPersons item: ");
            item = input.nextDouble();


           // System.out.println("" + commision);
            System.out.println("" + earnings);
        }
    }

    }

