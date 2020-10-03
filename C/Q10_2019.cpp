#include<stdio.h>
#include<string.h>


int main() {
	int n;
	scanf("%d", &n);
	char prefix[1001];
	int alpha[26] = { 0, };
	for (int i = 0; i < n; i++) {
		int pre_alpha[26] = { 0, };
		scanf(" %s", prefix);
		for (int j = 0; j < strlen(prefix); j++) {
			pre_alpha[(int)prefix[j] - 97]++;
		}
		for (int j = 0; j < 26; j++) {
			if (pre_alpha[i] > alpha[i]) alpha[i] = pre_alpha[i];
		}
	}
	int sum = 0;
	for (int i = 0; i < 26; i++) {
		sum += alpha[i];
	}
	printf("%d\n", sum+1);
	
}