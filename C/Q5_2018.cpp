#include<stdio.h>

int main() {
	int day;
	scanf("%d", &day);
	int n;
	scanf("%d", &n);
	int ans = 0;
	int ban1=day%10;
	int ban2;
	if(ban1==5) ban2=0;
	else if (ban1 < 5)ban2 = ban1 + 5;
	else ban2 = ban1 - 5;

	for (int i = 0; i < n; i++) {
		int car;
		scanf("%d", &car);
		if (car % 10 == ban1 || car % 10 == ban2) ans++;
	}
	printf("%d\n", ans);
}

//5ºĞ 22ÃÊ