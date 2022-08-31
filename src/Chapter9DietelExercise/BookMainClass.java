package Chapter9DietelExercise;

public class BookMainClass {
    public static void main(String[] args) {

        PrintBook printBook = new PrintBook("Ngozi goes to school", "25/03/2022", "Ololade", "Semicolon printing", 12345);

        printBook.read();
        printBook.write();
        System.out.println(printBook);

        AudioBook audioBook = new AudioBook("Siri", "24/07/2022", "Tman", 20, 40, "Ola");
        audioBook.read();
        audioBook.write();
        System.out.println(audioBook);


    }
}
