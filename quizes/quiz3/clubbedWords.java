/*
 Return all the clubbed words
 
Input: words =["mat","mate","matbellmates","bell","bellmatesbell","butterribbon","butter","ribbon"] Output: ["matbellmates","bellmatesbell","butterribbon"] 
 */
package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class clubbedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner o = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = o.nextInt();
		System.out.println("Enter array : ");
		String str[] = new String[n];
		for(int i=0;i<n;i++) {
			str[i] = o.next();
		}
		Arrays.sort(str, (a, b)->Integer.compare(b.length(), a.length()));
		ArrayList<String>arr = new ArrayList<>();
		arr.add(str[0]);int j=1;
		int i=1;int flag;
		while(i<n) {
			flag = 1;
			for(int k=0;k<j;k++) {
				if(arr.get(k).indexOf(str[i])!=-1) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				arr.add(str[i]);
				j++;
			}
			i++;
		}
		System.out.println(arr);
		o.close();
	}

}
