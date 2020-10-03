#include<stdio.h>

int main() {
	int m;
	scanf_s("%d", &m);
	int n;
	scanf_s("%d", &n);
	int num = 0;
	int var = 0;
	int money = m - n;
	while (money >= 10) {
		if (money >= 50000) {
			num += money / 50000;
			money %= 50000;
			var++;
		}
		else if (money >= 10000) {
			num += money/10000;
			money %= 10000;
			var++;
		}
		else if (money >= 5000) {
			num += money / 5000;
			money %= 5000;
			var++;
		}
		else if (money >= 1000) {
			num += money / 1000;
			money %= 1000;
			var++;
		}
		else if (money >= 500) {
			num += money / 500;
			money %= 500;
			var++;
		}
		else if (money >= 100) {
			num += money / 100;
			money %= 100;
			var++;
		}
		else if (money >= 50) {
			num += money / 50;
			money %= 50;
			var++;
		}
		else if (money >= 10) {
			num += money / 10;
			money %= 10;
			var++;
		}
	}
	printf("%d %d", var, num);
}