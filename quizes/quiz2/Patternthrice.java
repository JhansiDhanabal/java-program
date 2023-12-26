/* pattern
z o h o c o r
          p
        o
      r
    a
  t
i o n t e a m 
*/
package quiz;

import java.util.Scanner;

public class Patternthrice {
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = o.next();
		int n = str.length();
		for(int i=0;i<=n/3;i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		int j = n/3-1;
		for(int i=n/3+1;i<2*n/3;i++) {
			for(int k=0;k<j;k++) {
				System.out.print("  ");
			}
			System.out.println(str.charAt(i));
			j-=1;
		}
		for(int i=2*n/3;i<n;i++) {
			System.out.print(str.charAt(i)+" ");
		}
		o.close();
	}
}
