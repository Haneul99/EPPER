#include<stdio.h>

int main() {
	int n;
	scanf("%d", &n);
	int arr[10001];
	int i;
	scanf("%d", &i);
	int j;
	scanf("%d", &j);
	for (int i = 1; i <= n; i++) {
		scanf("%d", &arr[i]);
	}
	int result = 0;
	for (int k = i; k <= j; k++) {
		result += arr[k];
	}
	printf("%d\n", result);
	
}

//3Ка 22УЪ