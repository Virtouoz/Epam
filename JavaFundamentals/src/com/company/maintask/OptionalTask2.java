package com.company.maintask;

import java.util.Date;
import java.util.Random;

public class OptionalTask2 {

    private static double[][] createMatrix(int n, int M) {
        Date date = new Date();
        final Random random = new Random(date.getTime());
        double[][] a = new double[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = -M + random.nextInt(M * 2) + random.nextDouble();
            }
        }
        return a;
    }

    private static void printMatrix(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
    public static void optionalTask1(int n, int M, int k) {
        double[][] a;
        a = createMatrix(n, M);
        double[] box;
        printMatrix(a);
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][k] > a[i + 1][k]) {
                    box = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = box;
                }
            }
        }
        printMatrix(a);
    }

    // Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
    public static void optionalTask2(int n, int M) {
        double[][] a;
        a = createMatrix(n, M);
        printMatrix(a);

        int indexX = 0;
        int indexY = 0;
        int size = 0;
        int newSize = 0;
        int newIndexY = 0;

        int flag = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                while (a[i][j] < a[i][j + 1]) {
                    newSize++;
                    if (flag == 0) {
                        newIndexY = j;
                    }
                    flag = 1;
                    if (j < a[i].length - 2) {
                        j++;
                    } else if (j < a[i].length - 1) {
                        break;
                    }
                }
                if (newSize > size) {
                    size = newSize;
                    indexY = newIndexY;
                    indexX = i;
                }
                flag = 0;
                newSize = 0;
            }
        }

        for (int i = 0; i <= size; i++) {
            System.out.print(a[indexX][indexY + i] + " ");
        }

    }

}
