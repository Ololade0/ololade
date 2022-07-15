package DynamicPolymorphism;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.println("press 1 for dog or 2 for cat");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();

        }
        else {
            animal = new Animal();
            System.out.println("Invalid");
            animal.speak();
        }


    }
}