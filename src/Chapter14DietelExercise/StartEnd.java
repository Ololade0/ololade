package Chapter14DietelExercise;

public class StartEnd {
    public static void main(String[] args) {
        String[] strings = {"started", "starting", "ended", "ending"};

        for (String ololade : strings) {
            if (ololade.startsWith("str"))
                System.out.printf("\"%s\" starts with \"st\"%n", ololade);
        }

        System.out.println();

        // test method startsWith starting from position 2 of string
        for (String string : strings) {
            if (string.startsWith("art, 2")) {
                System.out.printf("\"%s\" starts with \"art\" at position 2%n", string);
            }
        }
        System.out.println();
        // test method endsWith
        for (String string : strings) {
            if (string.endsWith("ed")) {
                System.out.printf("\"%s\" ends with \"ed\"%n", string);
            }

        }
    }
}



