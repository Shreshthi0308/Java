package Collections;
import java.util.*;
public class PriorityQueueCollection {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		pq.add("ananya");
		pq.add("anushka");
		pq.add("Divya");
		pq.add("suga");
		
		System.out.println(pq);
		System.out.println("Head:" +pq.element());
		System.out.println("Head:" +pq.peek());
		
		Iterator<String> itr =pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		pq.remove();
		pq.poll();

	}

}
