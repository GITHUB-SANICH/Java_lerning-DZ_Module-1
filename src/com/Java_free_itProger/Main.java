package com.Java_free_itProger;
public class Main {
    public static void main(String[] args) {
        // Задания на модуль #1
        // 1) Напишите программу на Java, что будет высчитывать сумму чисел кратных 3 или 5. Числа должны быть от 0 до 1000.
        // 2) Создайте двумерный массив, в котором найдите минимальный элемент среди всех элементов в массиве. Важно учесть, что нахождение минимального элемента должно производиться при помощи циклов. Массив:
        System.out.println("1-е задание: Вывод суммы числе кратных 3/5 от 0 до 1000 == "+addition());
        int[][] x = {{20, 34, 2}, {9, 12, 18}, {3, 4, 5}};
        System.out.println("2-е задание: Вывод минимального элемента из двумерного массива == "+getMinEll(x));
    }

    private static int addition() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }
    private static int getMinEll(int[][] array) {
        int minnEllGlobal = array[0][0];
        int minnEll = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                minnEll = array[i][j] < array[i][j - 1] ? array[i][j] : array[i][j - 1];
                if (minnEll < minnEllGlobal) minnEllGlobal = minnEll;
            }
        }
        return minnEllGlobal;
    }
}