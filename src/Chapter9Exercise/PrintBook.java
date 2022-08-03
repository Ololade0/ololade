package Chapter9Exercise;

public class PrintBook extends Book{
    private String publisher;
    private int ISBN;


    public PrintBook(String title, String yearOfPublication, String author, String publisher, int ISBN) {
        super(title, yearOfPublication, author);

        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public void read(){
        System.out.println("I dont like printed books");
    }

    @Override
    public void write(){
        System.out.println("I prefer typing than writing");
    }


    public String getPublisher() {
        return publisher;
    }

    public int getISBN() {
        return ISBN;
    }



    @Override
    public String toString(){
        return String.format("""
                publisher: %s
                ISBN: %d
                """, getPublisher(), getISBN());
    }
}
