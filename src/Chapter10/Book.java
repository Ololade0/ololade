package Chapter10;

public class Book {
    private String title;
    private String yearOfPublication;
    private String author;

    public Book(String title, String yearOfPublication, String author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }
    public  void  read(){
        System.out.println("Books are easy to read");
    }
    public void write(){
        System.out.println("We can use our book to write");
    }

    public String getTitle() {
        return title;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }
}
