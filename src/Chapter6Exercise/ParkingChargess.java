package Chapter6Exercise;

import java.util.Scanner;

public class ParkingChargess {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            int count = 0;

            while(count <= 3) {

                System.out.println("Enter hours parked: ");
                int hours = input.nextInt();

                count++;

            }

        System.out.println("The charges for customer is " + calculateCharges());
    }

    public static double calculateCharges() {
        double maximumCharge = 10.00;
        double minimumCharges = 2.00;
        double additionalChargesPerHour = 0.50;
        int hours = 0;
        double charges = 0.0;
        double maximumHour = 24.0;
        double minimumHour = 3.0;
        double minimumCharge = 2.00;
        if (hours <= minimumHour) {
            charges = minimumCharge;
        }
        if (hours <= maximumHour && hours > minimumHour) {
            charges = additionalChargesPerHour * hours - minimumHour + maximumHour;
            if (hours == maximumHour) {
                charges = maximumCharge;
//
            }

        }
        return charges;
    }
}
