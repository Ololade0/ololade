package UdemyChallenge;

public class Animal{
     String name;
    int body;
    int brain;

    int size;
    int weight;

    public Animal(String name, int body, int brain, int size, int weight) {
        this.name = name;
        this.body = body;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
    }



    void eat(){
        System.out.println("Animal can eat");

    }

    void move(int speed){
        System.out.println("All A can move");

    }

    void talk(){
        System.out.println("All Animal can talk");

    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
