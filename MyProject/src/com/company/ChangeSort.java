package com.company;

import java.util.Random;

public class ChangeSort {
    private int array[] = new int[10];
    private int tmp;
    final Random random = new Random();

    // метод инициализирует 10 случайных значений типа int в диапазоне от 0 до 100
    public void setArray() {
        System.out.println("Первоначальный массив:");
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
    }

    // алгоритм сортировки выбором
    // меняем два соседних элемента местами и заново идём по массиву
    public void changeSort() {
        for (int i = 1; i < 10; i++) {
            if (array[i] < array[i-1]) {
                tmp = array[i];
                array[i] = array[i-1];
                array[i-1] = tmp;
                i=0;
            }
        }
    }

    // Вывод массива
    public void showArray() {
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]+" ");
        }
    }
}
