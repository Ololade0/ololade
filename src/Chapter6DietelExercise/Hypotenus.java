package Chapter6DietelExercise;

import java.util.Scanner;

public class Hypotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer");
        int firstInteger = scanner.nextInt();

        System.out.println("Enter an integer");
        int secondInteger = scanner.nextInt();


        System.out.println("" + isMultiple(firstInteger, secondInteger));

    }


    public static boolean isMultiple(int firstInteger, int secondInteger){
        if(secondInteger % firstInteger == 0){
            return true;
        }

        else {
            return false;
        }

    }
}
