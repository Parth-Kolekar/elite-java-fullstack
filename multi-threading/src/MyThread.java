
public class MyThread extends Thread {
	private int data;

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread ct = Thread.currentThread();
		String tname = ct.getName();
		
		for(int c=1;c<=50;c++) {
			System.out.println(tname +": "+ ++data);
		}
	}
	
	public static void main(String[] args) {
		MyThread t1= new MyThread("First");
		MyThread t2= new MyThread("Second");
		MyThread t3= new MyThread("Third");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		Thread ct = Thread.currentThread();
		String tname = ct.getName();
		
		for(int c=1;c<=50;c++) {
			System.out.println(tname +": "+ c);
		}
	}
	
	
	
}
