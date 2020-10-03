import java.util.*;
public class Q2_2018 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int number;
		int room;
		if(n%15==0) {
			room=n/15;
			number=15;
		}
		else {
			room=n/15+1;
			number=n%15;
		}
		System.out.println(room+" "+number);
		//1~15 : 1
		//16~30 : 2
	}
}
