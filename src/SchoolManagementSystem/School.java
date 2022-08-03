package SchoolManagementSystem;

import java.util.ArrayList;

public class School {
    private String schoolName;
    private String schoolLocation;
    private ArrayList<Student> myStudent;

    private ArrayList<Course> myCourse;

    public School(String schoolName, String schoolLocation) {
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
        this.myStudent = new ArrayList<>();
        this.myCourse = new ArrayList<>();

    }

    public String getSchoolName() {

        return schoolName;
    }

    public String getSchoolLocation() {

        return schoolLocation;
    }


    public void admitStudent(Student newStudent) {
        myStudent.add(newStudent);


    }

    public ArrayList<Student> getmyStudent() {

        return myStudent;
    }


    public void deleteStudent(int studentId) {
        for (int i = 0; i < myStudent.size(); i++) {
            if (myStudent.get(i).getStudentId() == studentId) {
                myStudent.remove(i);
            }
        }

    }

    public boolean findStudent(int studentId) {
        for (int i = 0; i < myStudent.size(); i++) {
            if (myStudent.get(i).getStudentId() == studentId)
                return false;
        }
        return true;
    }

    public void deleteCourse(String courseName) {
        for (int i = 0; i < myCourse.size(); i++) {
            if (myCourse.get(i).getCourseName() == courseName) {
                myCourse.remove(i);
            }
        }
    }

    public boolean findCourse(String courseName) {
        for (int i = 0; i < myCourse.size(); i++) {
            if (myCourse.get(i).getCourseName() == courseName)
                return false;
        }
        return true;
    }

    public ArrayList<Course> getMyCourse() {
        return myCourse;
    }


    public void createCourse(Course newCourse) {

        myCourse.add(newCourse);
    }

    public Course getCourse(String courseName) {
        for (Course course : myCourse) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                return course;
            }

        }
        return null;


    }

}




