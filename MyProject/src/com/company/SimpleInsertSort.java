package com.company;

import java.util.Random;

public class SimpleInsertSort {
    private Random random = new Random();
    private int temp;
    private int[] list = new int[10];

    // Инициализация списка

    public void setList() {
        System.out.println("Первоначальный массив: ");
        for (int i = 0; i < 10; i++) list[i] = random.nextInt(100);
    }


    // Алгоритм сортировки простыми вставками
    public void simpleInsertSort() {
        for (int i = 1; i < 10; i++) {
            for (int j = i; j > 0 && list[j-1] > list[j]; j--) {
                     temp = list[j];
                     list[j]  = list[j-1];
                     list[j-1] = temp;
            }
        }
    }

    // Показ массива
    public void showList() {
        System.out.println("Отсортированный массив");
        for (int i = 0; i < 10; i++) System.out.println(list[i]);
    }
}
