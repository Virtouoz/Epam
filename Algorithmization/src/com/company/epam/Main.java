package com.company.epam;

import java.util.Scanner;

import static com.company.epam.arraysOfArrays.TasksArraysOfArrays.*;
import static com.company.epam.oneDimensionalArrays.OneDimensionalArrays.*;
import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите номер задачи (тема Одномерные массивы)");
        //int choice = scanner.nextInt();

        int[] array = new int[15];
        double[] dArray = new double[15];
        for (int i = 0; i < dArray.length; i++) {
            dArray[i] = i * Math.pow(-1, i);
        }

        int[][] matr = new int[6][6];
        double[][] matrdouble = new double[6][6];
        // task6Matr(matr);
        // System.out.println(task7Matr(matrdouble));
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = i*(-1)+j;
            }
        }

        print(matr);
        task8Matr(matr, 1, 2);
        print(matr);

/*
        switch (choice) {
            case 1: {
                task1(array, 3);
                break;
            }
            case 2: {
                task2(dArray, 5);
                break;
            }
            case 3: {
                task3(dArray);
                break;
            }
            case 4: {
                task4(dArray);
                break;
            }
            case 5: {
                task5(array);
                break;
            }
            case 6: {
                task6(dArray);
                break;
            }
            case 7: {
                task7(dArray);
                break;
            }
            case 8: {
                task8(dArray);
                break;
            }
            case 9: {
                task9(array);
                break;
            }
            case 10: {
                task10(array);
                break;
            }
            case 0: {
                break;
            }
            default: {
                break;
            }
        }
*/

    }
}
