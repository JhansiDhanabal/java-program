package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class duplicate_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = o.nextInt();
		int arr[] = new int[n];int i;int j=0;
		System.out.println("Enter array element : ");
		for(i=0;i<n;i++) {
			arr[i] = o.nextInt();
		}
		i=0;
		while(i<n) {
			while(i+1<n && arr[i]==arr[i+1]) {
				i++;
			}
			arr[j++]=arr[i];
			i++;
		}
		arr = Arrays.copyOfRange(arr, 0, j);
		System.out.println("No. of unique elements = "+arr.length);
		o.close();
	}

}
