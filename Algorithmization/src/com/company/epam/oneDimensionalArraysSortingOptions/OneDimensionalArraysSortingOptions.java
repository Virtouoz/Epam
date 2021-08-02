package com.company.epam.oneDimensionalArraysSortingOptions;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArraysSortingOptions {

    static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return new int[n];
    }

    static int[] createArrayNoZero() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return new int[n];
    }

    static int[]    fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
    // один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
    // дополнительный массив
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int[] array1;
        int[] array2;
        int[] array3;
        int k;

        k = scanner.nextInt();
        array1 = fillArray(createArray());
        array2 = fillArray(createArray());
        array3 = new int[array1.length + array2.length];

        printArray(array1);
        printArray(array2);

        if (k >= 0) System.arraycopy(array1, 0, array3, 0, k);
        if (array2.length >= 0) System.arraycopy(array2, 0, array3, k, array2.length);
        for (int i = 0; i < array1.length - k; i++) {
            array3[i + k + array2.length] = array1[i + k];
        }
        printArray(array3);
    }

    // Даны две последовательности
    // a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm
    // Образовать из них новую последовательность
    // чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
    public static void task2() {
        int[] array1;
        int[] array2;
        int[] array3;

        array1 = fillArray(createArray());
        array2 = fillArray(createArray());
        array3 = new int[array1.length + array2.length];

        printArray(array1);
        printArray(array2);

        for (int i = 0, j = 0; i < array1.length && j < array2.length; ) {
            if (array1[i] < array2[j]) {
                array3[i + j] = array1[i];
                System.out.println("array3[" + i + " " + j + "] =" + array3[i + j]);
                i++;
            } else {
                array3[i + j] = array2[j];
                System.out.println("array3[" + i + " " + j + "] =" + array3[i + j]);
                j++;
            }
        }
        printArray(array3);
    }

    // Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an
    // Требуется переставить элементы так,
    // чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    // элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
    // повторяется. Написать алгоритм сортировки выбором.
    public static void task3() {
        int[] array1;
        int max;
        int indexMax;
        indexMax = 0;
        array1 = fillArray(createArray());
        printArray(array1);

        for (int i = 0; i < array1.length; i++) {
            max = array1[i];
            for (int j = i; j < array1.length; j++) {
                if (max < array1[j]) {
                    max = array1[j];
                    indexMax = j;
                }
            }
            array1[indexMax] = array1[i];
            array1[i] = max;
        }

        printArray(array1);

    }

    // Сортировка обменами (пузырьком)
    public static void task4() {
        int[] array1;
        int box;
        int numberOfPermutations = 0;
        array1 = fillArray(createArray());
        printArray(array1);

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length - 1; j++) {
                if (array1[j] > array1[j + 1]) {
                    box = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = box;
                    numberOfPermutations++;
                }
            }
        }
        printArray(array1);
        System.out.println(numberOfPermutations);
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int min(int[] array, int begin, int end) {
        int minVal = array[begin];
        int minIndex = begin;
        for (int i = begin + 1; i <= end; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Сортировка вставками
    static void sort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j >= 1; j--) {
                if (array[j] < array[j - 1])
                    swap(array, j, j - 1);
                else
                    break;
            }
        }
    }

    public static void task5() {
        int[] array1;
        array1 = fillArray(createArray());
        printArray(array1);
        sort(array1);
        printArray(array1);
    }


    // Сортировка Шелла
    static void ShellSort(int[] mass) {
        for (int step = mass.length / 2; step > 0; step /= 2) {
            int i;
            int j;
            for (i = step; i < mass.length; i++) {
                int tmp = mass[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < mass[j - step])
                        mass[j] = mass[j - step];
                    else
                        break;
                }
                mass[j] = tmp;
            }
        }
    }

    public static void task6() {
        int[] array1;
        array1 = fillArray(createArray());
        printArray(array1);
        ShellSort(array1);
        printArray(array1);
    }

    // Требуется указать те места, на которые нужно вставлять элементы последовательности "2" в "1";
    public static void task7() {
        int[] array1;
        int[] array2;
        int[] array3;
        int[] array4;

        array1 = fillArray(createArray());
        sort(array1);
        array2 = fillArray(createArray());
        sort(array2);
        array3 = new int[array1.length + array2.length];
        array4 = new int[array2.length];

        printArray(array1);
        printArray(array2);

        int i;
        int j;
        int k;

        for (i = 0, j = 0, k = 0; i < array1.length && j < array2.length; ) {
            if (array1[i] < array2[j]) {
                array3[i + j] = array1[i];
                i++;
            } else {
                array3[i + j] = array2[j];
                array4[k] = i;
                k++;
                j++;
            }
        }

        if (i < array1.length) {
            array3[i + j] = array1[i];
        }
        if (j < array2.length) {
            array3[i + j] = array2[j];
            array4[k] = i;
        }

        printArray(array3);
        printArray(array4);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    // Составить программу, которая приводит эти дроби к общему
    // знаменателю и упорядочивает их в порядке возрастания.
    public static void task8() {
        int[] array1;
        int[] array2;

        array1 = fillArray(createArrayNoZero());
        array2 = fillArray(createArrayNoZero());

        printArray(array1);
        printArray(array2);

        int box = 1;
        for (int j : array2) {
            box = lcm(box, j);
        }

        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i] * (box / array2[i]);
            array2[i] = box;
        }

        sort(array1);

        printArray(array1);
        printArray(array2);

    }

}
