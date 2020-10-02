import java.util.*;
public class Q3_2019 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		String str2=input.next();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		int str1_A[]=new int[26];
		int str2_A[]=new int[26];
		for(int i=0;i<26;i++) {
			str1_A[i]=0;
			str2_A[i]=0;
		}

		if(str1.length()!=str2.length()) System.out.println("F");
		else {
			for(int i=0;i<str1.length();i++) {
				str1_A[str1.charAt(i)-'a']++;
				str2_A[str2.charAt(i)-'a']++;
			}
			boolean check=true;
			for(int i=0;i<26;i++) {
				if(str1_A[i]!=str2_A[i]) {
					check=false;
					break;
				}
			}
			if(check==true) System.out.println("T");
			else System.out.println("F");
		}
		
		
	}
}
