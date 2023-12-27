/*
 Given the list of array return array in which each element is the product of other element except ith element (try to do it without division operation)
 input: [1,2,3,4] 
output:[24,12,8,6]
 */
package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = o.nextInt();
		System.out.println("Enter array element : ");
		int arr[] = new int[n];
		int p = 1;
		for(int i=0;i<n;i++) {
			arr[i] = o.nextInt();
			p *= arr[i];
		}
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = p/arr[i];
		}
		System.out.println(Arrays.toString(a));
		o.close();
	}

}
