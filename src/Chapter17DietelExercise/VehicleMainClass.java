package Chapter17DietelExercise;

public class VehicleMainClass {
    public static void main(String[] args) {
        Vehicle car = (speed, name) -> System.out.println("I am a " + name +" running at " + speed + "km/hr");
        car.move(120, "pegeout");
    }
}
