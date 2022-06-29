package UdemyChallenge;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(010, "oLOLADE" , "ade@gmail.com","08109093828");
       // bank.withdraw(100);


        bank.deposit(50.00);
        bank.withdraw(100.00);
       // System.out.println(bank);
//
        bank.deposit(51.00);
        bank.withdraw(100.00);
        System.out.println("Thank you for banking with us");
    }
}
