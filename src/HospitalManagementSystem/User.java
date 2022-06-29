package HospitalManagementSystem;

import java.util.ArrayList;

public class User {

    private final String name;
    private ArrayList<Records> myUser;

    public User(String name){
        this.name = name;
        myUser = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void addNewRecord(Records newRecord) {
        myUser.add(newRecord);
    }

    public ArrayList<Records> getAllRecord() {
        return myUser;
    }
}
