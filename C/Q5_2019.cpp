#include<stdio.h>

int main() {
	char RRN[20];
	scanf("%s", RRN);
	char year[5]="";
	char month[3]="";
	char day[3]="";
	char sex;
	for (int i = 0; i < 14; i++) {
		if (RRN[7] == '1') {
			sex = 'M';
			year[0] = '1';
			year[1] = '9';
		}
		else if (RRN[7] == '2') {
			sex = 'F';
			year[0] = '1';
			year[1] = '9';
		}
		else if (RRN[7] == '3') {
			sex = 'M';
			year[0] = '2';
			year[1] = '0';
		}
		else if (RRN[7] == '4') {
			sex = 'F';
			year[0] = '2';
			year[1] = '0';
		}
		year[2] = RRN[0];
		year[3] = RRN[1];
		month[0] = RRN[2];
		month[1] = RRN[3];
		day[0] = RRN[4];
		day[1] = RRN[5];
	}
	printf("%s-%s-%s %c\n",year,month,day,sex);
	

}