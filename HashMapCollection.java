package Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashMapCollection {

	public static void main(String[] args) {
		Map<Integer,Book> map=new Hashtable<Integer,Book>();
		
		Book b1=new Book(101,"Let us C","Yashwant kanitakar","BPB",8);
		Book b2=new Book(102,"Data Communication & Networking","Forouzan","Mc Graw Hill",4);
		
		Book b3=new Book(103,"Operation System","Galvin","Wiley",6);
		
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		
		for(Map.Entry<Integer, Book> entry:map.entrySet())
		{
			int key=entry.getKey();
			Book b=entry.getValue();
			
			System.out.println(key+"Deatils:");
			System.out.println(b.id+""+b.name+""+b.publisher+""+b.author+""+b.quantity);

		}
	}

}
