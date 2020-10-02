import java.util.*;

public class Q7_2019 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int R, C, ZR, ZC;
		R=input.nextInt();
		C=input.nextInt();
		ZR=input.nextInt();
		ZC=input.nextInt();
		input.nextLine();
		String str[]=new String[R];
		String arr[]=new String[R*ZR];//»Æ¥Î«— txt
		for(int i=0;i<R;i++) {
			str[i]=input.nextLine();
			arr[i*ZR]="";
			if(ZC!=1) {
				for(int j=0;j<C;j++) {
					for(int k=0;k<ZC;k++)
						arr[i*ZR]+=str[i].charAt(j);
				}
			}
			else {
				arr[i*ZR]=str[i];
			}
			if(ZR!=1) {
				for(int j=1;j<ZR;j++) {
					arr[i*ZR+j]="";
					arr[i*ZR+j]=arr[i*ZR];
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
