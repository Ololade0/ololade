package HospitalManagementSystem;

import java.util.ArrayList;

public class Records {

    private final String name;

    private final ArrayList<BodyTest> myrecord;
    private final ArrayList<Doctor>docs;
    private final ArrayList<Hospital> myHospital;

    public Records(String name){
        this.name = name;
        myrecord = new ArrayList<>();
        docs = new ArrayList<>();
        myHospital = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addNewTest(BodyTest newTest) {
        myrecord.add(newTest);
    }

    public ArrayList<BodyTest> getAllTest() {
        return myrecord;
    }

    public void addNewDoctor(Doctor newDoctor) {
        docs.add(newDoctor);

    }

    public ArrayList<Doctor> getAllDoctors() {
        return docs;
    }

    public void addNewHospital(Hospital newHospital) {
        myHospital.add(newHospital);
    }

    public ArrayList<Hospital> getAllHospital() {
        return myHospital;
    }
}


