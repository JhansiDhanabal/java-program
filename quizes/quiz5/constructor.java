package quiz;

import java.util.*;
import java.util.Scanner;

public class arrays_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = o.nextInt();
		System.out.println("Enter arr[] :");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = o.nextInt();
		}
		int neg=0;
		ArrayList<Integer>pos=new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				pos.add(arr[i]);
			}
			else {
				arr[neg++] = arr[i];
			}
		}
		int i=0;
		while(neg<n) {
			arr[neg] = pos.get(i);
			i++;
			neg++;
		}
		System.out.println(Arrays.toString(arr));
		o.close();
	}

}
