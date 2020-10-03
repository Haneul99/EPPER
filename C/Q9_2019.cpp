#include<stdio.h>
#include<string.h>

int getMax(int a, int b, int c) {
	if (a >= b && a >= c) return a;
	else if (b >= a && b >= c) return b;
	else return c;
}

int main() {
	int n;
	scanf("%d", &n);
	int money[30000];
	for (int i = 1; i <= n; i++) {
		scanf("%d", &money[i]);
	}
	int dp[30001];
	int max = 0;
	dp[0] = 0;
	if (n >= 1) {
		dp[1] = money[1];
		if (max < dp[1]) max = dp[1];
		printf("getMax: %d\n", dp[1]);
	}
	if (n >= 2) {
		dp[2] = money[1] + money[2];
		if (max < dp[2]) max = dp[2];
		printf("getMax: %d\n", dp[2]);
	}
	if (n >= 3) {
		dp[3] = getMax(money[1] + money[2], money[1] + money[3], money[2] + money[3]);
		if (max < dp[3]) max = dp[3];
		printf("getMax: %d\n", dp[3]);
	}
	for (int i = 4; i <= n; i++) {
		dp[i] = getMax(dp[i - 1], dp[i - 2] + money[i], dp[i - 3] + money[i - 1] + money[i]);
		printf("getMax: %d\n", dp[i]);
		if (max < dp[i]) max = dp[i];
	}
	printf("%d\n", max);
	
}