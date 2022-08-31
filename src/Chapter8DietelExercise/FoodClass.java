package Chapter8DietelExercise;

public class FoodClass {;
    public static void main(String[] args) {


       for (Food food : Food.values()){
           System.out.printf("%s%s%s%n", food.getBanana(), food.getCarrot(),food.getApple());


        }


    }
}
