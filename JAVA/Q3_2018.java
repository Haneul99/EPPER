import java.util.*;
public class Q3_2018 {

	public static void main(String[] args) {
		String result="";
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		result+=str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)=='-') result+=str.charAt(i+1);
		}
		System.out.println(result);
	}
}
