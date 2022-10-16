package Chapter3DietelExercise;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", "2022", 500_000_000);
   Car car1 = new Car("Honda", "1990", 300_000_000);
        System.out.println(car.getPrice());
        System.out.println(car1.getPrice());


    }
}
