package Chapter5DietelExercise;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        int row = 5;
        int i = 1;
        int column;
        do {
            column = 1;
            do {
                System.out.print(" ");
            }
            while (++column <= row - i + 1);
            column = 1;
            do {

                System.out.print("*");
            }
            while (++column <= i * 2 - 1);
            System.out.println();

        }
        while (++i <= row);
        i = row - 1;

        do {
            column = 1;

            do {
/////////////
                System.out.print(" ");

            } while (++column <= row - i + 1);

            column = 1;

            do {

                System.out.print("*");

            } while (++column <= i * 2 - 1);

            System.out.println(" ");

        }
      while (--i > 0);
            }
        }




