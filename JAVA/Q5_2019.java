import java.util.*;
public class Q5_2019 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		String arr[]=new String[n];
		int num[]=new int[n];
		input.nextLine();
		String word;
		int min, idx;
		for(int i=0;i<n;i++) {
			arr[i]=input.next();
			num[i]=0;
		}
		for(int i=0;i<k;i++) {
			min=Integer.MAX_VALUE;
			idx=-1;
			word="";
			char alpha=input.next().charAt(0);
			for(int j=0;j<arr.length;j++) {
				if(arr[j].charAt(0)==alpha) {
					if(min>num[j]) {
						word=arr[j];
						min=num[j];
						idx=j;
					}
					else if(min==num[j]) {
						if(word.compareTo(arr[j])>0) {
							word=arr[j];
							min=num[j];
							idx=j;
						}
					}
				}
			}
			System.out.println(word);
			num[idx]++;
		}
	}
}
