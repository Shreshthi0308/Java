package Collections;
import java.util.*;
public class TestSort1 {

	public static void main(String[] args) {
		ArrayList<Students> al=new ArrayList<Students>();
		
		al.add(new Students(101,"Vijay",23));
		al.add(new Students(106,"Ajay",27));
		al.add(new Students(105,"jai",21));
		
		Collections.sort(al);
		
		for(Students st:al)
		{
			System.out.println(st.rollno+ " "+st.name+  " "+st.age);
		}
		

	}

}
