import java.util.Scanner;

public class InvestmentAmount{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        double interestRate = annualRate / 100;

        double monthlyInterestRate = Math.pow (1 + interestRate, numberOfYears);
        double futureInvestmentValue  = investmentAmount * monthlyInterestRate;
        System.out.printf("Accumulated Value is %.2f", futureInvestmentValue);

    }
}

