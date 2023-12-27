/*
 Given an array list return all possible permutations Input: nums = [1,4,3] 
Output: [[1,4,3],[1,3,4],[4,1,3],[4,3,1],[3,1,4],[3,4,1]]  
 */
package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class PermutaionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		int n;
		System.out.println("Enter n : ");
		n = o.nextInt();
		System.out.println("Enter arr[] : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i] = o.nextInt();
		permute(arr,0,n-1);
		o.close();
		
	}
	public static void swap(int arr[],int s,int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}
	public static void permute(int arr[],int s,int e) {
		if(s==e) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=s;i<=e;i++) {
			swap(arr,s,i);
			permute(arr,s+1,e);
			swap(arr,s,i);
		}
	}
}
