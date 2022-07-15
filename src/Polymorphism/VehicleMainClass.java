package Polymorphism;

public class VehicleMainClass {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle [] racers ={car, bicycle, boat};
        for (Vehicle x : racers) {
         //   for (int i = 0; i < racers.length; i++) {


                x.go();
                x.speed();
            }

        }



        }
//
//        car.go();
//        boat.go();
//        bicycle.go();
//    }

