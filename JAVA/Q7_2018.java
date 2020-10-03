package EPPER_2018_JAVA;
import java.util.*;
public class Q7_2018 {
	public static void main(String[] args) {
		int num[]=new int[9];
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<9;i++) {
			num[i]=input.nextInt();
			sum+=num[i];
		}
		int subsum=sum-100;
		int nota=0, notb=0;
		for(int i=0;i<8;i++) {
			for(int j=i+1;j<9;j++)
				if(num[i]+num[j]==subsum) {
					nota=i;
					notb=j;
					break;
				}
		}
		for(int i=0;i<9;i++) {
			if(i!=nota && i!=notb) System.out.printf("%d ",num[i]);
		}
	}
}
