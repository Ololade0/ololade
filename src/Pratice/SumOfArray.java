package Pratice;

import java.util.Stack;

public class SumOfArray {
    public static void main(String[] args) {
        int total = 0;
        int average = 0;

        int[] myVariable = {20,50,70,20,10,60,15,30,25,90};
        for (int i = 0; i < myVariable.length; i++) {
            total = total + myVariable[i];

          average =   total / myVariable.length;
        }
        System.out.println("sum is "+ total);
        System.out.println(" average is " + average);
    }
    }

