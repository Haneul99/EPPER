#include<stdio.h>

int main() {
	int n;
	scanf("%d", &n);
	for (int i = 1; i <= n / 2 + 1; i++) {
		for (int j = n / 2 - i; j >= 0; j--) {
			printf(" ");
		}
		for (int j = 0; j < 2 * i - 1; j++) {
			printf("*");
		}
		printf("\n");
	}
	for (int i = 1; i < n / 2 + 1; i++) {
		for (int j = 0; j < i; j++) {
			printf(" ");
		}
		for (int j = n - 2 * i; j > 0; j--) {
			printf("*");
		}
		printf("\n");
	}
}

/*
bb*
b***
*****
b***	1번째 줄에서 3개
bb*		2번째 줄에서 1개
*/


//7분 51초