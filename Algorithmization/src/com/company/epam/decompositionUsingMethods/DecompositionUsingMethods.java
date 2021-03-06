package com.company.epam.decompositionUsingMethods;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
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

    static int[] fillArray(int[] array) {
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

    static void printArray(Integer[] array) {
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

    // Составить программу, которая в массиве A[N] находит второе по величине число
    // (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
    public static void task5() {
        int[] array1;
        array1 = fillArray(createArray());
        int maxNumber = 0;
        int result = 0;
        for (int element : array1) {
            if (maxNumber < element) {
                maxNumber = element;
            }
        }
        for (int element : array1) {
            if (result < element && element < maxNumber) {
                result = element;
            }
        }

        printArray(array1);
        System.out.println(result);
    }

    // Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(gcd(a, b) == gcd(b, c) && gcd(a, b) == gcd(a, c) && gcd(a, b) == 1);
    }

    public static long factorial(int n) {
        if (n > 20) throw new IllegalArgumentException(n + " is out of range");
        return (1 > n) ? 1 : n * factorial(n - 1);
    }

    // Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
    public static void task7() {
        long result;
        result = factorial(1) + factorial(3) + factorial(5) + factorial(7) + factorial(9);
        System.out.println(result);
    }

    // Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    // Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
    // массива с номерами от k до m.
    public static void task8() {
        int[] array1;
        array1 = fillArray(createArray());
        printArray(array1);
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int result = 0;
        for (int i = k; i < m; i++) {
            result += array1[i];
        }
        System.out.println(result);
    }

    // Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
    // если угол между сторонами длиной X и Y — прямой.
    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int t = scanner.nextInt();
        double result;
        int p;

        p = (x + y + z + t) / 2;
        result = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
        System.out.println(result);
    }

    public static void reverseArrayList(ArrayList<Integer> alist) {
        for (int i = 0; i < alist.size() / 2; i++) {
            Integer temp = alist.get(i);
            alist.set(i, alist.get(alist.size() - i - 1));
            alist.set(alist.size() - i - 1, temp);
        }
    }

    // Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
    // являются цифры числа N
    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();

        while (n > 0) {
            list.add(n % 10);
            n = n / 10;
        }

        reverseArrayList(list);
        Integer[] daysArray = list.toArray(new Integer[0]);

        System.out.println("Arraylist contains: ");
        printArray(daysArray);
    }

    // Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> listNumberN = new HashSet<>();
        HashSet<Integer> listNumberM = new HashSet<>();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int n = N;
        int m = M;


        while (n > 0) {
            listNumberN.add(n % 10);
            n = n / 10;
        }

        while (m > 0) {
            listNumberM.add(m % 10);
            m = m / 10;
        }

        if (listNumberN.size() > listNumberM.size()) {
            System.out.println(N + " size = " + listNumberN.size());
        } else {
            System.out.println(M + " size = " + listNumberM.size());
        }

    }

    public static int sumValue(double n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int sumValue(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    // Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
    // являются числа, сумма цифр которых равна К и которые не большее N.
    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        double k = scanner.nextDouble();
        double n = scanner.nextDouble();
        ArrayList<Double> list = new ArrayList<>();
        double i = 0;

        while (i++ < n) {
            if (sumValue(i) == k) {
                list.add(i);
            }
        }

        System.out.println("Array: ");
        for (Double elem : list) {
            System.out.format("%.0f ", elem);
        }
    }

    static boolean isPrime(int n) //func for checking prime
    {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count == 2;
    }

    // Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    // Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
    // решения задачи использовать декомпозицию.
    public static void task13() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the search range: ");
        n = scanner.nextInt();
        System.out.println("The Twin Prime Numbers within the given range [" + n + "," + 2 * n + "] are : ");

        for (int i = n; i <= (2 * n - 2); i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.print("(" + i + "," + (i + 2) + ") ");
            }
        }
    }

    public static boolean check(BigInteger number) {
        ArrayList<BigInteger> list = new ArrayList<>();
        BigInteger n = number;
        int check = 0;
        while (n.compareTo(BigInteger.valueOf(0)) > 0) {
            list.add(n.mod(BigInteger.valueOf(10)));
            n = n.divide(BigInteger.valueOf(10));
        }
        for (BigInteger elem : list) {
            check += pow(elem.intValue(), list.size());
        }
        return number.compareTo(BigInteger.valueOf(check)) == 0;
    }

    // Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
    // возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
    // использовать декомпозицию.
    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        BigInteger k = scanner.nextBigInteger();
        BigInteger i = BigInteger.valueOf(0);
        for (; (i.compareTo(k) < 0); i = i.add(BigInteger.ONE)) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }

    // Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
    // последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
    public static void task15() {

    }

    // Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    // Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
    public static void task16() {

    }

    // Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
    // действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
    public static void task17() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberIterations = 0;
        while (number > 1) {
            number -= sumValue(number);
            numberIterations++;
        }
        System.out.println(numberIterations);
    }

}
