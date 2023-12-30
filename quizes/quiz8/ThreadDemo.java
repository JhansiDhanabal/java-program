package quiz;

public class ThreadDemo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo thread = new ThreadDemo();
		Thread thread1 = new Thread(thread, "Thread 1");
		Thread thread2 = new Thread(thread, "Thread 2");
		thread1.start();
		thread2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
