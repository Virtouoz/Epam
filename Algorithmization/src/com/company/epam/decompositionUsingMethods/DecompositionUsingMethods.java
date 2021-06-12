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

    //

}
