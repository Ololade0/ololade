package Estore;

import java.util.ArrayList;

public class Customers extends User{


    private ArrayList<BillingInformation> billing = new ArrayList<>();

        private ArrayList<ShoppingCart> cart = new ArrayList<>();


    public Customers(String name, int age, String emailAddress, String homeAddress, String password, String phoneNumber) {
        super(name, age, emailAddress, homeAddress, password, phoneNumber);
    }


}
