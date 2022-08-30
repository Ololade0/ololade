package Chapter15;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WritingToFile {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String sentence = bufferedReader.readLine();
            System.out.println(sentence);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}