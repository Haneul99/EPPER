#include<stdio.h>

int MAX(int a, int b) {
    return a > b ? a : b;
}//a와 b 중 더 큰 것을 반환

int solution(int n, int *arr) {
	int dp[30001] = { 0, };//dp 배열 선언 및 배열 전체를 0으로 초기화
	dp[1] = arr[1];//1인 경우 초기화
	dp[2] = arr[1] + arr[2];//2인 경우 초기화
	for (int i = 3; i <= n; i++) {
		dp[i] = MAX(dp[i - 2] + arr[i], MAX(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 1]));
		/*
		dp[i] : i번째까지 주웠을 때 최대로 주울 수 있는 돈
		1. dp[i - 2] + money[i]
		2. dp[i - 3] + money[i-1]+ money[i]
		3. dp[i - 1]
		중 최댓값을 dp[i]에 저장함.
		*/
	}//3부터 n 까지 dp값을 계산
	return dp[n];
}

int main() {
	int n;
	scanf("%d", &n);
	int money[30001] = { 0, };//money 배열 선언 및 배열 전체를 0으로 초기화
	for (int i = 1; i <= n; i++) {
		scanf("%d", &money[i]);
	}//money 배열에 입력 받음

	printf("%d\n", solution(n, money));//최댓값 출력
}