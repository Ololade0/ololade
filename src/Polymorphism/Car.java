package Polymorphism;

public class Car extends Vehicle{
    @Override
    public void go(){
        System.out.println("The car begins moving");


    }

    @Override
    public void speed(){
        System.out.println("The car is speeding");
    }
}
