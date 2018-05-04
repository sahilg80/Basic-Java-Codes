package lecture3;
import java.util.Scanner;
public class spiral_print {
public static void Spiral(int[][] arr) {
	if(arr.length==1) {
		for(int i=0;i<arr[0].length;i++) {
			System.out.println(arr[0][i]);
	}
		return;
		}
	for(int i=0;i<arr[0].length;i++) {
		System.out.println(arr[0][i]);
	}
	
	int m = arr[1].length;
	int n = arr.length-1;
	int[][] arr1 = new int[m][n];
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			arr1[i][j] = arr[j+1][m-1-i];
		}
	}
Spiral(arr1);
return;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int m = s.nextInt();
int n = s.nextInt();
int arr[][] = new int[m][n];
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			arr[i][j] = s.nextInt();
		}
	}
	Spiral(arr);
	}

}
