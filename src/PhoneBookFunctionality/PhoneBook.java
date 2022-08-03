package PhoneBookFunctionality;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBook {
    private ArrayList<Contact> myArray = new ArrayList<>();

    public PhoneBook() {

        myArray = new ArrayList<>();

    }

    public boolean isEmpty() {
        return myArray.isEmpty();
    }

    public void addNewContact(Contact newContact1) {
        myArray.add(newContact1);
    }

    public Contact getContact(int index) {

        return myArray.get(index);
    }

    public int getSize() {
        return myArray.size();
    }

    public void deleteContact(Contact contact) {
        myArray.remove(contact);
    }


    public ArrayList<Contact> getAllContact() {
        return myArray;
    }

    public Contact searchContact(String info) {
        for (int i = 0; i < myArray.size() ; i++) {
            if (Objects.equals(myArray.get(i).getName(), info)) {
                return myArray.get(i);
            }
                if(Objects.equals(myArray.get(i).getPhoneNumber(), info)){
                    return myArray.get(i);

            }
        }
        return null;
    }
}







