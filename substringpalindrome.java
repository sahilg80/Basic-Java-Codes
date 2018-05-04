package lecture3;
import java.util.Scanner;
public class substringpalindrome {
	public static boolean palindrome(String str) {
		int i=0,j=str.length()-1;
		while(i<j) {
		if(str.charAt(j)==str.charAt(i)) {
		i++;
		j--;
	}
		else {
			return false;
		}
	    }		
		return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
String str = s.next();
int a = 0;
for(int i=0;i<str.length();i++) {
	String str1 = "";
	for(int j=i;j<str.length();j++) {
		str1 = str1 + str.charAt(j);
		if( palindrome(str1)) {
			a =a+1;
		}
	}
}
System.out.println(a);
}
}
