package SchoolSystem;

import java.util.ArrayList;

public class Schl {
 //   private static void listOfStud;
    private String schoolName;
    private String schoolLocation;

    private ArrayList<Stud> listOfStud;

    private ArrayList<Corse> listOfCorse;



    public Schl(String schoolName, String schoolLocation){
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
        this. listOfStud = new ArrayList<>();
        this.listOfCorse = new ArrayList<>();


    }


    public String getSchoolName() {

        return schoolName;
    }

    public String getSchoolLocation() {

        return schoolLocation;
    }


    public ArrayList<Stud> getMyStudent() {
        return listOfStud;
    }

    public  void admitStudent(Stud stud1) {
        listOfStud.add(stud1);
    }

    public void deleteStudent(int studentId) {
        for (int i = 0; i < listOfStud.size() ; i++) {
            if (listOfStud.get(i).getStudentIdentity()== studentId)
                listOfStud.remove(i);

        }
      //  listOfStud.remove(003);
    }

    public boolean findStud(int studentId) {
        for (int i = 0; i < listOfStud.size() ; i++) {
            if(listOfStud.get(i).getStudentIdentity()== studentId)
                return false;
            }
        return true;
    }


    public void deleteCourse(String corseName) {
        for (int i = 0; i < listOfCorse.size(); i++) {
            if(listOfCorse.get(i).getCorseName()== corseName);
            listOfCorse.remove(i);

        }
    }

    public boolean findCourse(String corseName) {
        for (int i = 0; i <listOfCorse.size() ; i++) {
            if (listOfCorse.get(i).getCorseName() == corseName);
            return false;
        }
        return true;
    }

    public ArrayList<Corse> getAllCorse() {
        return listOfCorse;
    }
    }


