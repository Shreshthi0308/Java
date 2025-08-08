package Collections;

import java.util.*;
import java.util.Map.Entry;

public class MapCollection {
   
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
	    m.put(101, "Nisha");
	    m.put(102, "Tara");
	    m.put(103, "Aaliya");
	    m.put(104, "Tanishka");
	    
	    for(Map.Entry map: m.entrySet())
	    {
	    	System.out.println(map.getKey()+" " +map.getValue());
	    }

	}

}
