package Collections;
import java.util.*;

public class StackCollection {

	public static void main(String[] args) {
		Stack<String> s= new Stack<String>();
		
		s.push("Mital");
		s.push("Miathili");
		s.push("mina");
		s.push("mohini");
		
		s.push("nutan");
		s.add("nisha");
		System.out.println(s.peek());
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
