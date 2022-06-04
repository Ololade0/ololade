package tdd;

public class Kata {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    //public int subtract(int firstNumber, int secondNumber) {
    // return firstNumber - secondNumber;


    public int substract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int coefficient(int secondNumber, int firstNumber) {
        return secondNumber / firstNumber;
    }

    public String grade(int score) {
        String grade = null;
        if (score >= 90 && score <= 100) {
            grade = "A";
        }

        if (score >= 80 && score <= 90) {
            grade = "B";
        }

        if (score >= 70 && score <= 80) {
            grade = "C";
        }

        if (score >= 60 && score <= 70) {
            grade = "D";
        }
        if (score < 60) {
            grade = "F";
        }
        return grade;
    }
    }




    // public String uber(int number) {
        //String uber;
       // uber = null;
        //if(number == 60) {
           // uber = "correct";
       // }
          //  return uber;

