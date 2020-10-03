package EPPER_2018_JAVA;
import java.util.*;
public class Q6_2018 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		String str2=input.next();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		int str1_al[]=new int[26];
		int str2_al[]=new int[26];
		for(int i=0;i<26;i++) {
			str1_al[i]=0;
			str2_al[i]=0;
		}
		boolean check=true;
		if(str1.length()!=str2.length())System.out.println("No");
		else {
			for(int i=0;i<str1.length();i++) {
				str1_al[(int)str1.charAt(i)-97]++;
			}
			for(int i=0;i<str2.length();i++) {
				str2_al[(int)str2.charAt(i)-97]++;
			}
			for(int i=0;i<26;i++) {
				if(str1_al[i]!=str2_al[i]) {
					check=false;
				}
			}
			if(check==true) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
