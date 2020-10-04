#include<stdio.h>

int main() {
	int n;
	scanf("%d", &n);
	int a = 2;
	int flag = 1;
	if (n == 2 || n == 3) {
		printf("1\n");
		return 0;
	}
	while (a < n && flag==1) {
		if (n%a == 0 && n / a != 1) flag = 0;
		a++;
	}
	if (flag == 0) printf("0\n");
	else printf("1\n");
}

//5Ка 32УЪ