package lecture3;
import java.util.Scanner;
public class waveprint {
public static void waveprint(int[][] arr,int i) {
	if(i==arr[0].length) {
		return;
	}
	if(i%2==0) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j][i]+" ");
		}	
	}
	else {
		for(int j=arr.length-1;j>=0;j--) {
			System.out.print(arr[j][i]+" ");
		}
	
	}
	waveprint(arr,i+1);
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
waveprint(arr,0);
	}

}
