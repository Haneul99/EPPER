import java.util.*;
public class Q9_2019 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int num[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				num[i][j]=input.nextInt();
		}
		
		int dp[][]=new int[n+1][n+1];
		int max=0;
		dp[1][1]=num[1][1];
		dp[2][1]=dp[1][1]+num[2][1];
		dp[2][2]=dp[1][1]+num[2][2];
		for(int i=3;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1) dp[i][1]=dp[i-1][1]+num[i][1];
				else if(j==i) dp[i][i]=dp[i-1][i-1]+num[i][i];
				else dp[i][j]=Math.max(dp[i-1][j-1],dp[i-1][j])+num[i][j];
				if(max<dp[i][j]) max=dp[i][j];
			}
		}
		System.out.println(max);
	}
}
/*
5
6
1 2
3 7 4
9 4 1 7
1 7 5 9 4


5
1
2 4
8 16 8
32 64 32 64
128 256 128 256 128
*/
