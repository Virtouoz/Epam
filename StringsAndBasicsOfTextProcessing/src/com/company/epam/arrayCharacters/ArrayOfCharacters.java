package com.company.epam.arrayCharacters;

import java.util.Scanner;

public class ArrayOfCharacters {

    // Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                str = str.replace("" + str.charAt(i), "_" + (char) (str.charAt(i) + 32));
            }
        }
        System.out.println(str);
    }

    // Замените в строке все вхождения 'word' на 'letter'.
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        str = str.replace("word", "letter");
        System.out.println(str);
    }

    // В строке найти количество цифр.
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                result++;
            }
        }
        System.out.println(result);

        System.out.println(((int) 'A') + 25);
        System.out.println((int) 'a');
        System.out.println((int) 'Z');
        System.out.println((int) 'z');
    }

    // В строке найти количество чисел.
    public static void task4() {

    }

    // Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    // Крайние пробелы в строке удалить.
    public static void task5() {

    }

}
