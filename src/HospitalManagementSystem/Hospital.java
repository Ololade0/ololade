package HospitalManagementSystem;

import java.util.ArrayList;

public class Hospital {
    private String hospitalName;
    private String hospitalLocation;

    private ArrayList<Doctor> myDoctors;
    private ArrayList<BodyTest> myTest;


    public Hospital(String hospitalName, String hospitalLocation){
        this.hospitalName = hospitalName;
        this.hospitalLocation = hospitalLocation;
        this.myDoctors = new ArrayList<>();
        this.myTest = new ArrayList<>();

    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }


    public void addNewDoctors(Doctor newDoctor) {
        myDoctors.add(newDoctor);

    }

    public ArrayList<Doctor> getMyDoctors() {
        return myDoctors;
    }


    public void addNewTest(BodyTest newBloodTest) {
        myTest.add(newBloodTest);
    }

    public boolean getAddedNewTest(String typeOfBloodTestName) {
        for (BodyTest bloodTest : myTest) {
            if (bloodTest.getTypeOfBloodTestName().equals(typeOfBloodTestName))
                return true;
        }
        return  false;
    }

    public ArrayList<BodyTest> getAllNoOfTest() {
        return myTest;
    }
}
