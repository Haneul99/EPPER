import java.util.*;
public class Q2_2019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		double avg=0;
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=input.nextInt();
			avg+=array[i];
		}
		avg/=n;
		double count=0;
		for(int i=0;i<n;i++) {
			if(avg<array[i]) count++;
		}
		System.out.printf("%.3f%%",count/n*100);
	}

}
