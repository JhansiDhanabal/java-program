/*
  Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.

Output:
Content of test.txt: -1 -2 -3 4 
Error: Positive number found: 4 
 */
package quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckPositive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filepath = "../jhansi/src/quiz/positive.txt";
		int[] numbers = readnumberfromfile(filepath);
		try {
			for(int num:numbers) {
				if(num>0)
					throw new PostiveException("Positive Number Found "+num);			
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static int[] readnumberfromfile(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line = br.readLine();
		String nums[] = line.split(" ");
		int[] number = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			number[i] = Integer.parseInt(nums[i]);
		}
		return number;
	}

}
class PostiveException extends Exception{
	PostiveException(String msg){
		super(msg);
	}
}
