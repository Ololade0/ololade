package Chapter6Exercise;

import java.util.Scanner;

public class SquareOfCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side");
        int side = scanner.nextInt();

        System.out.println("Enter fill character");
        char fillCharacter = scanner.next().charAt(0);


        squareOfAstherisks(side, (char) fillCharacter);


    }

    public static void squareOfAstherisks(int side, char fillCharacter) {
        for (int row = 1; row <= side; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(" # ");
            }

            for (int column = row; column <= fillCharacter; column++) {
                System.out.print(" # ");
            }
                System.out.println();
            }
        }
    }




