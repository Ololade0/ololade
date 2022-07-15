//package ClassActivities;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class DivideByZeroWithException {
//    public static int quotient(int numerator, int denominator)
//            throws ArithmeticException {
//        return numerator / denominator;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        boolean continueLoop = true;
//
//        do {
//            try {
//                System.out.println("pls enter an integer numerator ");
//                int numerator = input.nextInt();
//                System.out.println("pls enter an integer denominator ");
//                int denominator = input.nextInt();
//
//                int result = quotient(numerator, denominator);
//                System.out.printf("%nResult: %d / %d = %d%n ", numerator, denominator, result);
//                continueLoop = false;
//            }
//            catch (InputMismatchException inputMismatchException){
//                System.out.printf("%nException:  %s%n",
//                 inputMismatchException);
//
//                Scanner.nextLine();
//                System.out.printf("you must enter integers, pls try again,%n%n");
//            }
//
//            catch (ArithmeticExceptionException)
//        }
//    }
