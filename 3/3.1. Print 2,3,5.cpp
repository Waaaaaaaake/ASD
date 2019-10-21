#include <iostream>
#include <queue>

using namespace std;

queue<int> x2, x3, x5;

void printandadd(int t)
{
    if (t != 1) {cout<<t<<" ";};
    x2.push(2*t);
    x3.push(3*t);
    x5.push(5*t);
}

int main()
{
    int n;
    int x;
    cout<<"Enter number of elements: "; cin>>n;
    printandadd(1);
    for (int i = 1; i <= n; i++){
        x = min(min(x2.front(),x3.front()), x5.front());
        printandadd(x);
        if (x==x2.front()) {x2.pop();}
        if (x==x3.front()) {x3.pop();}
        if (x==x5.front()) {x5.pop();}
    }
    while(!x2.empty()) {
        x2.pop();
    }
    while(!x3.empty()) {
        x3.pop();
    }
    while(!x5.empty()) {
        x5.pop();
    }
    return 0;
}
