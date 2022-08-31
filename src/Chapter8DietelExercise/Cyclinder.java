package Chapter8DietelExercise;

public class Cyclinder {
    private int radius = 1;
    private int height = 1;

    public Cyclinder() {

  }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (radius < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
            this.height = height;

        volume();

    }
    public double volume() {
        double square = radius * radius;
        return Math.PI * square * height;

    }

}
