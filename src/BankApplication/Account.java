package BankApplication;

import java.util.Objects;

public class Account {

    private String accountName;
    private Customer customer;
    private Bank bank;

    private int balance;
    private String accountNumber;
    private String pin;


    public Account(String accountName, String accountNumber, String pin) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountName(String accountName)
    {
        this.accountName = accountName;
    }

    public String getPin(String pin) {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAccountName() {
        return accountName;
    }


    public void addAccountDetails(Account account) {
        account.addAccountDetails(account);
    }


    public int deposit(int amount) {
        if(amount > 0){
            balance+=amount;
        }
        else {
            System.out.println("Invalid amount");
        }

        return amount;
    }


    public int getBalance(String pin) {
        int mainBalance = 0;
        if (Objects.equals(pin, this.pin)) {
            mainBalance+= balance;
        }
        else {
            System.out.println("Wrong Pin, Kindly enter the correct PIN");
            mainBalance = 0;
        }
        return mainBalance;

    }

    public void withdraw(int money, String pin) {
        if (pin.equals(this.pin)) {
            if (money < 0) {
                System.out.println("Invalid Amount");
            }
            if (money > 0) {
                if (money <= balance) {
                    balance = balance - money;
                }

            }

                else {
                    System.out.println("Balance exceeded");
                }

        }
    }


    public void transfer(int fund, Account account, String pin) {
        this.withdraw(fund, pin);
        account.deposit(fund);

    }

    @Override
    public String toString(){
        return String.format("""
                Account Name : %s
                Account Balance : %d
                Account Number " %s
                Account Pin : %s
                """, getAccountName(), getBalance("1234"),
                getAccountNumber(), getPin("1234"));
    }
}




