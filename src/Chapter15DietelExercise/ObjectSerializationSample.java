package Chapter15DietelExercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializationSample {
    public static void main(String[] args) {
        Dog dog = new Dog("body", "10");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("dog"))){
            objectOutputStream.writeObject(dog);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
