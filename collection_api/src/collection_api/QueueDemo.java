package collection_api;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		
		q.offer("Apple");
		q.offer("Banana");
		q.offer("Guava");
		
		System.out.println(q.peek()); //fetch and doesnt remove
		
		while(!q.isEmpty())
			System.out.println(q.poll()); //fetch and remove from queue
		
		Deque<String> d = new LinkedList<String>();
		
		d.offerLast("Mango");
		d.offerLast("Chickoo");
		d.offerLast("Cherry");
		d.offerLast("Leeche");
		
		
		System.out.println("--- Dequeue-----");
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		
		d.offerFirst("Watermelon");
		d.offerFirst("Pineapple");
		
		for(String e:d)
			System.out.println(e);
	
		System.out.println("----------");
		
		d.removeFirst();
		d.removeLast();
		
		while(!d.isEmpty())
			System.out.println(d.pollFirst());
		
	};
}
