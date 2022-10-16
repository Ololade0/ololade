package Chapter17DietelExercise;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class WaysToCreateFiniteStream {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.empty();

        Stream<Integer> integerStream2 = Stream.of(10, 20, 30);

        //infinite Stream
        Supplier<Integer> supplier = () -> new Random().nextInt();
        Stream<Integer> numbersList = Stream.generate(supplier);
        numbersList.forEach((number) ->System.out.println(number));

        //infinite
        UnaryOperator<Integer> unaryOperator = (number)-> number+1;
        Stream<Integer> badCharacters = Stream.iterate(1, unaryOperator).limit(10);
        badCharacters.forEach((number) ->System.out.println(number));














    }
}
