package lecture1;
import java.util.Scanner;
public class startrianglepattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1,k,b;
		while(i<=n) {
			int j=0;
			while(j<n-i) {
			System.out.print(" ");
			j=j+1;
			}
			k=i;
			while(k<=((2*i)-1)) {
				System.out.print("*");
				k=k+1;
			}
			 b=k-1;
			while(b>k-i) {
				System.out.print("*");
				b=b-1;
			}
		System.out.println();
			i=i+1;
		}
	
	}

}
