package Pratice;

public class CommissionEmployee {

    private String firstName;

    private String lastName;

    private int socialSecurityNumber;

    private int grossSales;

    private int commissionRate;

    public CommissionEmployee(String firstName, String lastName, int socialSecurityNumber, int grossSales, int commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        if(grossSales < 0);
       // throw new illegalArgumentException();
        this.grossSales = grossSales;
        if(commissionRate < 0);
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }


    public int getGrossSales() {
        return grossSales;
    }


    public int getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public  int earning(){
        return commissionRate * grossSales;
    }
//    @Override
//    public String toString(){
//        return  String.format("%s: %s %s%n%s: %s%n%s: %d%n%s: %d\", \n" +
//                " \"commission employee\", firstName, lastName, \n" +
//                " \"social security number\", socialSecurityNumber, \n" +
//                " \"gross sales\", grossSales, \n" +
//                " \"commission rate\", commissionRate); \n" +
//                "}");
//    }


}

