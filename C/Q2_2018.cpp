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
b***	1��° �ٿ��� 3��
bb*		2��° �ٿ��� 1��
*/


//7�� 51��