package DiaryMangementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new User("Jummy", "new diary", "123");
        Diary diary2 = new Diary("Hello Welcome to my diary");
        user.addNewDiary(diary2);

    }


    @Test
    void userNameCanBeTested(){
        assertEquals("Jummy", user.getName());
    }

  @Test
    void creationOfDiaryCanBeTested(){
        assertEquals("new diary", user.getcreatediary());
  }

  @Test
  void testThatDiaryCanBeAdded(){
          Diary diary1 = new Diary("my new Diary");
          Diary diary2 = new Diary("Hello Welcome to my diary");
          user.addNewDiary(diary1);
          user.addNewDiary(diary2);
          assertNotNull(user.ViewDiary(0));
      }


    @Test
    void testThatAllDiaryCanBeView(){
        assertNotNull(user.getAllViewedDiary());
  }

  @Test
  void editDiaryTest(){
      Diary diary1 = new Diary("my new Diary");
      user.addNewDiary(diary1);
      Diary diary = user.ViewDiary(0);
      diary.setDiaryName("Tosin diary");
      assertEquals("Tosin diary", diary.getDiaryName());



  }



    @Test
    void deleteDiaryCanBeTested(){
        user.deleteDiary("Ololades diary");
        assertFalse(user.findDeleteDiary("Ololades diary"));
        System.out.print("" + user.findDeleteDiary("lades diary"));
}
}