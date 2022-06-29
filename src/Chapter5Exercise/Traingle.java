package Chapter5Exercise;

public class Traingle {
    public static void main(String[] args) {

        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(" * ");
            }

            for (int column = row; column <= 10; column++) {
                System.out.print("  ");
            }
            System.out.println();
        }

            for (int row = 1; row <= 10; row++) {
                for (int column = 1; column <= row ; column++) {
                    System.out.println(" ");
                }

                for (int column = row; column <= 10 ; column++) {
                    System.out.println(" ");
                }
                System.out.println("*");
                
            }
            for (int column = 1; column <= 10; column++) {
                System.out.println("");
            }
            System.out.println("*");
            for (int row = 1; row <= 10; row++) {
                for (int column = row; column <= 10; column++) {
                    System.out.print("  ");
                }
            }

//            for (int column = 1; column <= row; column++) {
//                System.out.print("* ");
//            }
////
//            System.out.println();
        }
    }

//





