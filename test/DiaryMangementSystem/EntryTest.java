package DiaryMangementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Entry entry;

    @BeforeEach
    void setUp() {
        entry = new Entry( "my personal diary","My Plans");
    }

    @Test
    public void titleCanBeTested(){

        assertEquals("my personal diary", entry.getTitle());
    }
    @Test
    void bodyCanBeTested(){
        assertEquals("My Plans", entry.getBody());
        System.out.println(entry.getBody());

    }

    @Test
    void dateCreatedCanBeTested(){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        assertEquals(date.format(formatter), entry.getDate());
        System.out.println(entry.getDate());
    }

}