package com.company.epam.decompositionUsingMethods;

import java.util.Scanner;

import static java.lang.Math.*;

public class DecompositionUsingMethods {

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    // Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
    // натуральных чисел:
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("НОК = " + gcd(a, b));
        System.out.println("НОД = " + lcm(a, b));
    }

    // Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("НОД = " + gcd(gcd(a, b), gcd(c, d)));
    }

    // Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
    // треугольника.
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextFloat();
        double triangleS;
        triangleS = sqrt(3) * pow(a, 2) / 4;
        System.out.println(6 * triangleS);
    }

    static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return new int[n];
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    // На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
    // из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array1 = new double[n];
        double[] array2 = new double[n];

        for (int i = 0; i < array1.length; i++) {
            System.out.print("x = ");
            array1[i] = scanner.nextFloat();
            System.out.print("y = ");
            array2[i] = scanner.nextFloat();
        }

        int indexI = 0;
        int indexJ = 0;
        double maxDistance = 0;
        double distance;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                distance = Math.hypot(array1[i] - array1[j], array2[i] - array2[j]);
                if (maxDistance < distance) {
                    maxDistance = distance;
                    indexI = i;
                    indexJ = j;
                }
            }
        }

        System.out.println(array1[indexI] + " " + array1[indexI]);
        System.out.println(array1[indexJ] + " " + array1[indexJ]);

    }
}
