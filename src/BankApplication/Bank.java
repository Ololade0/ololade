package BankApplication;

//import DataStructureAndAlgorith.ArrayList;

import java.util.ArrayList;

public class Bank {

    private final String bankName;
    private final String bankBranch;
    private ArrayList<Customer> customerList = new ArrayList();
    private ArrayList<Account> accounts = new ArrayList();

    public Bank(String bankName, String bankBranch) {
        this.bankName = bankName;
        this.bankBranch = bankBranch;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);

    }


//    public Customer viewCustomer(String name) {
//        for (int i = 0; i < customerList.size(); i++) {
//            if(customerList.get(i).getFirstName() == name){
//              return customerList.get(i);
//            }
//
//        }
//        return null;
//
//    }

    public int numberOfAccounts() {
        return accounts.size();
    }

    public int numberOfCustomers() {
        return customerList.size();
    }

    public void closeAccount(Account account) {
        for (int i = 0; i < accounts.size() ; i++) {
            if(accounts.get(i) == account){
                accounts.remove(account);
                customerList.get(i).closeAccount(account);
                Customer customer = customerList.get(i);
                customerList.remove(i);
            }

        }
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account viewAccount(int index) {
        return accounts.get(index);
    }

    public Customer viewCustomer(int index) {
        return customerList.get(index);
    }



}





