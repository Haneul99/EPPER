#include<stdio.h>
#include<string.h>

int arr[10];
int count;

void recursive(int a, int b) {
	if (a >= b) return;
	else {
		if (arr[a] == arr[b]) {
			recursive(a + 1, b - 1);
		}
		else {
			if (arr[a] > arr[b]) {
				arr[b - 1] += arr[b];
				count++;
				recursive(a, b - 1);
			}
			else {
				arr[a + 1] += arr[a];
				count++;
				recursive(a + 1, b);
			}
		}
	}
}

int main() {
	int n;
	scanf("%d", &n);
	for (int i = 0; i < n; i++)
		scanf("%d", &arr[i]);
	count = 0;
	recursive(0, n - 1);
	printf("%d\n", count);
}