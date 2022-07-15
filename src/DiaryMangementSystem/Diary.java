package DiaryMangementSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Diary {

    private String diaryName;

    private ArrayList<Entry> myEntry;
    private LocalDateTime dateTime = LocalDateTime.now();

    public Diary(String diaryName) {
        this.diaryName = diaryName;
        myEntry = new ArrayList<>();


    }

    public String getDiaryName() {
        return diaryName;
    }

    public String getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return dateTime.format(formatter);
    }


    public void addNewEntry(Entry entry1) {

        myEntry.add(entry1);
    }


    public Entry getEntry(int index) {

        return myEntry.get(index);
    }


    public ArrayList<Entry> getAllEntries() {
        return myEntry;
    }


//    public String editEntry(int index) {
//        myEntry.set(index, )
//        return myEntry.
//    }

    public void deleteEntry(String body) {
        for (int i = 0; i < myEntry.size(); i++) {
            if (myEntry.get(i).getBody() == body) ;
            myEntry.remove(i);
        }

    }

    public boolean findEntry(String body) {
        for (Entry entry : myEntry) {
            if (entry.getBody() == body) ;
            return false;
        }

        return true;
    }


    public void setDiaryName(String diaryName) {
        this.diaryName = diaryName;

    }


    @Override
    public String toString(){
        return String.format("%s%n%s%n%s", diaryName , dateTime, myEntry.size());
    }
}




