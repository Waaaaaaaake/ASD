#include <iostream>
#include <stdlib.h>
#include <ctime>
#include <assert.h>
#include <algorithm>

using namespace std;

void randarray(int* arr, int size)
{
    for(int i = 0; i < size; i++){
        arr[i] = rand()%100 - 50;
    }
}

void printarray(int* arr, int size)
{
    for(int i = 0; i< size; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}


void counting_sort(int* vec, int len, int min, int max) // Реализация сортировки подсчетами
{
	assert(min <= max);
	assert(vec != NULL);

	int * cnt = new int[max-min+1];

	for (int i = min; i <= max; ++i)
		cnt[i - min] = 0;

	for (int i = 0; i < len; ++i)
		++cnt[vec[i] - min];

	for (int i = min; i <= max; ++i)
		for(int j = cnt[i - min]; j--;)
			*vec++ = i;

	delete [] cnt;
}

int main()
{
    srand(time(0));
    int n = 10;
    int a[n];

    cout<<"CountingSort"<<endl;
    randarray(a, n);
    cout<<"Начальный массив"<<endl;
    printarray(a, n);
    counting_sort(a, n, -50, 50);
    cout<<"Отсортированный массив"<<endl;
    printarray(a, n);
    cout<<endl;

    return 0;
}
