package Collections;
import java.util.*;
public class NameComparator implements Comparator {
	public int compare(Object o1,Object o2)
	{
		Students s1=(Students)o1;
		Students s2=(Students)o2;
		
		return s1.name.compareTo(s2.name);
	}

}
