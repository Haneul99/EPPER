#include<stdio.h>

int main() {
	int n1, n2, n3;
	scanf("%d", &n1);
	scanf("%d", &n2);
	scanf("%d", &n3);
	int sum;
	scanf("%d", &sum);
	int count = 0;
	if (n1 == sum) count++;
	if (n2 == sum)  count++;
	if (n3 == sum)count++;
	if (n1 + n2 == sum) count++;
	if (n2 + n3 == sum)count++;
	if (n3 + n1 == sum)count++;
	if (n1 + n2 + n3 == sum) count++;
	printf("%d\n", count);

}