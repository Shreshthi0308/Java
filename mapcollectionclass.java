package Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 
public class mapcollectionclass {
 
	public static void main(String[] args) {
		Map map = new HashMap();
 
		//Adding elements in the map
		
		map.put("name", "Harry");
		map.put("age", "20");
		map.put("email", "harry@gmail.com");
		map.put("city", "Pune");
		map.put("name", "Tom");
		
		System.out.println(map);
		//Traversing
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey()+":"+ entry.getValue());
			
		}
		
	}
 
}
 
 