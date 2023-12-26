/*
Input: AAABBC
Output: A3B2C

Input: AAABBCCCDE
Output: A3B2C3DE
 */

package quiz;

import java.util.Scanner;

public class CompressionOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("Enter string : ");
		String str = o.next();
		int i = 1;int c = 1;
		char ch = str.charAt(0);
		while(i<str.length()) {
			if(ch == str.charAt(i))
				c++;
			else {
				if(c>1)
					System.out.print(ch+""+c);
				else
					System.out.print(ch);c = 1;
				ch = str.charAt(i);
			}
			i++;
		}
		if(c>1)
			System.out.print(ch+""+c);
		else
			System.out.print(ch);
		o.close();
	}

}
