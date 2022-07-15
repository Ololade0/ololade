package Estore;

public class User {

    private String name;
    private int age;
    private String emailAddress;

    private String homeAddress;
    private String password;
    private String phoneNumber;

    public User(String name, int age, String emailAddress, String homeAddress, String password, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }




    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
