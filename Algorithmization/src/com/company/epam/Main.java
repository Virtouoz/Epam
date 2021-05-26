package com.company.epam;

import static com.company.epam.oneDimensionalArrays.OneDimensionalArrays.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] array = new int[10];
        double[] dArray = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            dArray[i] = i * Math.pow(-1, i);
        }

        System.out.println(task1(array, 3));
        System.out.println(task2(dArray, 5));
        task3(dArray);

        for (int i = 0; i < array.length; i++) {
            System.out.println(dArray[i]);
        }

    }
}
