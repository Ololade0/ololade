package DiaryMangementSystem;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private final String name;
    private final ArrayList<Diary> myUser;
    private final String createdDiary;
    private final String password;

    public User(String name, String createDiary, String password) {
        this.name = name;
        this.password = password;
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
        // for (Diary diary : myUser) {
        for (Diary diary : myUser) {
            if (diary.getDiaryName() == diaryName) {
                return true;
            }
        }
            return false;
        }


    public boolean checkPassword(String password) {
        return Objects.equals(this.password, password);
    }
}


