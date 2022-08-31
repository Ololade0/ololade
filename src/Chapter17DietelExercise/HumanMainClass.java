package Chapter17DietelExercise;

public class HumanMainClass {
    public static void main(String[] args) {
        Human human = () -> System.out.println("I am no longer a man but a grown up boy");
        human.speak();
    }

}
