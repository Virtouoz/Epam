package com.company.epam.workingWithStringAsObject;

import java.util.Scanner;

public class WorkingWithStringAsObject {

    // Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int max = 0, curMax = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                curMax++;
                if (curMax > max) {
                    max = curMax;
                }
            } else {
                curMax = 0;
            }
        }
        System.out.println(max);
    }

    // В строке вставить после каждого символа 'a' символ 'b'.
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace("a", "ab");
        System.out.println(str);
    }

    // Проверить, является ли заданное слово палиндромом.
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()));
    }

    // С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
    public static void task4() {
        String str = "информатика";
        String stringBuilder = String.copyValueOf(str.toCharArray(), 7, 1) +
                String.copyValueOf(str.toCharArray(), 3, 2) +
                String.copyValueOf(str.toCharArray(), 7, 1);
        System.out.println(stringBuilder);
    }

    // Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int result = 0;
        for (char elem : str.toCharArray()) {
            if (elem == 'a') {
                result++;
            }
        }
        System.out.println(result);
    }

    // Из заданной строки получить новую, повторив каждый символ дважды.
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(str.length() * 2);
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.println(stringBuilder);
    }

    public static String regExFunc(String str) {
        return str.replaceAll("(?<nums>.+)\\k<nums>+", "${nums}");
    }

    public static String useStringBuilderFunction(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        int i = 0;
        while (i < stringBuilder.length()) {
            int j = 1 + i;
            while (j < stringBuilder.length()) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                    stringBuilder.deleteCharAt(j);
                } else {
                    j = j + 1;
                }
            }
            i = i + 1;
        }
        return stringBuilder.toString();
    }

    // Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
    // "abc cde def", то должно быть выведено "abcdef".
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace(" ", "");
        str = useStringBuilderFunction(str);
        System.out.println(str);
    }

    // Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай,
    // когда самых длинных слов может быть несколько, не обрабатывать.
    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";
        String[] words = str.split(" ");
        for (String elem : words) {
            if (elem.length() > result.length()) {
                result = elem;
            }
        }
        System.out.println(result);
    }

    // Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать
    // только английские буквы.
    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int x = 0;
        int j;
        for (int i = 97; i <= 122; i++) {
            j = 0;
            char c = (char) i;
            while (j < str.length()) {
                if (str.indexOf(Character.toString(c), j) != -1) {
                    x++;
                    j = str.indexOf(Character.toString(c), j) + 1;
                    if (j == str.length()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println("Количество строчных букв = " + x);
        System.out.println("Количество прописных букв = " + (str.replace(" ", "").length() - x));
    }

    // Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или
    // вопросительным знаком. Определить количество предложений в строке X.
    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.nextLine();
        int result = 0;
        String[] buffer = X.split("\\.");
        result += buffer.length > 1 ? buffer.length - 1 : 0;
        buffer = X.split("!");
        result += buffer.length > 1 ? buffer.length - 1 : 0;
        buffer = X.split("\\?");
        result += buffer.length > 1 ? buffer.length - 1 : 0;
        System.out.println(result + 1);
    }

}
