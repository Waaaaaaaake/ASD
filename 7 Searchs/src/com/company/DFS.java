package com.company;

public class DFS {
    final int n = 5;

    static int graph[][] = {
            {0,1,0,0,1},
            {1,0,1,1,0},
            {0,1,0,0,1},
            {0,1,0,0,1},
            {1,0,1,1,0}
    };

    public void DFS(boolean [] visited, int st) {
        System.out.println(st + 1);
        visited[st] = true;

        for (int i = 0; i < n; i++) {
            if ((graph[st][i] != 0) && (!visited[i])) {
                DFS(visited, i);
            }
        }
    }
}
