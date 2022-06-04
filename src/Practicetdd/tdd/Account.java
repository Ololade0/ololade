package tdd;

public class Account {
    private int balance;
    public int getBalance() {

        return balance;
    }

    public double deposit(int amount) {

        balance = balance + amount;
        return 0;
    }

    public void withdraw(int amount) {
        if(balance - amount >= 0) {

        balance = balance - amount;}

    }
}
