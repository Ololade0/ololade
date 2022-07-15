package Polymorphism;

public class Boat extends Vehicle{
    @Override
   public void go(){
        System.out.println("The boat begins moving");

    }

    @Override
    public void speed(){
        System.out.println("The boat is speeding");
    }
    }
