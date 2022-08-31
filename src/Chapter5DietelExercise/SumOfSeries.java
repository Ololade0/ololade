package Chapter5DietelExercise;

import java.io.PrintStream;

public class SumOfSeries {
    public static void main(String[] args) {
        int sum = 0;
        int count =0;
        String number = "number";
        String total = "Total";
        PrintStream printf = System.out.printf("%s%20s%n", number, total);

        for (int i = 1; i <= 100 ; i++) {
            System.out.printf("%1d", i);
            sum = sum + i;
            System.out.printf("%21d%n", sum);
            count++;





            }


        }

    }

