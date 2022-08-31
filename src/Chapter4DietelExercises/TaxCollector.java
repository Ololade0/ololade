package Chapter4DietelExercises;


import java.util.Scanner;

public class TaxCollector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int count = 0;
        int total = 0;
        int taxRate = 0;


        while (count != 3) {
            System.out.println("Enter first citizens name: ");
            String firstCitizenName = input.nextLine();

            System.out.println("Enter citizens earning: ");
            int firstCitizenEarning = input.nextInt();
            input.nextLine();
            count++;

            if (firstCitizenEarning <= 30000) {
               taxRate = firstCitizenEarning * 15/ 100;

            }
            else {
                taxRate = firstCitizenEarning * 20 / 100;
            }
           total = total + taxRate;
        }

        System.out.println("Total tax for all citizen is " + total);







        }
    }


