package Chapter4DietelExercises;

public class DanglingElseProblem {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        if(x > 5){
            if (y > 5){
                System.out.println("x and y are greater than 5");
            }
        }

        else{
            System.out.println("x is lesser than 5");
        }
    }
}
