import java.util.*;

public class Q4_2019 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int result=0;
		if(n>m) result=2*(m-1);
		else result=2*(n-1);
		System.out.println(result);
	}
}
