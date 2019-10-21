#include <bits/stdc++.h>
// 11-20 30.09 Stanislav Lukyanov
// src: https://habr.com/ru/post/144850/

using namespace std;

struct Node {
	char value;
	Node *left, *right;
};

bool IsOperator(char c){
	if (c == '+' || c == '-' ||
			c == '*' || c == '/')
		return true;
	return false;
}

void InOrder(Node *t) {
	if(t){
		InOrder(t->left);
		cout << t->value << "  ";
		InOrder(t->right);
	}
}

Node* AddNode(int x){
	Node *node = new Node;
	node->left = node->right = NULL;
	node->value = x;
	return node;
}
ы
Node* ConstructTree(char postfix[]){
	stack<Node *> st;
	Node *t, *t1, *t2;

	for(int i=0; i < strlen(postfix); i++) {
		if(!IsOperator(postfix[i])) {
			t = AddNode(postfix[i]);
			st.push(t);
		}
		else
		{
			t = AddNode(postfix[i]);

			t1 = st.top();
			st.pop();
			t2 = st.top();
			st.pop();

			t->right = t1;
			t->left = t2;

			st.push(t);
		}

	}

	t = st.top();
	st.pop();

	return t;
}

// Инфиксный обход

int main(int argc, char** argv) {

	std::cout << "Rekursive Algoritms" << '\n';

	char postfix[] = "ab+ef*g*-";
	Node* root = ConstructTree(postfix);
	cout << "Infix notation: " << endl;
	InOrder(root);
	cout << endl;

	return 0;
}
