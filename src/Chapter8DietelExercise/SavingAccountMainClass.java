package Chapter8DietelExercise;

public class SavingAccountMainClass {
    public static void main(String[] args) {
        SavingAccount savingAccount1 = new SavingAccount(2000.00);
        SavingAccount savingAccount2 = new SavingAccount(3000.00);
        SavingAccount.setAnnualInterestRate(0.4);
      //  SavingAccount.modifyInterestRate(0.4);
        System.out.println("" + savingAccount1.calculateMonthlyInterest());
       // System.out.println("" + SavingAccount;
    }


}
