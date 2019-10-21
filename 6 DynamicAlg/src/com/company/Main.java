package com.company;

// 30.09 11-24 Stanislav Lukyanov
// src: https://habr.com/ru/post/261159/
// #1 Реализация вычисления числа Фибоначи методом динамического программирования


// 2. Алгоритм задачи о перемножении матриц
// src: https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B4%D0%B0%D1%87%D0%B0_%D0%BE_%D0%BF%D0%BE%D1%80%D1%8F%D0%B4%D0%BA%D0%B5_%D0%BF%D0%B5%D1%80%D0%B5%D0%BC%D0%BD%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F_%D0%BC%D0%B0%D1%82%D1%80%D0%B8%D1%86#%D0%A0%D0%B5%D1%88%D0%B5%D0%BD%D0%B8%D0%B5_%D0%B7%D0%B0%D0%B4%D0%B0%D1%87%D0%B8
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //#1
    System.out.println("Fibbonaci");
    int input;
    Fib fib = new Fib();
    System.out.println("Number of Elements");
    Scanner scanner = new Scanner(System.in);
    input = scanner.nextInt();
    fib.Fib(input);

    System.out.println("Matrix Chain Order");
    MatrixChainOrder matrixChainOrder = new MatrixChainOrder();
    // 4 матрицы размерностью 40x20, 20x30, 30x10, 10x30
    int arr[] = {40,20,30,10,30};
    int size = (arr.length*Integer.SIZE) / Integer.SIZE;
    System.out.println("Min number multiplications matrix chain Order EQUAL= " + matrixChainOrder.MatrixChainOrder(arr, size));
    }
}
