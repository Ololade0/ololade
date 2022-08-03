package BankApplication;

import java.util.ArrayList;

public class Customer {

    private final String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private int age;
    private String phoneNumber;
    private String emailAddress;
    private String homeAddress;
    private String dateOfBirth;
    private String monthOfBirth;
    private String yearOfBirth;
   private ArrayList<Account> myAccount = new ArrayList<>();


    public Customer(String firstName,  String lastName,
                    String gender, int age, String phoneNumber,
                    String homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    }

    public void setFirstName(String firstName) {
    }
    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;

    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(String  yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String displayBirthHistory() {
        return String.format("%3s/%4s/%s", getDateOfBirth(), getMonthOfBirth(), getYearOfBirth());
    }




   // public Account getMyAccount(int number) {
      //  return myAccount[number-1];
   //}

    public void closeAccount(Account account) {
        for (int i = 0; i < myAccount.size(); i++) {
            if (myAccount.get(i) == account) {
                myAccount.get(i).setAccountName(null);
                myAccount.get(i).setAccountNumber(null);
                break;

                // myAccount.get(i) = null;
            }




//        for (int i = 0; i < myAccount.length; i++) {
//            if(myAccount[i] == accountt){
//                myAccount[i].setAccountName(null);
//                myAccount[i] = null;
//                break;

            else {
                System.out.println("No Account found");
            }

        }
         }



}
