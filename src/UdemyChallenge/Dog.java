package UdemyChallenge;

public class Dog extends Animal {
    int eyes;
    int legs;
    int tail;
    int teeth;
    String coat;

    public Dog(String name, int body, int brain, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, body, brain, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("All dogs can chew");
    }

    @Override
    void eat() {
        System.out.println("Dogssss");
        //
    }

    void walk(){
        System.out.println("Walk");
        move(5);
    }
    void run(){
        System.out.println("Run run run");
    }
}
