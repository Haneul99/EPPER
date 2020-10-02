import java.util.*;
public class Q1_2019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if((n%4==0&&n%100!=0)|| n%400==0) System.out.println("T");
		else System.out.println("F");
	}

}
