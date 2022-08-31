package Chapter5DietelExercise;

public class Divisible {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 30; i++) {
            if(i % 3 == 0) {
                System.out.println(""+ i);
                sum = sum + i;
            }
        }
      //  Queue queue;
        System.out.println("The total is " + sum);



    }



        }


