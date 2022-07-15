package PhoneBookFunctionality;

import java.util.Scanner;

public class PhoneBookMainClass {
    static final Scanner scanner = new Scanner(System.in);
    static Contact contact;
    static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        menu();
    }

    private static void contactMenu() {
        System.out.println("""
                press 1 to add contact
                press 2 to search contact
                press 3 to delete contact
                press 4 to edit contact
                press 5 to get All contact
                press 0 to menu
                """);
        int Contact = scanner.nextInt();
        scanner.nextLine();
        switch (Contact) {
            case 1 -> addContact();
            case 2 -> searchContact();
            case 3 -> deleteContact();
            case 4 -> editContact();
            case 5 -> getAllContact();
            case 0 -> menu();
        }
    }

    private static void getAllContact() {
        for (int i = 0; i < phoneBook.getAllContact().size(); i++) {
            System.out.println(phoneBook.getAllContact().get(i));
        }
        contactMenu();

    }


    private static void editContact() {
        System.out.println("Enter name to edit contact");
        String contactName = scanner.nextLine();
        Contact entry = phoneBook.searchContact(contactName);

        System.out.println("""
                press 1 to edit name
                press 2 to edit address
                press 3 to edit number
                press 4 to edit email
                """);
        int editOptions = scanner.nextInt();
        scanner.nextLine();
        switch (editOptions){
            case 1-> {

                System.out.println("Enter new name ");
                String newName = scanner.nextLine();


              entry.setName(newName);
              contactMenu();
            }

            case 2 ->  {
                System.out.println("Enter new address");
                String newaddress = scanner.nextLine();
                entry.setAddress(newaddress);
                contactMenu();
            }
            case 3 -> {
                System.out.println("Enter new number");
                String newNumber = scanner.nextLine();
                entry.setPhoneNumber(newNumber);
                contactMenu();
            }

            case 4 -> {
                System.out.println("Enter new email Address");
                String newEmail = scanner.nextLine();
                entry.setEmailAddress(newEmail);
                contactMenu();
            }
        }
    }

        private static void deleteContact () {
            System.out.println("Enter name to search contact: ");
            String contactName = scanner.nextLine();
            Contact contact1 = phoneBook.searchContact(contactName);
            for (int i = 0; i < phoneBook.getAllContact().size(); i++) {
                if (phoneBook.getAllContact().get(i) == contact1) {
                    phoneBook.deleteContact(contact1);
                }
            }
            contactMenu();
        }


        private static void searchContact () {
            System.out.println("Enter name to search contact: ");
            String contactName = scanner.nextLine();
            Contact contact1 = phoneBook.searchContact(contactName);
            for (int i = 0; i < phoneBook.getAllContact().size(); i++) {
                if (phoneBook.getAllContact().get(i) == contact1) {
                    System.out.println(contact1);
                }
            }
            contactMenu();
        }
        private static void addContact () {
            System.out.println("Enter name: ");
            String name = scanner.next();

            System.out.println("Enter phone number: ");
            String phoneNumber = scanner.next();

            System.out.println("Contact saved successfully");

            contact = new Contact(name, phoneNumber);
            phoneBook.addNewContact(contact);
            contactMenu();
        }


        private static void menu() {
            System.out.println("""
                    1-> Enter 1 for contact menu
                    0-> Enter 0 to exit
                        """);

            int response = scanner.nextInt();
            if (response == 0) System.exit(0);
            else contactMenu();
        }
    }

