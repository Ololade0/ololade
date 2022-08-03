package SchoolManagementSystem;

public class Course {
    private String courseName;
    private boolean courseStatus;
    private  int courseId;


    public Course(String subject, boolean courseStatus,int courseId) {
        this.courseName = subject;
        this.courseStatus = courseStatus;
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public boolean getCourseStatus() {
        return true;
    }

    public boolean deactivatedCourseStatus() {
        return false;
    }


    public int getCourseId() {
        return courseId;
    }

public String toString(){
        return String.format("""
                CourseName : %s
                CourseId : %d
                
                """, getCourseName(), getCourseId(), getCourseStatus());
}
}


