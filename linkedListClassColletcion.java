package Collections;
import java.util.*;
public class linkedListClassColletcion {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Arya");
		ll.add("vedika");
		ll.add("shrutika");
		ll.add("suhani");
		ll.add("Arya");
		
		System.out.println(ll.contains(ll));
		
		ll.descendingIterator();
		ll.removeFirstOccurrence(ll);
		System.out.println(ll.contains(ll));
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
