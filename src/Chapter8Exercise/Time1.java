package Chapter8Exercise;

public class Time1 {
    private int hour;
    private int minutes;
    private int second;

    public void setTime(int hour, int minutes, int second) {
        if (hour < 0 || hour >= 24 || minutes < 0 || minutes >= 60 || second < 0
                || second >= 60) {
            throw new RuntimeException("hour,minute and/or second was out" +
                    " of range");
        }
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    public  String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour,
                minutes,second);
    }

//    public String toString(){
//        return String.format("%d:%02d:%02d %s",((hour == 0 || hour == 12))?
//                12 : hour % 12) minutes,second,(hour < 12 ? "AM" : "PM"));
//    }

}

