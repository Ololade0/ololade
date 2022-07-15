package Chapter4Exercises;

public class TabularOutput {
    public static void main(String[] args) {


       // String N = "N";
       // System.out.printf("%5N%10N%20N%20N"+ N,N,N,N);


        String N = "N";
        int count = 0;

        while (count != 4) {
            System.out.printf("%1s\t", N);
            count++;
        }



        for (int i = 0; i < 6; i++) {
            System.out.println("" + (i));
            count++;
        }

        for (int i = 1; i < 6; i++) {
            System.out.printf("%4d%, 1", (i * i));
            count++;
        }


        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 5; j++) {

                System.out.print("");
            }
            System.out.println();
        }

    }
}








