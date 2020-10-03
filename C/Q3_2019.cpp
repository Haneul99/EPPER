#include<stdio.h>

int main() {
	int n;
	scanf_s("%d", &n);
	for (int i = 1; i <= n; i++) {
		for (int j = i; j < n; j++) printf(" ");
		for (int k = n-i; k < n; k++) printf("*");
		printf("\n");
	}
}