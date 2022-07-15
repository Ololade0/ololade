package SchoolManagementSystem;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private String gender;

    private int studentAge;
    private int studentId;

    private ArrayList<Course> listOfCourse;

    public Student(String studentName, String gender,int studentAge,int studentId){

        this.studentName = studentName;
        this.gender = gender;
        this.studentAge = studentAge;
        this.studentId = studentId;
        this.listOfCourse = new ArrayList<>();
    }
    public String getStudentName() {
        return studentName;
    }

    public String getGender(){
        return gender;

    }

    public int getStudentAge(){
        return studentAge;
    }

    public int getStudentId(){
        return studentId;
    }


    public String getselectCourse(String courseName) {
        return courseName;
    }

    public ArrayList<Course> getListOfCourse() {
        return listOfCourse;
        }


    public void withdrawCourse(String courseName) {
        for (int i = 0; i < listOfCourse.size(); i++) {
            if(listOfCourse.get(i).getCourseName() == courseName) {
                listOfCourse.remove(i);
            }

        }

    }

    public boolean confirmWithdraw(String courseName) {
        for(int i = 0; i < listOfCourse.size(); i++) {
            if (listOfCourse.get(i).getCourseName() == courseName)
                return false;
        }
        return true;
    }

    public void addNewCourse(Course newCourse) {

        listOfCourse.add(newCourse);
    }

    public String getSelectCourse(int courseId) {
        for (int i = 0; i < listOfCourse.size() ; i++) {
            if(listOfCourse.get(i).getCourseId() == courseId){
                return listOfCourse.get(i).getCourseName();
            }
        }
        throw new IllegalArgumentException(("This course is not available"));
    }

    @Override
    public String toString() {
        return "studentName='" + getStudentName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", studentAge=" + getStudentAge() +
                ", studentId=" + getStudentId() +
                ", listOfCourse=" + getListOfCourse()
                ;
    }
}


