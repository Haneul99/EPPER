package EPPER_2018_JAVA;
import java.util.*;
public class Q9_2018 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1=input.nextInt();
		int n2=input.nextInt();
		int min=Math.min(n1, n2);
		int tile=2*(n1+n2)-4;
		for(int i=1;i<=min;i++) {
			if(i==1) {
				System.out.printf("1 ");
				continue;
			}
			if(tile%i==0) {
				
				if(n1%i==0) {//���θ� �� ä�� ���
					if((n2-2)%i==0) {
						System.out.printf("%d ",i);
						continue;
					}//���θ� �� ä�� ���
					else if((n2-1)%i==0) {
						if((n1-2)%i==0) {
							System.out.printf("%d ",i);
							continue;
						}
					}//���θ� �� ĭ ���� ���
				}
				
				else if(n1%i==1) {
					if((n2-1)%i==0) {
						System.out.printf("%d ",i);
						continue;
					}
					else if((n2-2)%i==0 && n2%i==0) {
						System.out.printf("%d ",i);
						continue;
					}
				}
				
				else if(n1%i==2) {
					if(n2%i==0) {
						System.out.printf("%d ",i);
						continue;
					}
				}
				
			}
		}
	}
}
