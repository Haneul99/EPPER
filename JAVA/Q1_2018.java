import java.util.*;
public class Q1_2018 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=input.nextInt();
		}
		int a=input.nextInt();
		int b=input.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++) sum+=num[i-1];
		System.out.println(sum);
	}
}
