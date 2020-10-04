#include<stdio.h>

int num[20];
int n;

void sort() {
	int min;
	int temp;
	int idx;
	for (int i = 0; i < n; i++) {
		idx = i;
		min = num[i];
		for (int j = i + 1; j < n ; j++) {
			if (min > num[j]) {
				idx = j;
				min = num[j];
			}
		}
		temp = num[i];
		num[i] = num[idx];
		num[idx] = temp;
	}
}


int main() {
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &num[i]);
	}
	sort();
	double avg = (double)(num[0] + num[1]) / 2;
	for (int i = 2; i < n; i++) {
		avg = (double)(avg + num[i]) / 2;
	}
	printf("%.6f\n", avg);

}

//13Ка 58УЪ