package UdemyChallenge;

public class BankAccount {
    private int accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;
    private static double balance = 0.0 ;

    public void  deposit(double fund){
        this.balance+=fund;
        System.out.println("new balance  is "+ balance);
    }

    public void withdraw(double money) {
       // this.balance-= money;
        if (balance < 0.0 || money > balance) {
            System.out.println("No insuffiecent balance");
        }
        else {
            balance -= money;
            System.out.println("transaction succeded");
        }
        System.out.println("Balance available is " + balance);
        //
    }

    public BankAccount(int accountNumber, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("" + accountNumber);
        System.out.println("" + customerName);
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   public void balance(int money) {
        this.balance = money;
    }

    public double getBalance(){
        return balance;

    }


    @Override
    public String toString(){
        return String.format("%d%n%s%n%s%n%s%n", accountNumber,customerName,email,phoneNumber);
    }


}
