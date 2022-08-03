package PhoneBookFunctionality;
//import java.util.Objects;

import java.util.ArrayList;
import java.util.Objects;

public class User {

    private final String userName;
    private final String password;
    private PhoneBook phoneBook;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        phoneBook = new PhoneBook();
    }


    public String getPassword() {
        return password;

    }

    public PhoneBook getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }


    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return password;
    }

    public boolean checkPassword(String password) {
        return Objects.equals(this.password, password);
    }


    public void addNewContact(Contact contact1) {
        phoneBook.addNewContact(contact1);

    }


    public void deleteContact(Contact contact2) {
        phoneBook.deleteContact(contact2);
    }



    public Contact searchContact(String info) {
        for (int i = 0; i < phoneBook.getSize(); i++) {
            if (Objects.equals(phoneBook.getContact(i).getName(), info)) {
                return phoneBook.getContact(i);
            }
            if (Objects.equals(phoneBook.getContact(i).getPhoneNumber(), info)) {
                return phoneBook.getContact(i);
            }
        }
        return null;
    }

    public Contact getContact(String info) {
        return phoneBook.searchContact(info);
    }


    public ArrayList<Contact> getAllContacts() {
        return phoneBook.getAllContact();
    }
}

