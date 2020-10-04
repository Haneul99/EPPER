#include<stdio.h>

typedef struct XY {
	int x;
	int y;
}XY;

int main() {
	XY n[4];
	for(int i=0;i<3;i++)
		scanf("%d %d", &n[i].x, &n[i].y);
	if (n[0].x == n[1].x) n[3].x = n[2].x;
	else if (n[0].x == n[2].x) n[3].x = n[1].x;
	else if (n[1].x == n[2].x)n[3].x = n[0].x;
	if (n[0].y == n[1].y) n[3].y = n[2].y;
	else if (n[0].y == n[2].y) n[3].y = n[1].y;
	else if (n[1].y == n[2].y)n[3].y = n[0].y;
	
	printf("%d %d", n[3].x, n[3].y);
}

//9Ка 47УЪ
