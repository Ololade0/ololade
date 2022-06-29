package SchoolManagementSystem;

//package SchoolManagementSystem;

import java.util.ArrayList;
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
                // System.exit(0);
                studentPage();
            }


            case 2 -> {
                System.out.println("select Subject");
                String english = scanner.next();


                System.out.println("select Subject");
                String math = scanner.next();

                System.out.println("select Subject");
                String theology = scanner.next();

                System.out.println("select Subject");
                String python = scanner.next();

                System.out.println("select Subject");
                String java = scanner.next();

                System.out.println("All courses has been selected");
                scanner.nextLine();

             //   Course course = new Course("English,math,Theology,Python", true, 002);
                // System.exit(0);
                studentPage();




            }
             case 3 -> {
                System.out.println("View all course");
                String view = scanner.next();
                studentPage();

            }

            case 4 -> {
                System.out.println("withdraw courses");
                String withdraw = scanner.next();
                studentPage();
            }

            case 5 -> userResponse();
        }

    }


    //  }


    private static void adminPage() {
        System.out.print("""
                                        
                        1-> press 1 to enter name of school and location
                        2-> press 2 to admit student
                        3-> press 3 to get all student
                        4-> press 4 to delete student
                        5-> press 5 to delete course
                        6-> press 6 to get all course
                        7-> press 7 to exit
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
            //  System.exit(0);


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
                adminPage();
             //   System.exit(0);

            }

            case 3 -> {
                System.out.println("Enter the name of all student:");
                String allStudent = scanner.next();
                ArrayList<Student> myStudent;
                adminPage();
            }

            case 4 -> {
                System.out.println("Enter delete student: ");
                String deleteStudent = scanner.next();
                adminPage();
                // student = new Student();

            }

            case 5 -> {
                System.out.println("Enter delete course: ");
                String deleteCourse = scanner.next();
                adminPage();
                //  student = new Student();

            }

            case 6 -> {
                System.out.println("Enter get all course ");
                String getCourse = scanner.next();
                adminPage();
            }

            case 7 -> userResponse();

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
                sentinel = 0;
            } else {
                switch (userResponse) {
                    case 1 -> adminPage();
                    case 2 -> studentPage();
                    case 0 -> System.exit(0);


                }
            }
        }
    }



}



//}
