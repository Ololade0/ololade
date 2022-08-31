package Chapter15DietelExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\Ololade Demilade\\IdeaProjects\\Ololade\\test.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String sentence = reader.readLine();
            System.out.println(sentence);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
