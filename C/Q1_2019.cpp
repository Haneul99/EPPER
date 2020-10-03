#include<stdio.h>

int main() {
	int n;
	scanf_s("%d", &n);
	int arr[100];
	for (int i = 0; i < n; i++) {
		scanf_s("%d", &arr[i]);
	}
	int sum = 0;
	for (int i = 0; i < n; i++) {
		if (arr[i] % 2 == 1) sum += arr[i];
	}
	printf("%d\n", sum);
}