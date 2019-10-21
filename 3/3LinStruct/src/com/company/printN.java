package com.company;

import java.util.ArrayDeque;

// 1. Напечатать в порядке возрастания первые n натуральных чисел, в разложение
// которых на простые множители входят только числа 2, 3 и 5.
// Алгоритм использует очереди.

public class printN {

    ArrayDeque<Integer> x2 = new ArrayDeque<Integer>();
    ArrayDeque<Integer> x3 = new ArrayDeque<Integer>();
    ArrayDeque<Integer> x5 = new ArrayDeque<Integer>();


    private void addN(int a, ArrayDeque<Integer> xx2, ArrayDeque<Integer> xx3, ArrayDeque<Integer> xx5 ) {
        if (a != 1) System.out.println(a + " ");
        xx2.push(2 * a);
        xx3.push(3 * a);
        xx5.push(5 * a);
    }

    public void printN(int n) {
        int x;
        addN(1, x2, x3, x5);
        for (int i = 1; i <=n; i++) {
            x = Math.min(Math.min(x2.peek(), x3.peek()), x5.peek());
            addN(x, x2, x3, x5);
            if (x == x2.peek()) x2.pop();
            if (x == x3.peek()) x3.pop();
            if (x == x5.peek()) x5.pop();
        }
        while (!x2.isEmpty()) x2.pop();
        while (!x3.isEmpty()) x3.pop();
        while (!x5.isEmpty()) x5.pop();
    }


}
