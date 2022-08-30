package Chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobby", "10");
      try(FileOutputStream fileOutputStream = new FileOutputStream("dog");
          ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      ){
          objectOutputStream.writeObject(dog);

      }catch (IOException exception){
          exception.printStackTrace();
      }

    }
}
