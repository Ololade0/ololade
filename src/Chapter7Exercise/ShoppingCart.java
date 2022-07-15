package Chapter7Exercise;


import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Date date = new Date();
        Scanner input = new Scanner(System.in);
        ShoppingInvoice invoice = new ShoppingInvoice();

        System.out.println("What is the customer's name: ");

        String customersName = input.nextLine();
        String addItem = "yes";
        int counter = 0;
        double subtotal = 0.0;
        while (Objects.equals(addItem, "yes")) {

            System.out.println("What did user buy?: ");
            String user = input.nextLine();
            invoice.addItem(user, counter);

            System.out.println("How many pieces?: ");
            int pieces = input.nextInt();
            invoice.addQuantity(pieces, counter);

            System.out.println("How much per unit: ");
            int unit = input.nextInt();
            input.nextLine();
            invoice.addPrice(unit, counter);

            System.out.println("Add more items? yes or no: ");
            addItem = input.nextLine();


            counter++;
        }

        System.out.println("What is cashiers name: ");
        String cashierName = input.nextLine();

        System.out.println("How much discount will he get: ");
        double discount = input.nextDouble();

        for (int i = 0; i < counter; i++) {
            subtotal += invoice.total(i);
        }

        discount = 2.0;
        double discountAmount = 0.0;
        for (int i = 0; i < counter; i++) {
            discountAmount = discount / 100 * subtotal;
        }
        double vat = 0.0;
        double vatAmount = 17.5;
        for (int i = 0; i < counter; i++) {
            vat = vatAmount / 100 * subtotal;
        }
        double billTotal = 0.0;
        for (int i = 0; i < counter; i++) {
            billTotal = subtotal - discountAmount + vat;

        }


        System.out.printf("""
                 SEMICOLON STORES
                 MAIN BRANCH
                 LOCATION: 312,HERBERT MACAULAY WAY, SABO YABA,LAGOS.
                 DATE : %s
                 TEL: 03293828343
                 Cashier: %s
                 Customer Name: %s
                 ================================================================================================

                                              ITEM     QTY       PRICE     TOTAL(NGN)
                 ======================================================================================================

                """, date, cashierName, customersName);


        for (int i = 0; i < counter; i++) {
            System.out.printf("%30s%11d%12.2f%17.2f%n", invoice.getItem(i), invoice.getQuantity(i), invoice.getPrice(i), invoice.total(i));
        }
        System.out.println("==========================================================================================");

        System.out.printf("%60s%20.2f%n", "Subtotal : ", subtotal);
        System.out.printf("%60s%20.2f%n", "Discount :", discountAmount);
        System.out.printf("%60s%18.2f%n", "VAT@17.50percent:", vat);
        System.out.println("=========================================================================================+");
        System.out.printf("%50s%20.2f%n", "Bill Total:", billTotal);
        System.out.println("=========================================================================================+");
        System.out.printf("               THIS IS NOT AN RECEIPT KINDLY PAY %.2f\n", billTotal);
        System.out.println("==========================================================================================");


        System.out.println("How much did customer give to you: ");
        double amountPaid = input.nextDouble();

        double balance = amountPaid - billTotal;



            System.out.println("==========================================================================================");
            System.out.printf("%60s %20.2f%n", "Subtotal:", subtotal);
            System.out.printf("%60s %20.2f%n", "Discount:", discountAmount);
            System.out.printf("%60s %18.2f%n", "VAT@17.50percent:", vat);
            System.out.println("==========================================================================================");
            System.out.printf("%60s %20.2f%n", "Bill Total:", billTotal);
            System.out.printf("%60s %20.2f%n", "Amount paid:", amountPaid);
            System.out.printf("%60s %20.2f%n", "Balance:", balance);
            System.out.println("==========================================================================================");
            System.out.println("                               THANK YOU FOR YOUR PATRONAGE");
            System.out.println("==========================================================================================");




    }

    }













