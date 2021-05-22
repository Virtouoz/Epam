package com.company.maintask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class OptionalTask1 {

    // Вывести числа в порядке возрастания (убывания) значений их длины.
    public static void optionalTask2(String[] args) {
        Arrays.sort(args, Comparator.comparing(String::length));

        for (String str : args) {
            System.out.println(str);
        }
    }

    // Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
    public static void optionalTask3(String[] args) {
        int sum = 0;
        for (String str : args) {
            sum += str.length();
        }
        int averageLength = sum / args.length;

        for (String str : args) {
            if (str.length() >= averageLength)
                System.out.println(str + " " + str.length());
        }
    }

    // Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
    public static void optionalTask4(String[] args) {
        int length = 999;
        String endStr = null;
        for (String str : args) {
            if (length > diffNum(Integer.parseInt(str))) {
                length = Integer.parseInt(str);
                endStr = str;
            }
        }
        System.out.println(endStr + " " + length);
    }

    private static int diffNum(int x) {
        HashSet<Integer> nums = new HashSet<>();
        while (x > 0) {
            nums.add(x % 10);
            x /= 10;
        }
        return nums.size();
    }

}
