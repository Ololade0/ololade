package Chapter15;

import java.io.Serializable;

public class Dog implements Serializable {
    private  String age;
    private String name;

    public Dog(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
