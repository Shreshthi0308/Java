package Collections;
import java.util.*;
public class vectorcollection {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("shreya");
		v.add("suhana");
		v.add("sneha");
		v.addAll(v);
		
		System.out.println(v);
		Iterator<String> itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
