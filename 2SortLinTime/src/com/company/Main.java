package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
17 September 2019, 10:00
Stanislav Lukyanov
Cортировка за линейное время. Статистика

1. Cортировка слиянием с использованием рекурсивного вызова
Опорный ресурс: https://habr.com/ru/post/281675/

2. Поиск медианы из трёх

3. Алгоритм Хоара (Быстрая сортировка с опорным элементом)
Опорный ресурс: https://prog-cpp.ru/sort-fast/

4. Алгоритм Шелла

5. Сортировка подсчётами
 */
public class Main {


    public static void show1(int[] array) {
        System.out.println("Начальный массив");
        for (int i = 0;i < 10; i++){
            System.out.println(array[i]);
        }
    }

    public static void show2(int[] array) {
        System.out.println("Отсортированный массив");
        for (int i = 0;i < 10; i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {

        int array[] = new int[10];

//        №1

        MergerSort1 mergerSort1 = new MergerSort1();
        mergerSort1.setArrays(array);
        System.out.println("Merger Sort");
        show1(array);
        mergerSort1.MergerSort1(array,0,9);
        show2(array);

//        №2

        MedianSort medianSort = new MedianSort();
        medianSort.setArrays(array);
        System.out.println("Median Sort");
        show1(array);
        System.out.println("Index: " + medianSort.MedianSort(array, 0,9));
        System.out.println(array[medianSort.MedianSort(array, 0,9)]);

//      #3

        HaoraSort haoraSort = new HaoraSort();
        haoraSort.setArrays(array);
        System.out.println("Haora Sort");
        show1(array);
        haoraSort.haoraSort(array,0,9);
        show2(array);

//      №4

        ShellSort shellSort = new ShellSort();
        shellSort.setArray(array);
        System.out.println("Shell Sort");
        show1(array);
        shellSort.shellSort(array);
        show2(array);

    }

}
