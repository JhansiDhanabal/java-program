/*
 Input: [10,3,5,12,17,22]
Output:
[10,12,22]
[3,5,7]
 */

package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = o.nextInt();
		System.out.println("Enter array : ");
		int arr[] = new int[n];
		int odd[] = new int[n];int k = 0;
		int even[] = new int[n];int l = 0;
		for(int i=0;i<n;i++) {
			arr[i] = o.nextInt();
			if(arr[i]%2 == 0)
				even[l++] = arr[i];
			else
				odd[k++] = arr[i];
		}
		odd = Arrays.copyOfRange(odd, 0, k);
		even = Arrays.copyOfRange(even, 0, l);
		System.out.println(Arrays.toString(odd));
		System.out.println(Arrays.toString(even));
		o.close();
	}

}
