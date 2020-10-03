package EPPER_2018_JAVA;
import java.util.*;
public class Q4_2018 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<=n/2+1;i++) {
			for(int j=n/2+1-i;j>0;j--) System.out.printf(" ");
			for(int j=1;j<=2*i-1;j++) System.out.printf("*");
			System.out.println();
		}
		for(int i=n/2-1;i>=0;i--) {
			for(int j=n/2-i;j>0;j--) System.out.printf(" ");
			for(int j=0;j<=2*i;j++) System.out.printf("*");
			System.out.println();
		}
	}
}

/*
bb*		
b***	
*****	2i-1¹øÀÇ º°Âï±â
b***
bb*
*/

