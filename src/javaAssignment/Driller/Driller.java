package Driller;

public class Driller {

    public int getPrice(int perCopies) {
        int result = 0;
        if (perCopies <= 4) {
            result = perCopies * 2000;
        }
        if (perCopies >= 5 && perCopies <= 9) {
            result = perCopies * 1800;

        }
        if (perCopies >= 10 && perCopies <= 29) {
            result = perCopies * 1600;

        }

        if (perCopies >= 30 && perCopies <= 49) {
            result = perCopies * 1500;
        }
        if (perCopies >= 50 && perCopies <= 99) {
            result = perCopies * 1300;
        }
        if (perCopies >= 100 && perCopies <= 199) {
            result = perCopies * 1200;
        }
        if (perCopies >= 200 && perCopies <= 499) {
            result = perCopies * 1100;
        }
        if (perCopies >= 500) {
            result = perCopies * 1000;
        }
        return result;
    }

}








