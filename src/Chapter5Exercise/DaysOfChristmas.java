package Chapter5Exercise;

import java.util.Scanner;

public class DaysOfChristmas {
   static Scanner scanner = new Scanner(System .in);
    public static void main(String[] args) {

        System.out.println("""
     First day of Christmas
     Second day of Christmas
     Third day of Christmas
     Fourth day of Christmas
     Fifth day of Christmas
     Sixth day of Christmas
     Seventh day of Christmas
     Eight day of Christmas
     Ninth day of Christmas
     Tenth day of Christmas
     Eleventh day of Christmas
     Twelve day of Christmas
                            """);
        String daysOfChristmas = scanner.next();
        switch (daysOfChristmas){
            case "A" -> {
                System.out.println(" First day of Christmas");
                String firstDay = scanner.nextLine();
            }

            case "B" -> {
                System.out.println("second day of Christmas");
                String secondDay = scanner.nextLine();
            }

            case "C" -> {
                System.out.println("Third day of Christmas");
                String thirdDay = scanner.nextLine();
            }

            case "D" -> {
                System.out.println("Fourth day of Christmas");
                String fourthDay = scanner.nextLine();
            }
            case "E" -> {
                System.out.println("Fifth day of Christmas");
                String fifthDay = scanner.nextLine();
            }
            case "F" -> {
                System.out.println("sixth day of Christmas");
                String sixthDay = scanner.nextLine();
            }

            case "G" -> {
                System.out.println("seventh day of Christmas");
                String seventhDay = scanner.nextLine();
            }
            case "H" -> {
                System.out.println("Eigth day of Christmas");
                String eightDay = scanner.nextLine();
            }
            case "I" -> {
                System.out.println("ninth day of Christmas");
                String ninthDay = scanner.nextLine();
            }
            case "J" -> {
                System.out.println("Tenth day of Christmas");
                String tenthDay = scanner.nextLine();
            }

            case "K" -> {
                System.out.println("Eleventh day of Christmas");
                String eleventhDay = scanner.nextLine();
            }

            case "L" -> {
                System.out.println("Twelve day of Christmas");
                String twelveDay = scanner.nextLine();
            }
        }



    }
}
