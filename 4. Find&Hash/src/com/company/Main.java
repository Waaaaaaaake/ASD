package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;


// 30.09 9-23 Stanislav Lukyanov
public class Main {

//    2. Реализация алгоритмов Бойера-Мура, Рабина и Кнута-Морриса-Пратта.
//    src: https://www.sanfoundry.com/java-program-boyer-moore-algorithm/
//    Поиск подстроки в строке

//    3. Реализация алгоритма Эдмонта Карпа


    public static void main(String[] args) throws IOException {


        //

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Тест Алгоритма Бойера-Мура\n");
        System.out.println("\nВведите текст\n");
        String text = br.readLine();
        System.out.println("\nВведите паттерн\n");
        String pattern = br.readLine();
        AlgBM algBM = new AlgBM();

        algBM.findPattern(text, pattern);


        // #3
//
//        int capacities[][] = new int[10][10];
//        int flowPassed[][] = new int [10][10];
//        Vector<Integer> graph[] = new Vector[10];
//        int parentsList[] = new int[10];
//        int currentPathCapacity[] = new int[10];
//
//        int nodesCount, edgesCount;
//        System.out.println("enter the number of nodes and edges\n");
//        BufferedReader brd = new BufferedReader(new InputStreamReader(System.in));
//        nodesCount = br.read();
//        edgesCount = br.read();





    }
}
