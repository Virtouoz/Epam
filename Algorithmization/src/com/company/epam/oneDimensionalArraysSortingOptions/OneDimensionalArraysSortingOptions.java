package com.company.epam.oneDimensionalArraysSortingOptions;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArraysSortingOptions {

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    //Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
    //один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
    //дополнительный массив
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array1;
        int[] array2;
        int[] array3;
        int n;
        int m;
        int k;

        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        array1 = new int[n];
        array2 = new int[m];
        array3 = new int[n + m];

        for (int i = 0; i < n; i++) {
            array1[i] = random.nextInt(11);
        }
        printArray(array1);
        for (int i = 0; i < m; i++) {
            array2[i] = random.nextInt(11);
        }
        printArray(array2);

        for (int i = 0; i < k; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < m; i++) {
            array3[k+i]=array2[i];
        }
        for (int i = 0; i < n-k; i++) {
            array3[i+k+m] = array1[i+k];
        }
        printArray(array3);
    }
}
