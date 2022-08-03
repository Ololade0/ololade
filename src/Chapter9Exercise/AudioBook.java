package Chapter9Exercise;

public class AudioBook extends Book {
    private int size;
    private int length;

    private  String artistName;

    public AudioBook(String title, String yearOfPublication, String author, int size, int length, String artistName) {
        super(title, yearOfPublication, author);

        this.size = size;
        this.length = length;
        this.artistName = artistName;
    }



    @Override
    public void write(){
        System.out.println("I prefer listening to audio books than reading the written books");
    }


    public int getSize() {
        return size;
    }

    public int getLength() {
        return length;
    }

    public String getArtistName() {
        return artistName;
    }

    @Override
    public void read(){
        System.out.println("I don like audio books");
    }

    @Override
    public String toString(){
        return String.format("""
                Size: %d
                Length: %d
                Artist Name: %s
                Author: %s
                Title: %s
                Year of Publication: %s
                
                """, getSize(),getLength(),getArtistName(),getAuthor(),getTitle(),getYearOfPublication());
    }

}
