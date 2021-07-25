#include<stdio.h>

int MAX(int a, int b) {
    return a > b ? a : b;
}//a�� b �� �� ū ���� ��ȯ

int solution(int n, int *arr) {
	int dp[30001] = { 0, };//dp �迭 ���� �� �迭 ��ü�� 0���� �ʱ�ȭ
	dp[1] = arr[1];//1�� ��� �ʱ�ȭ
	dp[2] = arr[1] + arr[2];//2�� ��� �ʱ�ȭ
	for (int i = 3; i <= n; i++) {
		dp[i] = MAX(dp[i - 2] + arr[i], MAX(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 1]));
		/*
		dp[i] : i��°���� �ֿ��� �� �ִ�� �ֿ� �� �ִ� ��
		1. dp[i - 2] + money[i]
		2. dp[i - 3] + money[i-1]+ money[i]
		3. dp[i - 1]
		�� �ִ��� dp[i]�� ������.
		*/
	}//3���� n ���� dp���� ���
	return dp[n];
}

int main() {
	int n;
	scanf("%d", &n);
	int money[30001] = { 0, };//money �迭 ���� �� �迭 ��ü�� 0���� �ʱ�ȭ
	for (int i = 1; i <= n; i++) {
		scanf("%d", &money[i]);
	}//money �迭�� �Է� ����

	printf("%d\n", solution(n, money));//�ִ� ���
}