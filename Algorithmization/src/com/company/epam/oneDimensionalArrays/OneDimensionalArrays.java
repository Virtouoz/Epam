package com.company.epam.oneDimensionalArrays;

public class OneDimensionalArrays {

    // В массив A [N] занесены натуральные числа.
    // Найти сумму тех элементов, которые кратны данному К.
    public static int task1(int[] array, int K) {
        int result = 0;
        for (int element : array) {
            if (element % K == 0) {
                result += element;
            }
        }
        return result;
    }

    //  Дана последовательность действительных чисел а1 ,а2 ,..., ап.
    //  Заменить все ее члены, большие данного Z, этим числом.
    //  Подсчитать количество замен.
    public static int task2(double[] array, double Z) {
        int numberOfSubstitutions = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= Z) {
                array[i] = Z;
                numberOfSubstitutions++;
            }
        }
        return numberOfSubstitutions;
    }

    public static int task3(int[] array) {
        int result = 0;

        return result;
    }

    public static int task4(int[] array) {
        int result = 0;

        return result;
    }

    public static int task5(int[] array) {
        int result = 0;

        return result;
    }

    public static int task6(int[] array) {
        int result = 0;

        return result;
    }

    public static int task7(int[] array) {
        int result = 0;

        return result;
    }

    public static int task8(int[] array) {
        int result = 0;

        return result;
    }

    public static int task9(int[] array) {
        int result = 0;

        return result;
    }

    public static int task10(int[] array) {
        int result = 0;

        return result;
    }

}
