package com.company;

public class BFS {

    final int n = 4;

    int GM[][] = {{ 0, 1, 0, 1 },	{ 1, 0, 1, 0 }, { 1, 0, 0, 1 }, { 1, 0, 0, 0 }};


    public void BFS(boolean visited[], int unit) {

        int [] queue = new int [n];
        int count, head;
        for (int i = 0; i < n; i++)
            queue[i] = 0;
        count = 0;
        head = 0;

        queue[count++] = unit;
        visited[unit] = true;
        while (head < count) {
            unit = queue[head++];
            System.out.println(unit + 1 + " ");
            for (int i = 0; i < n; i++) {
                if((GM[unit][i] == 1) && (!visited[i])) {
                    queue[count++] = i;
                    visited[i] = true;
                }
            }
        }

    }
}