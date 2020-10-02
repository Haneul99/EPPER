import java.util.*;

public class Q8_2019 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int arr[][]=new int[m+2][n+2];
		int next[][]=new int[m+2][n+2];
		for(int i=0;i<=m+1;i++) {
			for(int j=0;j<=n+1;j++) {
				if(i==0 || i==m+1 || j==0 || j==n+1) {
					arr[i][j]=-1;
					next[i][j]=-1;
				}
				else {
					arr[i][j]=input.nextInt();
					next[i][j]=arr[i][j];
				}
			}
		}
		int count=0;
		boolean flag=true;
		while(flag==true) {
			flag=false;
			for(int i=1;i<=m;i++) {
				for(int j=1;j<=n;j++) {
					if(arr[i][j-1]==1 || arr[i][j+1]==1 || arr[i-1][j]==1 || arr[i+1][j]==1) {
						if(arr[i][j]==0) {
							next[i][j]=1;
							flag=true;
						}
					}
				}
			}
			if(flag==true) {
				for(int i=0;i<m+2;i++) {
					for(int j=0;j<n+2;j++) {
						arr[i][j]=next[i][j];
					}
				}
				count++;
			}
		}
		
		for(int i=0;i<m+2;i++) {
			for(int j=0;j<n+2;j++) {
				if(arr[i][j]==0) count=-1;
			}
		}
		System.out.println(count);
	}
	
}

/*
6 4
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 1

6 4
0 -1 0 0 0 0
-1 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 1

5 5
-1 1 0 0 0
0 -1 -1 -1 0
0 -1 -1 -1 0
0 -1 -1 -1 0
0 0 0 0 0
*/
