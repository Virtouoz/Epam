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
        double result = array[0];
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
        double result = array[0];
        for (int i = 0; i < array.length / 2 - 1; i++) {
            if (result < Math.max(array[i], array[array.length - i - 1])) {
                result = Math.max(array[i], array[array.length - i - 1]);
            }
        }
        System.out.println(result);
    }

    // Дана последовательность действительных чисел.
    // Образовать новую последовательность, выбросив из
    // исходной те члены, которые равны min(a1, a2,..,an).
    public static void task8(double[] array) {
        double[] result;
        double min = array[0];
        int newSize = array.length;

        for (int i = 0; i < array.length - 1; i++) {
            if (min > Math.min(array[i], array[i + 1])) {
                min = Math.min(array[i], array[i + 1]);
            }
        }

        for (double v : array) {
            if (v == min) {
                newSize--;
            }
        }

        result = new double[newSize];

        for (int j = 0, i = 0; i < array.length && j < result.length; i++) {
            if (array[i] != min) {
                result[j] = array[i];
                System.out.println(result[j]);
                j++;

            }
        }
    }

    // В массиве целых чисел с количеством элементов n
    // найти наиболее часто встречающееся число. Если таких
    // чисел несколько, то определить наименьшее из них.
    public static void task9(int[] array) {
        final int EXC = 0;                                  // Число которое будет заменять исключенные элементы
        int resultElement = 0;
        int counterElement = 0;
        int[] exceptionNumbers = new int[array.length];     // Массив исключений
        int counterOfSameNumbers = 0;                       // Счетчик одинаковых чисел
        int counter = 0;                                    // Счетчик массива исключений
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j] && array[j] != EXC) { // Если числа одинаковы и число не исключено
                    counterOfSameNumbers++;                 // Прибавляем счетчик одинаковых чисел
                    exceptionNumbers[counter] = array[j];   // Добавляем потенциально исключаемое число в массив исключений
                }
            }
            if (counterOfSameNumbers > 1) {                  // Если найдено больше одного совпадения
                if (counterElement < counterOfSameNumbers || counterElement == counterOfSameNumbers && resultElement > array[i]) {
                    counterElement = counterOfSameNumbers;
                    resultElement = array[i];
                }
                // Выводим данные на экран
                for (int j = 0; j < array.length; j++) {    // Исключаем данное число из поиска
                    if (array[j] == exceptionNumbers[counter]) array[j] = EXC;
                }
            }
            counterOfSameNumbers = 0;
            counter++;
        }
        System.out.println(resultElement + "   " + counterElement);
    }

    // Дан целочисленный массив с количеством элементов n.
    // Сжать массив, выбросив из него каждый второй
    // элемент (освободившиеся элементы заполнить нулями).
    // Примечание. Дополнительный массив не использовать.
    public static void task10(int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            array[i / 2] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array.length / 2 <= i) {
                array[i] = 0;
            }
            System.out.println("i = " + i + " element = " + array[i]);
        }
    }

}
