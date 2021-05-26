package com.company.epam.oneDimensionalArrays;

public class OneDimensionalArrays {

    // В массив A [N] занесены натуральные числа.
    // Найти сумму тех элементов, которые кратны данному К.
    public static void task1(int[] array, int K) {
        int result = 0;
        for (int element : array) {
            if (element % K == 0) {
                result += element;
            }
        }
        System.out.println(result);
    }

    //  Дана последовательность действительных чисел а1 ,а2 ,..., ап.
    //  Заменить все ее члены, большие данного Z, этим числом.
    //  Подсчитать количество замен.
    public static void task2(double[] array, double Z) {
        int numberOfSubstitutions = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= Z) {
                array[i] = Z;
                numberOfSubstitutions++;
            }
        }
        System.out.println(numberOfSubstitutions);
    }

    // Дан массив действительных чисел, размерность которого N.
    // Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
    public static void task3(double[] array) {
        int numberOfPositive = 0;
        int numberOfNegative = 0;
        int numberOfZero = 0;

        for (double element : array) {
            if (element > 0) {
                numberOfPositive++;
            } else if (element == 0) {
                numberOfZero++;
            } else {
                numberOfNegative++;
            }
        }

        System.out.println("Number of positive = " + numberOfPositive);
        System.out.println("Number of zero = " + numberOfZero);
        System.out.println("Number of negative = " + numberOfNegative);
    }

    // Даны действительные числа а1 ,а2 ,..., аn .
    // Поменять местами наибольший и наименьший элементы
    public static void task4(double[] array) {
        double element = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = element;
    }

    // Даны целые числа а1 ,а2 ,..., аn .
    // Вывести на печать только те числа, для которых аi > i.
    public static void task5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println(array[i]);
            }
        }
    }

    // Задана последовательность N вещественных чисел.
    // Вычислить сумму чисел, порядковые номера которых являются простыми числами.
    public static void task6(double[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkPrimeNumber(i)) {
                result += array[i];
                System.out.println(i + " " + array[i]);
            }
        }
        System.out.println(result);
    }

    private static boolean checkPrimeNumber(int number) {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            temp = number % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // Даны действительные числа
    // Найти max(a1 + a2n, a2 + a2n−1,..,an + an+1)
    public static void task7(double[] array) {
        double result = 0;
        for (int i = 0; i < array.length / 2 - 1; i++) {
            if (result < Math.max(array[i], array[array.length - i - 1])) {
                result = Math.max(array[i], array[array.length - i - 1]);
            }
        }

        System.out.println(result);
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
