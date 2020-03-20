import java.lang.Math;
import java.math.MathContext;
import java.math.*;
import java.util.Scanner;
public class git {

	public static void main(String[] args) {
		int k=0;
		Scanner input=new Scanner(System.in);
System.out.println("Enter lower and upper limit to check prime no between them");
int a=input.nextInt();
int b=input.nextInt();
for(int i=a;i<=b;i++) {
	for(int j=1;j<=i;j++) {
		if(i%j==0) {
			k++;
		}
	}if (k==2) {
		System.out.println(i);
	}
	k=0;
}
	}

}
