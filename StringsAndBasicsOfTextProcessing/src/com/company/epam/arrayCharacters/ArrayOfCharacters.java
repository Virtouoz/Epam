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
    }

    // В строке найти количество чисел.
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                result++;
                while (str.charAt(i) >= '0' && str.charAt(i) <= '9' && i < str.length() - 1) {
                    i++;
                }
            }
            if (i == str.length() - 2) {
                char char1 = str.charAt(str.length() - 2);
                char char2 = str.charAt(str.length() - 1);
                if ((char1 < '0' || char1 > '9') && (char2 >= '0' && char2 <= '9')) {
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    // Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    // Крайние пробелы в строке удалить.
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // trim() - возвращает копию строки с пропущенными начальными и конечными пробелами,
        //   другими словами метод позволяет в Java удалить пробелы в начале и конце строки.
        str = str.trim().replaceAll("(\\s)+", "$1");
        System.out.println(str);
    }

}
