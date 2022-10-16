package Chapter3DietelExercise;

public class ModifiedAccount {
    private int balance;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;


    }

    public int withdraw(int amountWithdraw) {
        if(balance > amountWithdraw) {
            return balance - amountWithdraw;

        }
        if(balance < amountWithdraw){
            throw new RuntimeException("Withdarwal ");

        }
        return balance;

    }

    public int deposit(int money){
        balance = balance + money;
        return balance;
    }
}