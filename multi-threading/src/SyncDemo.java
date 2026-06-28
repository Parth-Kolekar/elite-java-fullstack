
public class SyncDemo implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		print(name);
	}
	
	public synchronized void print(String name) {
		try {
			System.out.println("[");
			Thread.sleep(1000);
			System.out.println(name);
			Thread.sleep(1000);
			System.out.println("]");
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		
		Thread t1 = new Thread(sd,"First");
		Thread t2 = new Thread(sd,"Second");
		Thread t3 = new Thread(sd,"Third");
		
		t1.start();
		t2.start();
		t3.start();
//		sd.run();
	}

}
