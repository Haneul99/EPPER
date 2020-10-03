package EPPER_2018_JAVA;
import java.util.*;
public class Q5_2018 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int arr[]=new int[8];
		for(int i=0;i<8;i++) {
			arr[i]=input.nextInt();
		}
		boolean asc=false;
		boolean dec=false;
		for(int i=0;i<7;i++) {
			if(arr[i]<arr[i+1]) asc=true;
			if(arr[i]>arr[i+1]) dec=true;
		}
		if(asc==true && dec==true) System.out.println("mixed");
		else if(asc==true && dec==false) System.out.println("ascending");
		else System.out.println("descending");
	}
}
