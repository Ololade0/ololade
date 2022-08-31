package Chapter5DietelExercise;

public class Traingle {
    public static void main(String[] args) {

        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(" * ");
            }

            for (int column = row; column <= 10; column++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();


        for (int row = 10; row >= 1; row--) {
            for (int column = row; column >= 0; column--) {
                System.out.print(" ");
            }
            for (int column = row; column <= 10; column++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();


        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(" * ");
            }

            for (int column = row; column <= 10; column++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


}









