package com.company;

import java.util.Arrays;
import java.util.Random;


//Сортировка слиянием с использованием рекурсии
//

public class MergerSort1 {
    private Random random = new Random();

    public void setArrays(int[] array1) {
        for (int i = 0; i < 10; i++) array1[i] = random.nextInt(100);
    }

    // Алгоритм через рекурсию

   public void MergerSort1(int[] arr, int le, int ri) {

        if (ri <= le)
            return;
        int mid = le + (ri - le) / 2;
        MergerSort1(arr, le, mid);
        MergerSort1(arr, mid + 1, ri);

        int[] buf = Arrays.copyOf(arr, arr.length);

        for (int k = le; k <= ri; k++)
            buf[k] = arr[k];

        int i = le, j = mid + 1;
        for (int k = le; k <= ri; k++) {

            if (i > mid) {
                arr[k] = buf[j];
                j++;
            } else if (j > ri) {
                arr[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                arr[k] = buf[j];
                j++;
            } else {
                arr[k] = buf[i];
                i++;
            }
        }
    }

}
