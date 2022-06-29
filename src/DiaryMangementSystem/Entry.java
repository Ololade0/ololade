package DiaryMangementSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.util.Date;
import java.util.UUID;

public class Entry {
//    Date date = new Date();
    private LocalDateTime dateTime = LocalDateTime.now();
    private UUID uuidAsString;
    private String title;
    private String body;
    // private String id;

    public Entry(String title, String body){
        this.uuidAsString = UUID.randomUUID();
        this.title = title;
        this.body = body;

    }

    public UUID getId() {
        return uuidAsString;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }


    public String getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return dateTime.format(formatter);
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString(){
        return String.format("%s%n%s%n", title,body);
    }
}
