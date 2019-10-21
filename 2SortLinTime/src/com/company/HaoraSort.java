package com.company;

import java.util.Random;

public class HaoraSort {
    private Random random = new Random();
    public void setArrays(int[] array1) {
        for (int i = 0; i < 10; i++) array1[i] = random.nextInt(100);
    }

    public void haoraSort(int[] arr, int left, int right) {
        int center;
        int leleft = left, reright = right;
        // опорный элемент всегда первый
        center = arr[left];
        while (left < right) {
            // сдвигаем правую границу
            while ((arr[right] >= center) && (left < right)) right--;
            if (left != right) {
                arr[left] = arr[right];
                left++;
            }
            //сдвигаем левую границу
            while ((arr[left] <= center) && (left < right)) left++;
            if (left != right) {
                arr[right] = arr[left];
                right--;
            }
        }
        arr[left] = center;
        center = left;
        left = leleft;
        right = reright;
        if (left < center)
            haoraSort(arr, left, center - 1);
        if (right > center)
            haoraSort(arr, center + 1, right);
    }
}
