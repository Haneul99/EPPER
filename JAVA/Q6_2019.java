import java.util.*;
public class Q6_2019 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
		double x_out=0, y_out=0;
		if(x==0 || y==0) {
			if(x==0 && y==0) {
				x_out=125;
				y_out=125;
			}
			else if(x==0) {
				x_out=250*250/420.0;
				y_out=250-x_out;
			}
			else if(y==0) {
				y_out=250*250/420.0;
				x_out=250-y_out;
			}
		}
		else {
			if(y==125) x_out=y_out=0;
			else if(y>125) {
				x_out=250-(250.0*250/(2*y));
				y_out=0;
			}
			else {
				y_out=250-(250.0*250/(2*x));
				x_out=0;
			}
		}
		System.out.printf("%.2f %.2f",x_out,y_out);
	}
}
