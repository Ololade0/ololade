package Chapter8DietelExercise;

public class SavingAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){
     double monthlyInterest = savingsBalance * annualInterestRate / 12;
        return monthlyInterest + savingsBalance;
    }

    public static void modifyInterestRate(double annualInterestRate){
         setAnnualInterestRate(annualInterestRate);
    }
}
