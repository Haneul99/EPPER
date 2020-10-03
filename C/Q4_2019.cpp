#include<stdio.h>

int main() {
	int n;
	scanf_s("%d", &n);
	int num[100];
	for (int i = 0; i < n; i++) {
		scanf_s("%d", &num[i]);
	}
	for (int i = 0; i < n; i++) {
		int t = num[i] % 100;
		if (t >= 50) printf("%d %d\n", num[i] + (100 - t), num[i] - t);
		else printf("%d %d\n", num[i] - t, num[i] - t);
	}
}