import java.util.*;

public class Q10_2019 {
	public static void main(String[] args) {
		char keyboard[]=new char[32];
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		input.nextLine();
		String str[]=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=input.nextLine();
		}
		String in=input.nextLine();
		for(int i=0;i<n;i++) {
			String subs=str[i].substring(0, in.length());
			if(subs.equals(in)) {
				char ch=str[i].charAt(in.length());
				keyboard[(int)ch-62]=ch;
			}
		}
		for(int i=0;i<32;i++) {
			if(keyboard[i]==0)
				System.out.printf("*");
			else
				System.out.printf("%c",keyboard[i]);
			if(i%8==7) System.out.println();
		}
	}
}
/*
4
ZAGREB
SISAK
ZADAR
ZABOK
ZA

4
SPLIT
VINKOVCI
NOVSKA
RIJEKA
VINKO

4
AAAABCD
AAAABCA
AAAACDE
AAAAAAA
AAAA
*/
