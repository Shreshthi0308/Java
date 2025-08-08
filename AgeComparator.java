package Collections;
import java.util.*;
public class AgeComparator implements Comparator {
	public int compare(Object o1,Object o2)
	{
		Students s1=(Students)o1;
		Students s2=(Students)o2;
		
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}

}
