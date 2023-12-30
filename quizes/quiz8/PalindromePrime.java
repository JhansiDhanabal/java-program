package quiz;

public class PalindromePrime implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime prime = new Prime(0,10);
		Palindrome palindrome = new Palindrome(10, 50);
		Thread thread1 = new Thread(palindrome);
		Thread thread2 = new Thread(prime);
		thread1.start();
		try {
			thread1.join();
		}catch(Exception e) {
			System.out.println();
		}
		thread2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
class Prime implements Runnable{
	int start;
	int end;
	Prime(int start, int end){
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("\nPrime number from "+start+" to "+end+" : ");
		
		for(int i=start;i<=end;i++) {
			if(isprime(i))
				System.out.print(i+" ");
		}
	}
	private boolean isprime(int num) {
		if(num<=1)
			return false;
		int i=2;
		while(i<num) {
			if(num%i == 0)
				return false;
			i++;
		}
		return true;
	}
	
}
class Palindrome implements Runnable{
	int start;
	int end;
	Palindrome(int start,int end){
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("\nPalindrome numbers from "+start+" to "+end+":");
		for(int i=start;i<=end;i++) {
			String orginal = String.valueOf(i);
			StringBuilder duplicate = new StringBuilder();
			duplicate.append(orginal);
			duplicate.reverse();
			if(orginal.equals(duplicate.toString()))
				System.out.print(i+" ");
		}
	}
}
