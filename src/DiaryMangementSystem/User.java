package DiaryMangementSystem;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String name;
    private ArrayList<Diary> myUser;
    private String createdDiary;

    public User(String name, String createDiary) {
        this.name = name;
        myUser = new ArrayList<>();
        this.createdDiary = createDiary;
    }

    public String getName() {
        return name;
    }


    public String getcreatediary() {
        return createdDiary;
    }

    public void addNewDiary(Diary diary1) {

        myUser.add(diary1);
    }
    public Diary ViewDiary(int index) {
        return myUser.get(index);
    }

    public ArrayList<Diary> getAllViewedDiary() {
        return myUser;
    }


    public void deleteDiary(String diaryName) {
        for (int i = 0; i < myUser.size() ; i++) {
            if(Objects.equals(myUser.get(i).getDiaryName(), diaryName)){
                myUser.remove(i);
            }

        }
    }

    public boolean findDeleteDiary(String diaryName) {
        for (Diary diary : myUser) {
            if (diary.getDiaryName() == diaryName) ;
            return true;
        }
        return false;
    }


}


