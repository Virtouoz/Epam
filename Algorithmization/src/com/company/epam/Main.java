package com.company.epam;

import java.util.Scanner;

import static com.company.epam.arraysOfArrays.TasksArraysOfArrays.*;
import static com.company.epam.oneDimensionalArrays.OneDimensionalArrays.*;
import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задачи (тема Одномерные массивы)");
        int choice = scanner.nextInt();

        int[] array = new int[15];
        double[] dArray = new double[15];


        int[][] matr = new int[5][5];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = i*(-1)+j;
            }
        }
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j]);
            }
            System.out.println();
        }

        task3Matr(matr, 1,3);

        for (int i = 0; i < array.length; i++) {
            dArray[i] = i * Math.pow(-1, i);
        }

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

        //task1(array, 3);
        //task2(dArray, 5);
        //task3(dArray);
        //task4(dArray);
        //task5(array);
        //task6(dArray);
        //task7(dArray);
        //task8(dArray);
        //task9(array);
        //task10(array);


    }
}
