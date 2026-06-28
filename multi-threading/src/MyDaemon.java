
public class MyDaemon extends Thread {
		private int limit;
		
		public MyDaemon(int limit, String name) {
			super(name);
			this.limit = limit;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			String tname = Thread.currentThread().getName();

			for (int c = 1; c <= limit; c++) {
			    System.out.println(tname + ": " + c);
			}
			  System.out.println(tname + " finished");
		}
		
		public static void main(String[] args) {
			MyDaemon d1 = new MyDaemon(50, "first");
			MyDaemon d2 = new MyDaemon(100, "Second");
			MyDaemon d3 = new MyDaemon(150, "Third");
			MyDaemon d4 = new MyDaemon(100000, "Daemon");
			
			d4.setDaemon(true);
			
			d1.start();
			d2.start();
			d3.start();
			d4.start();
			
		}
		
}
