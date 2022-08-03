package PhoneBookFunctionality;

public class Contact {

    private String phoneNumber;
    private String name;
    private String address;
    private String emailAddress;



    public Contact(String name, String number) {
        this.name = name;
        this.phoneNumber = number;
        this.address = "";
        this.emailAddress = "";
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

@Override
    public String toString() {
        return String.format("""
                 contactName : %s
                 contact Address : %s
                 Email Address : %s
                 contact Number: %s
                 
                 """,getName(), getAddress(), getEmailAddress(), getPhoneNumber());
    }


}
