package Chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Example2 {
    public static void main(String[] args)  {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try( PrintStream printStream = new PrintStream("test.txt")) {
            String sentence = bufferedReader.readLine();
            printStream.println(sentence.toUpperCase());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
