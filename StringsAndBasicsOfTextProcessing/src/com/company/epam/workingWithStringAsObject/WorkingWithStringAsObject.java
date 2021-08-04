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

    }

    // Проверить, является ли заданное слово палиндромом.
    public static void task3() {

    }

    // С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
    public static void task4() {

    }

    // Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
    public static void task5() {

    }

    // Из заданной строки получить новую, повторив каждый символ дважды.
    public static void task6() {

    }

    // Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
    //def", то должно быть выведено "abcdef".
    public static void task7() {

    }

    // Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
    //длинных слов может быть несколько, не обрабатывать.
    public static void task8() {

    }

    // Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
    //буквы.
    public static void task9() {

    }

    // Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
    //знаком. Определить количество предложений в строке X.
    public static void task10() {

    }

}
