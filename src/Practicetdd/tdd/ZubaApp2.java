package tdd;

public class ZubaApp2 {
    public String passGrade(int number) {
        String passGrade = null;
        if(number > 55){
            passGrade = "pass";
        }
        if( number < 55){
            passGrade = "fail";

        }
        return passGrade;

    }
}
