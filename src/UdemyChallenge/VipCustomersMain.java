package UdemyChallenge;

public class VipCustomersMain {
    public static void main(String[] args) {

        VipCustomers customers = new VipCustomers();
        System.out.println(customers.getName());

        VipCustomers vip = new VipCustomers("Ololade", 40.0);
        System.out.println(vip.getName());
        System.out.println(vip.getCreditLimit());



        VipCustomers v = new VipCustomers("Ololade", 40.0, "adesuyiOlolade@gmail.com");
        System.out.println(vip.getName());
        System.out.println(vip.getCreditLimit());
        System.out.println(vip.getEmailAddress());



    }
}
