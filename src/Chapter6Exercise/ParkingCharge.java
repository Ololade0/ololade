//package Chapter6Exercise;
//
//import java.util.Scanner;
//
//public class ParkingCharge {
//    public static double main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        double maximumCharges = 10.00;
////        double minimumCharges = 2.0;
////        double maxHour = 24.0;
////        double minHour = 3.0;
////        double perHour = 0.50;
//        int count = 1;
//        double total = 0.0;
//        double time;
//        double charges;
//
//        while (count <= 3) {
//            System.out.println("Enter hours parked: ");
//            double hourParked = input.nextInt();
//            count++;
//            while ( hourParked > 0.0) {
//            time = calCulateCharges(hourParked);
//         //   total+=charges;
//
//            }
//
//        }
//      //  return
//    }
//        public static double calCulateCharges(double hourParked){
//            double maximumCharges = 10.00;
//            double minimumCharges = 2.0;
//            double maximumHour = 24.0;
//            double minimumHour = 3.0;
//            double perHour = 0.50;
//            double charges = 0;
//            if (hourParked <= minimumHour) {
//                charges = minimumCharges;
//            }
//
//            if (hourParked > maximumHour && hourParked > minimumHour) {
//                charges = perHour * hourParked - minimumHour + maximumHour;
//                if (hourParked == maximumHour) {
//                    charges = maximumCharges;
//
//                }
//            }
//            return charges;
//        }
//
//}
//
