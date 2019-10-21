package com.company;

import javax.lang.model.element.Element;
import java.util.Random;

public class MedianSort {
    private Random random = new Random();

    public void setArrays(int[] array1) {
        for (int i = 0; i < 10; i++) array1[i] = random.nextInt(100);
    }

    private void swapElements(int a, int b) {
        int tmp = a;
        b = a;
        a = tmp;
    }

    public int MedianSort(int[] arr, int left, int right) {
        int x = arr[left], y = arr[(right - left) / 2 + left], z = arr[right - 1], i = right - 1, j = right;
        if (y > x && y < z || y > z && y < x) x = y;
        else if (z > x && z < y || z > y && z < x) x = z;
        while (true) {
            do {
                j--;
            } while (arr[j] > x);
            do {
                i++;
            } while (arr[i] < x);
            if (i < j)
                swapElements(arr[i], arr[j]);
            else
                return j + 1;
        }
    }
}

