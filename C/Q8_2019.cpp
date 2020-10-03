#include<stdio.h>
#include<string.h>

int main() {
	int n;
	scanf("%d", &n);
	int n1;
	scanf("%d", &n1);
	int n2;
	scanf("%d", &n2);
	char cmd;
	scanf(" %c", &cmd);
	int result = 0;
	if (cmd == '+') result = n1 + n2;
	else if (cmd == '-') result = n1 - n2;
	else if (cmd == '/') result = n1 / n2;
	else if (cmd == '*') result = n1 * n2;

	for (int i = 3; i < n; i+=2) {
		int n3;
		scanf("%d", &n3);
		scanf(" %c", &cmd);
		if (cmd == '+') result += n3;
		else if (cmd == '-') result -= n3;
		else if (cmd == '/') result /= n3;
		else if (cmd == '*') result *= n3;
	}//이항연산자임을 이용해보자
	printf("%d\n", result);
	
}