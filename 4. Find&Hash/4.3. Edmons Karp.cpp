#include<cstdio>
#include<cstdio>
#include<queue>
#include<cstring>
#include<vector>
#include<iostream>
#include<conio.h>

// Реализация алгоритма Эдмонса-Карпа
// нахождения максимального потока в транспортной сети
// https://ru.wikipedia.org/wiki/%D0%90%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC_%D0%AD%D0%B4%D0%BC%D0%BE%D0%BD%D0%B4%D1%81%D0%B0_%E2%80%94_%D0%9A%D0%B0%D1%80%D0%BF%D0%B0
using namespace std;

int capacities[10][10];
int flowPassed[10][10];
vector<int> graph[10];
int parentsList[10];
int currentPathCapacity[10];
//  поиск в ширину
int bfs(int startNode, int endNode)
{
    memset(parentsList, -1, sizeof(parentsList));
    memset(currentPathCapacity, 0, sizeof(currentPathCapacity));

    queue<int> q;
    q.push(startNode);

    parentsList[startNode] = -2;
    currentPathCapacity[startNode] = 999;

    while(!q.empty())
    {
        int currentNode = q.front();
        q.pop();

        for(int i=0; i<graph[currentNode].size(); i++)
        {
            int to = graph[currentNode][i];
            if(parentsList[to] == -1)
            {     //Если разница текущей мощности и мощности потока ещё есть
                if(capacities[currentNode][to] - flowPassed[currentNode][to] > 0)
                {
                  // то меняем местами
                    parentsList[to] = currentNode;
                    currentPathCapacity[to] = min(currentPathCapacity[currentNode],
                    capacities[currentNode][to] - flowPassed[currentNode][to]);
                    if(to == endNode)
                    {
                        return currentPathCapacity[endNode];
                    }
                    q.push(to);
                }
            }
        }
    }
    return 0;
}

int edmondsKarp(int startNode, int endNode)
{
    int maxFlow = 0;
      while(true)
    {
        int flow = bfs(startNode, endNode);
        if (flow == 0)
        {
            break;
        }
        maxFlow += flow;
        int currentNode = endNode;
        while(currentNode != startNode)
        {
            int previousNode = parentsList[currentNode];
            flowPassed[previousNode][currentNode] += flow;
            flowPassed[currentNode][previousNode] -= flow;
            currentNode = previousNode;
        }
    }
    return maxFlow;
}
int main()
{
    int nodesCount, edgesCount;
    cout<<"Введите количество узлов и ребер\n";
    cin>>nodesCount>>edgesCount;

    int source, sink;
    cout<<"Введите источник и провал\n";
    cin>>source>>sink;

    for(int edge = 0; edge < edgesCount; edge++)
    {
        cout<<"Введите начальную и конечную вершину вместе с ёмкостью\n";
        int from, to, capacity;
        cin>>from>>to>>capacity;

        capacities[from][to] = capacity;
        graph[from].push_back(to);

        graph[to].push_back(from);
    }

    int maxFlow = edmondsKarp(source, sink);

    cout<<endl<<endl<<"Максимальный поток: "<<maxFlow<<endl;
}
