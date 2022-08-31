package Chapter15DietelExercise;

import java.io.*;

public class WritingToFile2 {
    public static void main(String[] args) {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try{
            String sentence = bufferedReader.readLine();
            PrintWriter printWriter = new PrintWriter(new FileWriter("test.txt"));
            printWriter.println(sentence.toUpperCase());
            printWriter.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
