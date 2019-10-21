package com.company;

import java.util.Random;

public class ShellSort {
    private Random random = new Random();

    public void setArray(int [] array) {
        for (int i = 0; i< array.length; i++) array[i] = random.nextInt(100);
    }

    // вычисление последовательности приращений

    private void insertionSort (int[] arr, int start, int inc)
    {
        int tmp;
        for (int i = start; i < arr.length - 1; i += inc)
            for (int j = Math.min(i+inc, arr.length-1); j-inc >= 0; j = j-inc)
                // сортировка вставками с инкрементами inc[]
                if (arr[j - inc] > arr[j])
                {
                    tmp = arr[j];
                    arr[j] = arr[j-inc];
                    arr[j-inc] = tmp;
                }
                else break;
    }
    public void shellSort(int[] array) {
        for (int inc = array.length / 2; inc >= 1; inc = inc / 2)
            for (int step = 0; step < inc; step++)
                insertionSort (array, step, inc);
    }
}
