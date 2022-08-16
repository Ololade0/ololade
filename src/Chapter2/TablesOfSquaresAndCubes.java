package Chapter2;

public class TablesOfSquaresAndCubes {
    public static void main(String[] args) {

        String number = "number";
        String square = "Square";
        String cube = "Cube";
        System.out.printf("%2s%20s%20s%n", number, square,cube);
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("" + i);

            int squaree = i * i;
            System.out.printf("%20d%n", squaree);

            int cubee = i * squaree;
            System.out.printf("%45d%n", cubee);

        }

        }

    }

