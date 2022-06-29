package UdemyChallenge;

public class VipCustomers {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomers(){
      //  System.out.printf("" + getName(), getCreditLimit(), getCreditLimit());

    }

   public VipCustomers(String name, double creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
//        this("Ololade", 30.0);
     //  System.out.printf("" + getName(), getCreditLimit(), getCreditLimit());
    }

    public VipCustomers(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
      //  System.out.printf("" + getName(), getCreditLimit(), getCreditLimit());
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
