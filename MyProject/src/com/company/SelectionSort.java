package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

// Сортировка выбором
// Реализовано через списки
public class SelectionSort {

    private ArrayList<Integer> basic_list = new ArrayList<Integer>();
    private ArrayList<Integer> new_list = new ArrayList<Integer>();
    private int smallest_element;
    private Random random = new Random();


    // метод инициализации базового списка
    public void setBasicArray() {
        System.out.println("Первоначальный массив: ");
        for (int i = 0; i < 10; i++) basic_list.add(random.nextInt(100));
    }

    // метод поиска индекса наименьшего элемента
    private int findSmallest(ArrayList<Integer> arrayList) {
        int smallest = arrayList.get(0);
        int smallest_index = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) < smallest) {
                smallest = arrayList.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }
    // Поиск наименьшего элемента в списке, внесение его первым элементом в другой список, удаление его из базового
    public void selectionSort() {
        for (int i = 0 ;i < 10; i++) {
            smallest_element = findSmallest(basic_list);
            new_list.add(basic_list.get(smallest_element));
            basic_list.remove(smallest_element);
        }
    }

    // метод отображения
    public void showNewList() {
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(new_list.get(i));
        }
    }
}

