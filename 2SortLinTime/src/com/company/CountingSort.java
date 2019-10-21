package com.company;
import java.util.Random;

public class CountingSort {

    Random random = new Random();

    public void setArrays(int[] array) {
        for (int i = 0; i < 10; i++) array[i] = random.nextInt(100);
    }

    // реализация алгоритма сортировки подсчётами
    public void countingSort(int [] array, int min, int max) {
    assert(min <= max);
    
    }



}
