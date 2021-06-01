package com.company.epam.arraysOfArrays;

public class TasksArraysOfArrays {

    // Дана матрица. Вывести на экран все нечетные столбцы,
    // у которых первый элемент больше последнего.
    public static void task1Matr(int[][] matr) {
        for (int j = 0; j < matr[0].length; j++) {
            if (j % 2 == 0 && matr[0][j] > matr[matr.length - 1][j]) {
                for (int i = 0; i < matr.length; i++) {
                    System.out.print(matr[i][j]);
                }
                System.out.println();
            }
        }
    }

    // Дана квадратная матрица.
    // Вывести на экран элементы, стоящие на диагонали.
    public static void task2Matr(int[][] matr) {
        for (int j = 0; j < matr[0].length; j++) {
            System.out.println(matr[j][j]);
        }
    }

    //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static void task3Matr(int[][] matr, int k, int p) {
        for (int j = 0; j < matr[0].length; j++) {
            System.out.print(matr[k][j]);
        }
        System.out.println();
        for (int i = 0; i < matr.length; i++) {
            System.out.print(matr[i][p]);
        }
    }

    //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static void task4Matr(int[][] matr, int k, int p) {
        for (int j = 0; j < matr[0].length; j++) {
            System.out.print(matr[k][j]);
        }
        System.out.println();
        for (int i = 0; i < matr.length; i++) {
            System.out.print(matr[i][p]);
        }
    }


}
