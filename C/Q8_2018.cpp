#include<stdio.h>
#include<string.h>


int main() {
	char str[101];
	scanf("%s", str);
	char abc[4] = { 'a','b','c' };
	if (strlen(str) % 7 != 0) {
		int i = 0;
		int j = 0;
		while (strlen(str) % 7 != 0) {
			i = strlen(str);
			str[i] = abc[j % 3];
			str[i + 1] = NULL;
			j++;
		}
	}
	char amho[8];
	scanf("%s", amho);
	for (int i = 0; i < 7; i++) {
		amho[i] -= 1;
	}

	for (int i = 0; i < strlen(str)/7; i++) {
		for (int j = 0; j < 7; j++) {
			printf("%c", str[i * 7 + (int)amho[j]-48]);
		}
	}

}

//23Ка 4УЪ