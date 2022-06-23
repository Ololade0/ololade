package CodeWar;

import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int totalFor7Days = 1;
      //  int priceFor3Days = 1;

        System.out.println("Enter rentage price$ per day: ");
        int pricePerDay = input.nextInt();

        System.out.println("Enter 7 days");
        int sevenDays = input.nextInt();

        System.out.println("Enter 3 days");
        int threeDays = input.nextInt();

        System.out.println("Enter discount for 7 days ");
        int discount7 = input.nextInt();

        System.out.println("Enter discount for 7 days ");
        int discount3 = input.nextInt();


       int totalFor7Days =  pricePerDay * sevenDays  - discount7;
      //
        int totalFor3Days =  pricePerDay * threeDays - discount3;

        System.out.println("" + totalFor3Days );
        System.out.println(""+ totalFor7Days);

    }
}
