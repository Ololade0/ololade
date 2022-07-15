package Pratice;

import java.util.Arrays;

public class W3School {
    public static void main(String[] args) {

        int[] myArray1 = {90, 50, 30, 70, 120, 100, 70};
        for (int i = 0; i < myArray1.length; i++) {
            int max = myArray1[5];

            if (max < myArray1[0]) {
                max = myArray1[0];
            }

            if (max < myArray1[1]) {
                max = myArray1[1];
            }
            if (max < myArray1[2]) {
                max = myArray1[2];

            }

            if (max < myArray1[3]) {
                max = myArray1[3];
            }

            if (max < myArray1[4]) {
                max = myArray1[4];
            }

            if (max == myArray1[5]) {
                max = myArray1[5];

            if (max < myArray1[6]) {
                max = myArray1[1];
                }

                System.out.println("max is " + max);


            }
        }
    }
        }


 ///       ///REMOVAL OF ARRAY
//        int[] myArray1 = {90,50,30,70,60,100,70};
//        System.out.println("original items array" + Arrays.toString(myArray1));
//        int removeIndex = 1;
//
//        for (int i = removeIndex; i < myArray1.length -1 ; i++) {
//            myArray1[i] = myArray1[i + 1];
//        }
//        System.out.println("Removal is " + Arrays.toString(myArray1));
//////////////SORTING AN ARRAY
     //   int[] myArray1 = {90,50,30,70,60,100,70};
       // System.out.println("original numeric array" + Arrays.toString(myArray1));
//        Arrays.sort(myArray1);
//        System.out.println("sorted numeric array" + Arrays.toString(myArray1));
//
//        System.out.println("Original String array" + Arrays.toString(my_array));
//        Arrays.sort(my_array);
//        System.out.println("sorted String array"+ Arrays.toString(my_array));
//       // Arrays.sort(my_array);


