package DiaryMangementSystem;


import java.util.ArrayList;

public class DiaryPratice {
    public static void main(String[] args) {
        Diary diary = new Diary("Tosin");




        Entry entry = new Entry("Welcome ", "This is my diary");
        diary.addNewEntry(entry);
        System.out.println(diary);
        System.out.println(entry);

       // System.out.printf();
    }


}

