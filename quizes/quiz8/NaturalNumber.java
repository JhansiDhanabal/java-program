package quiz;

import java.util.Scanner;

public class NaturalNumber implements Runnable{
	int n;
	boolean flag;
	private NaturalNumber(int n, boolean flag) {
		this.n = n;
		this.flag = flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("N = ");
		int n = o.nextInt();
		NaturalNumber odd = new NaturalNumber(n, true);
		NaturalNumber even = new NaturalNumber(n, false);
		Thread thread1 = new Thread(odd);
		Thread thread2 = new Thread(even);
		
		thread2.start();
		thread1.start();
		o.close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int start = flag?1:2;
		for(int i=start;i<=n;i+=2) {
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
