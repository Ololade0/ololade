package Chapter3DietelExercise;

public class ModifiedAccountTest {
    public static void main(String[] args) {
        ModifiedAccount modifiedAccount = new ModifiedAccount();
        modifiedAccount.setBalance(7000);
        modifiedAccount.deposit(6000);

        System.out.println(modifiedAccount.getBalance());
        System.out.println(modifiedAccount.withdraw(4000));


    }
}
