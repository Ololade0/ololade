package DiaryMangementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary diary;

    @BeforeEach
    void setUp() {
        diary = new Diary("Ololades diary");
        Entry entry2 = new Entry("Hello Diary", "Glory! Glory! Glory!");
        diary.addNewEntry(entry2);
    }

    @Test
    void diaryNameCanBeTested() {
        assertEquals("Ololades diary", diary.getDiaryName());
    }


    @Test
    void dateCreatedCanBeTested() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        assertEquals(date.format(formatter), diary.getDate());
        System.out.println(diary.getDate());
    }

    @Test
    void addEntryCanBeTested() {
        Entry entry1 = new Entry("Welcome to my diary", "I love my diary");
        Entry entry2 = new Entry("Hello Diary", "Glory! Glory! Glory!");
        diary.addNewEntry(entry1);
        diary.addNewEntry(entry2);
        assertNotNull(diary.getEntry(0));

    }


    @Test
    void getAllEntryCanBeTested() {
        assertNotNull(diary.getAllEntries());

    }

    @Test
    void EditEntryTest(){
        Entry entry1 = new Entry("Welcome to my diary", "I love my diary");
        diary.addNewEntry(entry1);
        Entry entry = diary.getEntry(0);
        entry.setBody("Welcome diary");
        assertEquals("Welcome diary", entry.getBody());

    }

    @Test
    void deleteEntryCanBeTested(){
        diary.deleteEntry("I love my diary");
        assertTrue(diary.findEntry("I love my diary"));
        System.out.println(diary.findEntry("I love my diary"));
    }
}



