package EPPER_2018_JAVA;
import java.util.*;
public class Q8_2018 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]==1) System.out.println("1 1");
			else {
				int root=(int)Math.ceil(Math.sqrt(arr[i]));
				int start=(root-1)*(root-1)+1;
				if(root%2==0) {
					int x=1;
					int y=root;
					for(int j=1;j<root;j++) {
						if(start==arr[i]) break;
						else{
							start++;
							x++;
						}
					}//->����
					for(int j=1;j<root;j++) {
						if(start==arr[i]) break;
						else{
							start++;
							y--;
						}
					}//�Ʒ��� ����
					System.out.println(x+" "+y);
					
				}//¦����°��
				else {
					int x=root;
					int y=1;
					for(int j=1;j<root;j++) {
						if(start==arr[i]) break;
						else{
							start++;
							y++;
						}
					}//���� ����
					for(int j=1;j<root;j++) {
						if(start==arr[i]) break;
						else{
							start++;
							x--;
						}
					}//<- ����
					System.out.println(x+" "+y);
				}//Ȧ����°��
			}
		}
	}
}
