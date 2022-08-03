package DiaryMangementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    private static final Scanner scanner = new Scanner(System.in);

    private static final ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Menu();
        loginpage();
    }

    private static void loginpage() {
        if(users.isEmpty()){
            System.out.println("Kindly go back to register");
            Menu();
        }

        System.out.println("Enter Username: ");
        String userName = scanner.nextLine();
        scanner.nextLine();
        for(User newUser : users) {
            if(newUser.getName().equalsIgnoreCase(userName)){
                System.out.println("Enter Password: ");
                String password = scanner.nextLine();
                if (newUser.checkPassword(password)) {
                    User user = new User(userName,null, password);
                    Menu();
                }
                else {
                    System.out.println("Incorrect password");
                    System.out.println("Kindly try again!!!");
                    Menu();
                }
            }
            else {
                System.out.println("Username not found!");
                Menu();
            }
        }
    }
    
    private static void accountRegistration() {
        System.out.println("Enter username: ");
        String loginUserName = scanner.next();
        System.out.println("Enter password: ");
        String pass = scanner.next();
        System.out.println("Enter emailAddress: ");
        String address = scanner.next();
        User user1 = new User(loginUserName, pass,address);
        users.add(user1);
        System.out.println("Registration Completed.\n Kindly login");
        Menu();



        }

    private static void Menu() {
        System.out.println("""
                WELCOME TO OLOLADE'S E-DIARY!!!
                1 -> to create diary account
                2-> to login
                0-> to exit
                """);
        int menu = scanner.nextInt();
        switch (menu) {
            case 1 -> accountRegistration();
            case 2-> loginpage();
            case 3-> System.exit(0);
        }
    }
}






