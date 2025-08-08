package Collections;
import java.util.*;
import java.io.*;
public class Simple {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(new Students(101,"Vijay",23));
		al.add(new Students(106,"Ajay",27));
		al.add(new Students(105,"jai",21));
		
		System.out.println("Sorting by Name");
		Collections.sort(al,new NameComparator());
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Students st=(Students)itr.next();
			System.out.println(st.rollno+""+st.name+""+st.age);
		}
    
		System.out.println("Sorting by age");
		
		Collections.sort(al,new AgeComparator());
		Iterator itr1=al.iterator();
		while(itr1.hasNext())
		{
			Students st=(Students)itr1.next();
			System.out.println(st.rollno+""+st.name+""+st.age);
		}
		
	}

}
