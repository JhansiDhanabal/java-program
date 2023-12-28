package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class PartitionOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n = o.nextInt();
		System.out.println("Enter array : ");
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = o.nextInt();
		}
		System.out.println("Enter partition size : ");
		int size = o.nextInt();
		System.out.println("Enter order size : ");
		int order_size = o.nextInt();
		int order[] = new int[order_size];
		System.out.println("Enter partition order : ");
		for(int i=0; i<order_size; i++) {
			order[i] = o.nextInt();
		}
		ArrayList<ArrayList<Integer>>res = new ArrayList<>();
		int i=0;
		while(i<n) {
			res.add(new ArrayList<>());
			for(int j=0;j<size && i<n;j++) {
				res.get(res.size()-1).add(arr[i]);
				i++;
			}
		}
		for(i=0;i<order_size;i++) {
			for(int val:res.get(order[i]-1))
				System.out.print(val+" ");
		}
		o.close();
	}

}
