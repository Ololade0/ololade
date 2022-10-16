package FunctionalInterfaces;

import java.util.Random;
import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
       //**Consumer interface
    Consumer<Integer> consumer =
            (number)-> System.out.println("The number is " + number);
    consumer.accept(5);


    //**Bi-Consumer interface
        BiConsumer<Integer, String> biConsumer = (age, name)->
                System.out.println("My name is "+ name+ " I am "+ age + "years old");
        biConsumer.accept(28, "Ololade");


        //**Supplier interaface
        Random random = new Random();
        Supplier<Integer> supplier = ()-> random.nextInt();
        System.out.println(supplier.get());

        //**Predicate interface
        Predicate<String> predicate = (name) -> name.equals("Asake");
        System.out.println(predicate.test("My Boyo"));

        //**Bi-predicate interface
        BiPredicate<Integer, String> biPredicate = (num, character)->
                String.valueOf(num).equals(character);
        System.out.println(biPredicate.test(5, "5"));

        //**Function interface
        Function<String, String> function = (word)->
                new StringBuilder(word).reverse().toString();
        System.out.println(function.apply("Hello"));


        Function<String, Integer> func = (word)-> word.length();
        System.out.println(function.apply("Hello"));



        //**Bi-function interface
        BiFunction<Integer, Integer, String> biFunction = (num1, num2)-> String.valueOf(num1 * num2);
        System.out.println(biFunction.apply(2, 4));

        UnaryOperator<Integer> unaryOperator=(number)->number*number;
        System.out.println(unaryOperator.apply(8));

        BinaryOperator<Integer> binaryOperator = (a, b)->a+b;
        System.out.println(binaryOperator.apply(5, 6));







    }



}


