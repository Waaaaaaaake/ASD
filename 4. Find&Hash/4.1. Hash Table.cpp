#include<iostream>
#include <list>
using namespace std;

class Hash // Хэш-таблица со списками

{
    // переменная-хранилище
    int BUCKET;

    // инициализация списка для хранилища таблицы
    list<int> *table;

public:
    Hash(int V);

    // Вставка
    void insertItem(int x);

    // Удаление
    void deleteItem(int key);

    // Поиск
    void searchItem(int key);

    // Основная функция
    int hashFunction(int x) {
        return (x % BUCKET);
    }
    // Показ
    void displayHash();
};

Hash::Hash(int b)
{
    this->BUCKET = b;
    table = new list<int>[BUCKET];
}

void Hash::insertItem(int key)
{
    int index = hashFunction(key);
    table[index].push_back(key);
}

void Hash::searchItem(int key)
{

  int index = hashFunction(key);


  list <int> :: iterator i;
  for (i = table[index].begin();
           i != table[index].end(); i++) {
    if (*i == key)
      break;
  }


  if (i != table[index].end()){
        cout << index;
        cout << " --> " << *i;
        cout << endl;
  }
}

void Hash::deleteItem(int key)
{

  int index = hashFunction(key);


  list <int> :: iterator i;
  for (i = table[index].begin();
           i != table[index].end(); i++) {
    if (*i == key)
      break;
  }


  if (i != table[index].end())
    table[index].erase(i);
}


void Hash::displayHash() {
  for (int i = 0; i < BUCKET; i++) {
    cout << i;
    for (auto x : table[i])
      cout << " --> " << x;
    cout << endl;
  }
}


int main()
{

  int a[] = {15, 11, 27, 8, 12};
  int n = sizeof(a)/sizeof(a[0]);


  Hash h(7);

  for (int i = 0; i < n; i++)
    h.insertItem(a[i]);


  h.deleteItem(12);


  h.searchItem(11);


  cout<<endl;


  h.displayHash();

  return 0;
}
