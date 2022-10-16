package Chapter17DietelExercise;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        System.out.println("Random number on separarte lines: ");
        secureRandom.ints(10, 1, 7)
                .forEach(System.out::println);


        String numbers = secureRandom.ints
                (10, 1,
                        7).mapToObj(String::valueOf)
                .collect(Collectors.joining(""));
        System.out.println("Random number on the same lines: " + numbers);

    }


}
