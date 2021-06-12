package com.company.epam.arraysOfArrays;

import java.util.Random;
import java.util.Scanner;

public class TasksArraysOfArrays {

    public static final int NUMBER_THREE = 3;
    public static final int NUMBER_FIVE = 5;


    // Вывод матрицы в консоль
    public static void print(int[][] matr) {
        for (int[] ints : matr) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);//+ "\t"
            }
            System.out.println();
        }
        System.out.println();
    }

    // Дана матрица. Вывести на экран все нечетные столбцы,
    // у которых первый элемент больше последнего.
    public static void task1Matr(int[][] matr) {
        for (int j = 0; j < matr[0].length; j++) {
            if (j % 2 == 0 && matr[0][j] > matr[matr.length - 1][j]) {
                for (int[] ints : matr) {
                    System.out.print(ints[j]);
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
        for (int[] ints : matr) {
            System.out.print(ints[p]);
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

    // Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static int task7Matr(double[][] matr) {
        int result = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = Math.sin(((Math.pow(i,2) - Math.pow(j,2)) / matr.length));
                System.out.print(matr[i][j]);
                if (matr[i][j] > 0)
                    result++;
            }
            System.out.println();
        }
        return result;
    }

    // В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
    // на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    // пользователь с клавиатуры.
    public static void task8Matr(int[][] matr, int n, int m) {
        int x;
        for (int i = 0; i < matr.length; i++) {
            x = matr[i][n];
            matr[i][n] = matr[i][m];
            matr[i][m] = x;
        }
    }

    // Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    // столбец содержит максимальную сумму.
    public static void task9Matr(int[][] matr) {
        int max = 0;
        int sumColumn;
        for (int[] ints : matr) {
            sumColumn = 0;
            for (int anInt : ints) {
                sumColumn += anInt;
            }
            if (max < sumColumn) {
                max = sumColumn;
            }
        }
        System.out.println(max);
    }

    // Найти положительные элементы главной диагонали квадратной матрицы.
    public static void task10Matr(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            System.out.print(matr[i][i] + " ");
        }
    }

    // Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    // которых число 5 встречается три и более раз.
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
                    System.out.println(i + 1);
                    break;
                }
            }
        }


    }

    // Поменять две строки в матрице.
    public static void changeTwoLines(int[][] matr, int n, int m) {
        int x;
        x = 0;
        for (int j = 0; j < matr[0].length; j++) {
            x = matr[n][j];
            matr[n][j] = matr[m][j];
            matr[m][j] = x;
        }
    }

    // Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    public static void task12Matr() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m;
        int n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        int[][] matr = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matr[i][j] = random.nextInt(11);
            }
        }
        print(matr);

        for (int newI = 0; newI < n - 1; newI++) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m; j++) {
                    if (matr[i][j] > matr[i + 1][j]) {
                        changeTwoLines(matr, i, i + 1);
                        break;
                    } else if (matr[i][j] < matr[i + 1][j]) {
                        break;
                    }
                }
            }
        }
        print(matr);
    }

    // Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
    public static void task13Matr() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m;
        int n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        int[][] matr = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matr[i][j] = random.nextInt(11);
            }
        }
        print(matr);

        for (int newI = 0; newI < n - 1; newI++) {
            for (int j = 0; j < n - 1; j++) {
                for (int i = 0; i < m; i++) {
                    if (matr[i][j] > matr[i][j + 1]) {
                        task8Matr(matr, j, j + 1);
                        break;
                    } else if (matr[i][j] < matr[i][j+ 1]) {
                        break;
                    }
                }
            }
        }
        print(matr);

    }

    // Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    // единиц равно номеру столбца.
    public static void task14Matr() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matr = new int[m][n];

        for (int j = 0; j < n; j++) {
            int counter = 0;
            for (int i = 0; i < m; i++) {
                Random random = new Random();
                matr[i][j] = random.nextInt(2);
                if (counter == j + 1) {
                    matr[i][j] = 0;
                }
                if (matr[i][j] == 1) {
                    counter++;
                }
            }
            if (counter != j + 1) {
                j--;
            }
        }

        print(matr);
    }

    // Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    public static void task15Matr() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matr = new int[m][n];

        int maxElement = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Random random = new Random();
                matr[i][j] = random.nextInt(11);
                if (maxElement < matr[i][j]) {
                    maxElement = matr[i][j];
                }
            }
        }
        print(matr);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matr[i][j] % 2 == 1) {
                    matr[i][j] = maxElement;
                }
            }
        }
        print(matr);
    }

    // Магическим квадратом порядка n называется квадратная матрица размера nxn,
    // составленная из чисел 1, 2, 3, ..., n^2. Построить магический квадрат
    // размером n*n.
    public static void task16Matr() {
        int N;
        int[][] magicSquare;
        int[][] magicSquareHelp;
        int mid;
        int k;
        int l;
        int value;
        int swap;
        String matrix;
        Scanner read = new Scanner(System.in);

        System.out.println("Введите N:");
        N = read.nextInt();

        if (N == 1) {
            System.out.println("Магический квадрат " + 1 + " порядка:");
            System.out.println(1);
        }

        if (N == 2) {
            System.out.println("Магический квадрат 2 порядка не существует.");
        }

        if ((N - 1) % 2 == 0) {
            magicSquare = new int[N][N];
            mid = N / 2;
            magicSquare[0][mid] = 1;
            k = N - 1;
            l = mid + 1;
            for (int i = 2; i <= N * N; i++) {
                if ((i - 1) % N == 0) {
                    k += 2;
                    l--;
                    magicSquare[k][l] = i;
                    k--;
                    l++;
                    continue;
                }
                if (k == -1) k = N - 1;
                if (l == N) l = 0;
                magicSquare[k][l] = i;
                k--;
                l++;
            }
            System.out.println("Магический квадрат " + N + " порядка:");
            for (int i = 0; i < magicSquare.length; i++) {
                matrix = "";
                for (int j = 0; j < magicSquare[i].length; j++) {
                    matrix += magicSquare[i][j] + " ";
                }
                System.out.println(matrix);
            }
        }

        if (N % 4 == 0) {
            magicSquare = new int[N][N];
            magicSquareHelp = new int[N][N];
            value = 1;
            for (int i = 0; i < magicSquare.length; i++) {
                for (int j = 0; j < magicSquare[i].length; j++) {
                    magicSquare[i][j] = value;
                    magicSquareHelp[i][j] = N * N + 1 - value;
                    value++;
                }
            }
            value = N / 4;
            for (int i = 0; i < magicSquare.length; i++) {
                if (value == 1) {
                    k = 0;
                } else {
                    k = 1;
                }
                magicSquare[i][i] = magicSquareHelp[i][i];
                magicSquare[N - 1 - i][i] = magicSquareHelp[N - 1 - i][i];
                while (k != value) {
                    if (magicSquare.length > i + k * 4) {
                        magicSquare[i][i + k * 4] = magicSquareHelp[i][i + k * 4];
                        magicSquare[N - 1 - i][i + k * 4] = magicSquareHelp[N - 1 - i][i + k * 4];

                        magicSquare[i + k * 4][i] = magicSquareHelp[i + k * 4][i];
                        magicSquare[N - 1 - i - k * 4][i] = magicSquareHelp[N - 1 - i - k * 4][i];
                    }
                    k++;
                }
            }
            System.out.println("Магический квадрат " + N + " порядка:");
            for (int i = 0; i < magicSquare.length; i++) {
                matrix = "";
                for (int j = 0; j < magicSquare[i].length; j++) {
                    matrix += magicSquare[i][j] + " ";
                }
                System.out.println(matrix);
            }
        }
        if ((N - 2) % 4 == 0) {
            magicSquare = new int[N][N];
            mid = N / 4;
            magicSquare[0][mid] = 1;
            k = N / 2 - 1;
            l = mid + 1;
            for (int i = 2; i <= N * N / 4; i++) {
                if ((i - 1) % (N / 2) == 0) {
                    k += 2;
                    l--;
                    magicSquare[k][l] = i;
                    k--;
                    l++;
                    continue;
                }
                if (k == -1) k = N / 2 - 1;
                if (l == N / 2) l = 0;
                magicSquare[k][l] = i;
                k--;
                l++;
            }
            for (int i = 0; i < N / 2; i++) {
                for (int j = 0; j < N / 2; j++) {
                    magicSquare[i + N / 2][j + N / 2] = magicSquare[i][j] + N * N / 4;
                    magicSquare[i][j + N / 2] = magicSquare[i][j] + N * N / 2;
                    magicSquare[i + N / 2][j] = magicSquare[i][j] + N * N / 4 * 3;
                }
            }
            for (int i = 0; i < N / 2 - 3; i++) {
                for (int j = 0; j < N / 2; j++) {
                    swap = magicSquare[j][(N - (N / 2 - 3)) / 2 + i];
                    magicSquare[j][(N - (N / 2 - 3)) / 2 + i] = magicSquare[j + N / 2][(N - (N / 2 - 3)) / 2 + i];
                    magicSquare[j + N / 2][(N - (N / 2 - 3)) / 2 + i] = swap;
                }
            }
            swap = magicSquare[0][0];
            magicSquare[0][0] = magicSquare[N / 2][0];
            magicSquare[N / 2][0] = swap;
            swap = magicSquare[N / 2 - 1][0];
            magicSquare[N / 2 - 1][0] = magicSquare[N - 1][0];
            magicSquare[N - 1][0] = swap;
            for (int i = 1; i <= N / 2 - 2; i++) {
                swap = magicSquare[i][1];
                magicSquare[i][1] = magicSquare[i + N / 2][1];
                magicSquare[i + N / 2][1] = swap;
            }
            System.out.println("Магический квадрат " + N + " порядка:");
            for (int i = 0; i < magicSquare.length; i++) {
                matrix = "";
                for (int j = 0; j < magicSquare[i].length; j++) {
                    matrix += magicSquare[i][j] + " ";
                }
                System.out.println(matrix);
            }
        }
    }



}
