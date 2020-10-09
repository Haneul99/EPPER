package EPPER_2018_JAVA;
import java.util.*;
public class Q9_2018 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1=input.nextInt();
		int n2=input.nextInt();
		int min=Math.min(n1, n2);
		for(int i=1;i<=min;i++) {
			boolean chk=isPossible(n1,n2,i);
			if(chk==true) System.out.printf("%d ",i);			
		}
	}
	public static boolean isPossible(int nVal, int mVal, int p) {
		int []n=new int[3];
		int []m=new int[3];
		for(int i=0;i<3;i++) {
			n[i]=(nVal-i)%p;
			m[i]=(mVal-i)%p;
		}
		boolean check=(
				(n[2]==0 && m[0]==0) ||
				(n[0]==0 && m[2]==0) || 
				(n[1]==0 && m[1]==0) ||
				(n[0]==0 && n[2]==0 && m[1]==0) || 
				(n[1]==0 && m[0]==0 && m[2]==0))
				? true : false;
		//20, 02, 11, 012, 102
		return check;
	}
}

//http://blog.daum.net/rhaoslikesan/182
