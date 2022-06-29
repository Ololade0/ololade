package SchoolSystem;

import java.util.ArrayList;

public class Stud {


    private String studentName;
    private int studentAge;
    private String studentGender;
    private int studentIdentity;
    private ArrayList<Corse> listOfCourses;

    public Stud(String studentName, int studentAge, String studentGender, int studentIdentity) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentIdentity = studentIdentity;
        this.listOfCourses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public int getStudentIdentity() {
        return studentIdentity;
    }

    public void addNewCorse(Corse corse) {
        listOfCourses.add(corse);


//    public String getSelectCourse(String corseName) {
//        for (int i = 0; i < listOfCourses.size(); i++) {
//            if (listOfCourses.get(i).getCorseName() == corseName) {
//
//
//            }
//            return listOfCourses.get(i).getCorseName();
//        }
//    }

    }

    public String getSelectCourse(String courseName) {

        return courseName;
    }

}


