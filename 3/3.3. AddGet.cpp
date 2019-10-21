#include <iostream>
#include <stdlib.h>
#include <ctime>

// ����������� �������� ADD � GET ��� �������� ����

using namespace std;

class Heap {
  static const int SIZE = 100; // ������������ ������ ����
  int *h;         // ��������� �� ������ ����
  int HeapSize; // ������ ����
public:

    Heap() // ����������� ����
    {
        h = new int[SIZE];
        HeapSize = 0;
    }

    void addelem(int n) // ���������� �������� ����
    {
        int i, parent;
        i = HeapSize;
        h[i] = n;
        parent = (i-1)/2;
        while(parent >= 0 && i > 0)  {
            if(h[i] > h[parent]) {
                int temp = h[i];
                h[i] = h[parent];
                h[parent] = temp;
            }
            i = parent;
            parent = (i-1)/2;
        }
        HeapSize++;
    }

    void outHeap(void) // ����� ��������� ���� � ����� ����
    {
        int i = 0;
        int k = 1;
        while(i < HeapSize) {
            while((i < k) && (i < HeapSize)) {
                cout << h[i] << " ";
                i++;
            }
            cout << endl;
            k = k * 2 + 1;
        }
    }

    void out(void) // ����� ��������� ���� � ����� �������
    {
        for(int i=0; i< HeapSize; i++) {
            cout << h[i] << " "; }
        cout << endl;
    }

    int getmax(void) // �������� ������� (������������� ��������)
    {
        int x;
        x = h[0];
        h[0] = h[HeapSize-1];
        HeapSize--;
        heapify(0);
        return(x);
    }

    void heapify(int i) // ������������ ����
    {
        int left, right;
        int temp;
        left = 2*i+1;
        right = 2*i+2;
        if(left < HeapSize) {
            if(h[i] < h[left]) {
                temp = h[i];
                h[i] = h[left];
                h[left] = temp;
                heapify(left);
            }
        }
        if(right < HeapSize) {
            if(h[i] < h[right]) {
                temp = h[i];
                h[i] = h[right];
                h[right] = temp;
                heapify(right);
            }
        }
    }
};

int main()
{
    srand(time(0));
    int n = 10;
    Heap heap;
    for(int i = 0; i < n; i++)
    {
        heap.addelem(rand()%100);
    }
    cout<<heap.getmax()<<endl;
    heap.outHeap();
    return 0;
}
