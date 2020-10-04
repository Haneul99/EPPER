#include<stdio.h>


int main() {
	int n;
	scanf("%d", &n);
	int num[11] = { 0, };
	num[0] = 1;
	num[1] = 1;
	for (int i = 2; i <= n; i++) {
		for (int j = 1; j <= i; j++) {
			num[i] += num[i-j] * num[j-1];
		}
		
	}
	printf("%d", num[n]);
}

//´ä Ã£¾ÆºÃÀ½