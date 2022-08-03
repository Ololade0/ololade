package Chapter6Exercise;

import java.util.Scanner;

public class SportRecommender {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter Celsius Temperature: ");
        int temp = scanner.nextInt();

        sportRecommender2(temp);

    }
    public static void sportRecommender2(int temp){
            if (temp >= 20 && temp <= 30) {
                System.out.println("Its a lovely weather for sport " +
                        "today!");

            } else if (temp >= 10 && temp <= 40) {
                System.out.println("Its a reasonable weather for sport " +
                        "today!");

            } else {
                System.out.println("Pls exercise with care today, " +
                        "watch out for the weather");

            }



        }
}
