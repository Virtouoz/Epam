package com.company.epam;

import static com.company.epam.oneDimensionalArrays.OneDimensionalArrays.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //int[] array = new int[15];
        double[] dArray = new double[15];

        int array[] = {2,2,2,2,2,1,1,1,1,1};

        for (int i = 0; i < array.length; i++) {
            //array[i] = (int) (i * 2 * Math.pow(-1, i));
            //dArray[i] = i * Math.pow(-1, i);
            //dArray[i] = 5;
        }

        //task1(array, 3);
        //task2(dArray, 5);
        //task3(dArray);
        //task4(dArray);
        //task5(array);
        //task6(dArray);
        //task7(dArray);
        //task8(dArray);
        task9(array);
        //task10(dArray);

        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
        }

    }
}
