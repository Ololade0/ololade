package Chapter4Exercises;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;


            System.out.println("Enter an integer");
            int firstInteger = scanner.nextInt();

            while (count <= 1){

            System.out.println("Enter an integer");
           int secondInteger = scanner.nextInt();
            count++;

            if(firstInteger == secondInteger){
                System.out.println("The result is 0");
            }

            if(firstInteger > secondInteger ){
                System.out.println("The result is 1");
            }

            if (secondInteger > firstInteger){
                System.out.println("The result is -1");
            }
        }

    }

 }
