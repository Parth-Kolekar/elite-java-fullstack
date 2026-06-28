import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GoRunnable implements Runnable{
	private final long countUntil;
	
	  GoRunnable(long countUntil) {
		// TODO Auto-generated constructor stub
		  this.countUntil = countUntil;
			
	}
	
@Override
	public void run() {
		// TODO Auto-generated method stub
	long sum =0;
	for(long i=0;i<countUntil;i++) {
		sum+=i;
		
	}
	System.out.println(sum);
		
	}
}

public class ExecutorDemo {

    private static final int NTHREADS = 10;

    public static void main(String[] args) {
    		//creating thread pool
        ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) { //500 threads to be executed

            Runnable worker = new GoRunnable(100000000L + i);
            executor.execute(worker);	// assigning tasks to pooled thread
        }

        // This will make the executor accept no new threads
        // and finish all existing threads in the queue.
        executor.shutdown();
//        	wait until all threads are finish
//        		executor.awaitTermination()
        
        while(!executor.isTerminated()) {
        	
        }
        long end = System.currentTimeMillis();
        System.out.println("Finished all threads in "+ (end-start));
 
    }
}
