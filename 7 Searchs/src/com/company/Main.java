package com.company;
// 30.09 13-10 Stanislav Lukyanov

import java.util.Scanner;
// #1   Реализация алгоритма поиска в ширину
// src: https://java2blog.com/breadth-first-search-in-java/
// #2 Реализация алгоритма поиска в глубину
// #3 Реализацияя алгоритма Дейкстры кратчайшего пути из одной вершины


public class Main {

    final static int n = 4;
//   #1
    static int GM[][] = {{ 0, 1, 0, 1 },	{ 1, 0, 1, 0 }, { 1, 0, 0, 1 }, { 1, 0, 0, 0 }};
//   #2
    static int graph[][] = {
            {0,1,0,0,1},
            {1,0,1,1,0},
            {0,1,0,0,1},
            {0,1,0,0,1},
            {1,0,1,1,0}
    };

    public static void main(String[] args) {
    	// #1

//        int start;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter start count");
//        start = scanner.nextInt();
//        BFS bfs = new BFS();
//        boolean [] visited = new boolean[n];
//        System.out.println("Find Search");
//        for (int i = 0; i<n; i++) {
//            visited[i] = false;
//            for (int j = 0; j<n; j++)
//                System.out.println(GM[i][j]);
//        }
//        System.out.println("BFS Result");
//        bfs.BFS(visited, start - 1);


//        #2

//        System.out.println("DFS ");
//        boolean [] visited1 = new boolean[n];
//        DFS dfs = new DFS();
//        int start1;
//        Scanner scanner1 = new Scanner(System.in);
//
//        System.out.println("Full graph");
//
//        for (int i = 0; i < n; i++) {
//            visited1[i] = false;
//            for (int j = 0; j < n; j++) {
//                System.out.println(graph[i][j]);
//            }
//
//            System.out.println();
//        }
//        System.out.println("Enter start count");
//        start1 = scanner1.nextInt();
//        System.out.println("DFS Working");
//        dfs.DFS(visited1, start1 - 1);


    }


}
