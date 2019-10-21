#include <iostream>
#include <cstdlib>
#include <cstdio>
#include <stack>
#include <string>
#include <iomanip>
#include <bits/stdc++.h>

using namespace std;


struct Node {
    int data;
    Node *left, *right;
};

// Создание узлов для  5.1.
Node* newNode(int data)
{
    Node* node = (Node*)malloc(sizeof(Node));
    node->data = data;
    node->left = node->right = NULL;
    return (node);
}

//Предварительная обработка индекса
void preOrder(Node* p, int indent = 0)
{
    if(p != NULL) {
        if (indent) {
            cout << setw(indent) << ' ';
        }
        cout<< p->data << "\n ";
        if(p->left) preOrder(p->left, indent+4);
        if(p->right) preOrder(p->right, indent+4);
    }
}

// Поиск индекса
int findIndex(string str, int si, int ei)
{
    if (si > ei)
        return -1;


    stack<char> s;

    for (int i = si; i <= ei; i++) {


        if (str[i] == '(')
            s.push(str[i]);


        else if (str[i] == ')') {
            if (s.top() == '(') {
                s.pop();


                if (s.empty())
                    return i;
            }
        }
    }

    return -1;
}

// обработка записи и возврат узла
Node* stringToTree(string &s, int &loc)
{
    if(loc>= s.size()) {
        return NULL;
    }
    int len = 0;
    while(loc+len < s.size() && (s[loc+len]!='(' && s[loc+len]!=')') ){
        len++;
    }
    string num_string = s.substr(loc,len);
    int num = atoi(num_string.c_str());
    Node* res = newNode(num);
    loc+=len;
    if ( s[loc]=='(') {
        res->left = stringToTree(s,++loc);
        loc++;
    }
    if ( s[loc]=='(') {
        res->right = stringToTree(s,++loc);
        loc++;
    }
    return res;
}
// контейнер
Node* stringToTreeWrapper(string& s) {
    int loc = 0;
    return stringToTree(s,loc);
}


int main()
{

    std::cout << "Бинарное дерево по его скобочной инфиксной записи 5.1"<< '\n';
    string str = "1(2(3(4))(5))(6(7)(8))";
    Node* root = stringToTreeWrapper(str);
    preOrder(root);



    return 0;
}
