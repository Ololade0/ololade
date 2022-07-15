package ClassActivities;

import java.util.Scanner;

public class Custom {
    public static final Scanner scanner = new Scanner(System.in);

    public static int collectInput() throws HowToCreateException{
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        if(userInput < 0) {
            throw new HowToCreateException("Cannot take a negative integer");
        }

        return 0;
    }


    public static void main(String[] args) {
        try {
            collectInput();
        }
        catch (HowToCreateException cE){
            System.out.println( cE.getMessage());
        }

        }
    }

