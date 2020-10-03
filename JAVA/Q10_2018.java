package EPPER_2018_JAVA;
import java.util.*;
public class Q10_2018 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int r=input.nextInt();
		int time[]=new int[n+1];
		int relation[][]=new int[n+1][r+1];
		int result[]=new int[n+1];
		for(int i=1;i<=n;i++) {
			time[i]=input.nextInt();
		}
		int indegree[]=new int[n+1];
		for(int i=0;i<r;i++) {
			int pre=input.nextInt();
			int next=input.nextInt();
			relation[pre][next]=1;
			indegree[next]++;
		}
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			if(indegree[i]==0) {
				result[i]=time[i];
				list.add(i);
			}
		}
		while(!list.isEmpty()) {
			int q=list.poll();
			for(int j=1;j<=n;j++) {
				if(relation[q][j]==1) {
					indegree[j]--;
					if(indegree[j]==0) list.add(j);
					result[j]=Math.max(result[j], result[q]+time[j]);
				}
			}
		}
		System.out.println(result[n]);
	}
}
