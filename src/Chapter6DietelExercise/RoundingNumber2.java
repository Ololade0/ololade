package Chapter6DietelExercise;

public class RoundingNumber2 {
    public static void main(String[] args) {
        int x = 10;
        double y = Math.floor(x * 10 + 0.5) / 10;
        System.out.println("" + y);

        double yx = Math.floor(x * 100 + 5.0) / 1000;
        System.out.println("" + yx);

        System.out.println("" + roundToIntegers(10.0));
    }
    public static double roundToIntegers(double x){
       // double x = 10.0;
      double   number = Math.floor(x * 1000 + 0.5) / 1000;
        return number;
    }


}
