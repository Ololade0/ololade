package Polymorphism;

public class Bicycle extends Vehicle {
    @Override
   public void go(){
        System.out.println("The bicycle begins moving");

    }

    @Override
    public void speed(){
        System.out.println("The bicycle is speeding");
    }

}
