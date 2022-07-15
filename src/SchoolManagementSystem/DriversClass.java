package SchoolManagementSystem;



import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class DriversClass {
    static Scanner scanner = new Scanner(System.in);
    static School school;
    static Student student;

    static Course course;



    public static void main(String[] args) {
        userResponse();
    }


    private static void studentPage() {
        System.out.println("""
                        1-> press 1 to enter student information
                        2-> press 2 to select course
                        3-> press 3 to view course
                        4-> press 4 to withdraw course
                        5-> press 5 to exit
                        """);
        int studentPage = scanner.nextInt();

        switch (studentPage) {

            case 1 -> {
                System.out.println("Enter name ");
                String studentName = scanner.next();
                System.out.println("Enter student age:");
                int studentAge = scanner.nextInt();
                System.out.println("Enter student id:");
                int studentId = scanner.nextInt();
                System.out.println("Enter student gender: ");
                String gender = scanner.next();
                student = new Student(studentName, gender, studentAge, studentId);
                studentPage();
            }


            case 2 -> {
                System.out.println("Enter list of courseName and courseid");
                scanner.nextLine();
                System.out.println("Enter courseid");
                String courseName1 = scanner.nextLine();
                scanner.nextLine();
                Course course = new Course("CourseName1", true, 101);
                student.getselectCourse(courseName1);
                for (int i = 0; i < student.getListOfCourse().size() ; i++) {
               System.out.printf("""
                            CourseName : %s
                            Course Id: %s
                            
                            
//                         
//                            """, student.getListOfCourse().get(i).getCourseName(), student.getselectCourse(courseName1));
//
            }

//                System.out.println("Enter Subject and courseId");
//                String math = scanner.nextLine();
//                scanner.nextLine();
//
//                System.out.println("Enter Subject and courseId");
//                String python = scanner.nextLine();
//                scanner.nextLine();
//
//                System.out.println("Enter Subject and courseId");
//                String Database = scanner.nextLine();
//                scanner.nextLine();
//
//                System.out.println("All courses has been selected");
//                course = new Course("english, math, python, Database", true,101);
//                student.getListOfCourse();
//                student.getselectCourse("english, math, python, Database");
//                studentPage();

            }
//
//            ArrayList<Course> listOfCourses = school.getMyCourse();
////
//            for (int i = 0; i < listOfCourses.size(); i++) {
//                System.out.printf("""
//                            Course Name: %s
//                            Course Id : %d
//                            """, school.getMyCourse().get(i).getCourseName(), school.getMyCourse().get(i).getCourseId());
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//            System.out.println("Enter course name: ");
//            String courseName = scanner.next();
//            System.out.println("Enter course id: ");
//            int courseId = scanner.nextInt();
//            System.out.println("Enter course status: ");
//            boolean courseStatus = scanner.nextBoolean();
//            Course course = new Course(courseName, courseStatus,courseId);
//            school.createCourse(course);
//            for (int i = 0; i < school.getMyCourse().size() ; i++) {
//                System.out.printf("""
//                            CourseName : %s
//                            Course Id: %d
//
//
//
//                            """, school.getMyCourse().get(i).getCourseName(), school.getMyCourse().get(i).getCourseId());
//
//            }
//
//
//
//
//
//
//





                case 3 -> {
                    ArrayList<Course> listOfCourse = student.getListOfCourse();
                    for (int i = 0; i < listOfCourse.size(); i++) {
                        System.out.printf("""
                                Course Name: %s
                                Course Id : %d
                                """, student.getListOfCourse().get(i).getCourseName(), student.getListOfCourse().get(i).getCourseId());

//                 for (int i = 0; i < student.getListOfCourse().size() ; i++) {
//
//                     System.out.printf("""
//                             courseName : %s
//                             course Id : %s
//                             course mimo : %s
//
//                             """, student.getListOfCourse().get(i).getCourseId(),course.getCourseId(),
//                             course.getCourseName());
//
//                 }
                        studentPage();

                    }
                }

            case 4 -> {
                System.out.println("withdraw courses");
                String withdraw = scanner.next();
                studentPage();
            }

            case 5 -> userResponse();
        }

    }






    private static void adminPage() {
        System.out.print("""
                                        
                        1-> press 1 to enter name of school and location
                        2-> press 2 to admit student
                        3-> press 3 to get all student
                        4-> press 4 to delete student
                        5-> press 5 to create course
                        6-> press 6 to delete course
                        7-> press 7 to get all course
                        8-> press 8 to exit
                        ->""");

        int adminPage = scanner.nextInt();
        switch (adminPage) {
            case 1 -> {
                System.out.print("Enter name of school: ");
                String nameOfSchool = scanner.next();
                System.out.println("Enter school location");
                String location = scanner.next();
                school = new School(nameOfSchool, location);
                adminPage();

            }



            case 2 -> {
                System.out.println("Enter student name: ");
                String studentName = scanner.next();
                System.out.println("Enter student gender: ");
                String gender = scanner.next();
                System.out.println("Enter student age: ");
                int studentAge = scanner.nextInt();
                System.out.println("Enter student id");
                int studentId = scanner.nextInt();
                student = new Student(studentName, gender, studentAge, studentId);
                school.admitStudent(student);
                adminPage();


            }

            case 3 -> {

//                for (Student s : school.getmyStudent()) {
//                    System.out.printf("""
//                            Student Name: %s
//                            ID: %d
//                            Gender: %s
//                            Age: %d
//
//                            """, s.getStudentName(), s.getStudentId(),s.getGender(),s.getStudentAge());
//                }
                for (int i = 0; i < school.getmyStudent().size(); i++) {

                    System.out.printf("""
                            Name: %s
                            ID: %d
                            gender: %s
                            Age: %d
                            
                            
                           
                            """, school.getmyStudent().get(i).getStudentName(), school.getmyStudent().get(i).getStudentId()
                            ,school.getmyStudent().get(i).getGender(), school.getmyStudent().get(i).getStudentAge());

                }
                adminPage();
            }

            case 4 -> {
                System.out.println("Enter student Id to delete: ");
                int deleteStudent = scanner.nextInt();
                for (int i = 0; i < school.getmyStudent().size() ; i++) {
                    if(school.getmyStudent().get(i).getStudentId() == deleteStudent){
                        school.getmyStudent().remove(school.getmyStudent().get(i));
                    }
                }
                System.out.println("Student successfully deleted");
                adminPage();
                // student = new Student();

            }

            case 5 -> {
                System.out.println("Enter course name: ");
                String courseName = scanner.next();
                System.out.println("Enter course id: ");
                int courseId = scanner.nextInt();
                System.out.println("Enter course status: ");
                boolean courseStatus = scanner.nextBoolean();
                Course course = new Course(courseName, courseStatus,courseId);
                school.createCourse(course);
                for (int i = 0; i < school.getMyCourse().size() ; i++) {
                    System.out.printf("""
                            CourseName : %s
                            Course Id: %d
                            
                            
                         
                            """, school.getMyCourse().get(i).getCourseName(), school.getMyCourse().get(i).getCourseId());

                }
                adminPage();

            }

            case 6 -> {
                System.out.println("Enter delete course: ");
                String deleteCourse = scanner.next();
                for (int i = 0; i < school.getMyCourse().size() ; i++) {
                    if(Objects.equals(school.getMyCourse().get(i).getCourseName(), deleteCourse)){
                        school.getMyCourse().remove(school.getMyCourse().get(i));

                    }
                }
                System.out.println("Course successfully deleted");
                adminPage();


            }

            case 7 -> {
                ArrayList<Course> listOfCourses = school.getMyCourse();
//
                for (int i = 0; i < listOfCourses.size(); i++) {
                    System.out.printf("""
                            Course Name: %s
                            Course Id : %d
                            """, school.getMyCourse().get(i).getCourseName(), school.getMyCourse().get(i).getCourseId());

                }
                adminPage();
            }

            case 8 -> userResponse();

        }
    }

    private static void userResponse() {
        int sentinel = -1;

        System.out.print("""
                        1-> Enter 1 for Admin Page
                        2-> Enter 2 for Student Page
                        0-> Enter to exit
                        ->""");
        int userResponse = scanner.nextInt();
        while (sentinel != 0) {
            if (userResponse == 0) {

                System.exit(0);
            } else {
                switch (userResponse) {
                    case 1 -> adminPage();
                    case 2 -> studentPage();
                }
            }
        }
    }



}




