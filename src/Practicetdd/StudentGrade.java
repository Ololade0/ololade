package Practice;

public class StudentGrade {
    private String name;
    private double average;

    public StudentGrade(String name, double average) {
        this.name = name;
        if(average > 0)
            if(average <= 100){
                this.average = average;
            }
    }

    public String getName() {
        return name;
    }

    public void setAverage(double average) {
        if(average > 0)
            if(average <= 100){
                this.average = average;
            }
    }

    public double getAverage() {
        return average;
    }
}
