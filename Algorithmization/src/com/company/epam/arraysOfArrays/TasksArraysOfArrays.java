package com.company.epam.arraysOfArrays;

import java.util.Random;

public class TasksArraysOfArrays {

    public static final int NUMBER_THREE = 3;
    public static final int NUMBER_FIVE = 5;


    // Вывод матрицы в консоль
    public static void print(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }

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

    // Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static void task3Matr(int[][] matr, int k, int p) {
        for (int j = 0; j < matr[0].length; j++) {
            System.out.print(matr[k][j]);
        }
        System.out.println();
        for (int i = 0; i < matr.length; i++) {
            System.out.print(matr[i][p]);
        }
    }

    // Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
    public static void task4Matr(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (i % 2 == 0) {
                    matr[i][j] = j + 1;
                } else {
                    matr[i][j] = matr[i].length - j;
                }
                System.out.print(matr[i][j]);
            }
            System.out.println();
        }
    }

    // Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
    public static void task5Matr(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (j < matr.length - i) {
                    matr[i][j] = i + 1;
                } else {
                    matr[i][j] = 0;
                }
                System.out.print(matr[i][j]);
            }
            System.out.println();
        }
    }

    // Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
    public static void task6Matr(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (i < matr.length / 2) {
                    if (j > i - 1 && j < matr.length - i) {
                        matr[i][j] = 1;
                    } else {
                        matr[i][j] = 0;
                    }
                } else {
                    matr[i][j] = matr[matr.length - i - 1][j];
                }
                System.out.print(matr[i][j]);
            }
            System.out.println();
        }
    }

    //Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static int task7Matr(double[][] matr) {
        int result = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = Math.sin(((i * i) - (j * j)) / matr.length);
                System.out.print(matr[i][j]);
                if (matr[i][j] > 0)
                    result++;
            }
            System.out.println();
        }
        return result;
    }

    //В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
    //на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    //пользователь с клавиатуры.
    public static void task8Matr(int[][] matr, int n, int m) {
        int x = 2;
        for (int i = 0; i < matr.length; i++) {
            x = matr[i][n];
            matr[i][n] = matr[i][m];
            matr[i][m] = x;
        }
    }

    //Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    //столбец содержит максимальную сумму.
    public static void task9Matr(int[][] matr) {
        int max = 0;
        int sumColumn = 0;
        for (int i = 0; i < matr.length; i++) {
            sumColumn = 0;
            for (int j = 0; j < matr[i].length; j++) {
                sumColumn += matr[i][j];
            }
            if (max < sumColumn) {
                max = sumColumn;
            }
        }
        System.out.println(max);
    }

    //Найти положительные элементы главной диагонали квадратной матрицы.
    public static void task10Matr(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            System.out.print(matr[i][i] + " ");
        }
    }

    //Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    //которых число 5 встречается три и более раз.
    public static void task11Matr() {
        int[][] matr = new int[10][20];

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                Random random = new Random();
                matr[i][j] = random.nextInt(15);
            }
        }

        print(matr);

        for (int i = 0; i < matr.length; i++) {
            int counter = 0;
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] == NUMBER_FIVE) {
                    counter++;
                }
                if (counter == NUMBER_THREE) {
                    System.out.println(i+1);
                    break;
                }
            }
        }


    }

    //
    public static void task12Matr(){

    }

    //
    public static void task12Matr(){

    }

    //
    public static void task12Matr(){

    }

}
