package lecture3;
import java.util.Scanner;
public class consecutiveduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String str = s.next();
		String str1="";
		int count = 1;
	for(int i=0;i<str.length()-1;i++) {
		if(str.charAt(i)==str.charAt(i+1)) {
			if(i+2==str.length()) {
			str1 = str1+str.charAt(i);
			}
	count = count+1;
	continue;
		}
		else {
			str1 = str1 + str.charAt(i);
			if(i+2==str.length()) {
				str1 = str1+str.charAt(i+1);
				}
		}
	}
	System.out.println(str1);
	}
}
